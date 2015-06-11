/*
 * Copyright (c) 2012 IkChan Kwon kighie@gmail.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
grammar Ontolog;
 

options {
	language = Java;
	superClass = so.ontolog.formula.antlr.AbstractOntologHandlerParser;
}

// generate target dir : ./src/main/antlr
// use command line option : -package so.ontolog.formula.antlr

@parser::header {
	import java.util.List;
	import java.util.LinkedList;
	
	import so.ontolog.data.type.TypeSpec;
	import so.ontolog.formula.runtime.QName;
	import so.ontolog.formula.ast.*;
	import so.ontolog.formula.ast.util.*;
	import so.ontolog.formula.ast.stmt.ASTIfStatement;
	import so.ontolog.formula.ast.expr.ASTArrayExpr;
	import so.ontolog.formula.build.*;
}

/*
@rulecatch {
	catch (Exception ex) {
		ASTToken token = createASTToken();
		syntaxErrorHandler.buildError(token, ex);
	}
}
 */
 
ontologExpression returns [CompilationUnit result]
	: { $result = createModule(EXPR_MODULE); }
	( '[' paramDecl[$result]*  ']' )?
	'='
	( 
		( '(' expression ')' { $result.append( createEvalStmt (EVAL_EXPR_STMT, $expression.result) ) ; } )
		| ( expression { $result.append(createEvalStmt (EVAL_EXPR_STMT, $expression.result)) ; } )	
	)
	;

ontologScript returns [CompilationUnit result]
	: { $result = createModule(SCRIPT_MODULE); }
		importStatement*
		paramDecl[$result]*
		blockContents[$result]
		EOF
	  { endScope();}
	;



blockContents [ASTBlock stmtHolder]
	: 
	(
		variableDecl	{ $stmtHolder.append($variableDecl.result); }
		| methodCallStatement	{ $stmtHolder.append($methodCallStatement.result); }
		| functionCallStatement	{ $stmtHolder.append($functionCallStatement.result); }
		| ifStatement { $stmtHolder.append($ifStatement.result); }
		| foreachStatement { $stmtHolder.append($foreachStatement.result); }
		| whileStatement { $stmtHolder.append($whileStatement.result); }
		| assignStatement { $stmtHolder.append($assignStatement.result); }
		| functionDecl 	{ $stmtHolder.append($functionDecl.result); }
	)*
	( returnStatement { $stmtHolder.append($returnStatement.result); } )?
	;


/***************************************************
 * Script Statements  
 *************************************************** */
importStatement
	: (
		('importJava' qualifiedName END_OF_STMT { importJava($qualifiedName.result); } )
		| ('import' pathExpr  
			{ String alias = null; }
			( IDENT {	alias = $IDENT.text; })
			END_OF_STMT 
			{ importModule($pathExpr.path, alias); } 
		)
	)
	;

methodCallStatement  returns [ASTStatement result]
	: methodCallExp  { $result = asStatement($methodCallExp.result); }
	END_OF_STMT
	;
	
functionCallStatement  returns [ASTStatement result]
	: funcCallExp  { $result = asStatement($funcCallExp.result); } 
	END_OF_STMT
	;

returnStatement  returns [ASTStatement result]
	: 
	(
		( 'return' expression  END_OF_STMT { $result = returnStatement($expression.result); } )
		| ( 'return' END_OF_STMT { $result = returnStatement(null); } )
	)
	;


/**************************************** 
 * Conditional Statement
 ***************************************/
ifStatement returns [ASTIfStatement result]
	: 	
		'if' { beginScope(); } 
		'(' logicalExpression ')' 
		{
			$result = ifStatement(IF, $logicalExpression.result); 
		}
		'{'  blockContents[$result] '}'
		{	endScope(); }
	( 	'else' 'if' { beginScope(); } 
		'(' logicalExpression ')' 
		{ ASTBlock elseIfStmt = $result.createElseIf(createASTToken(ELSEIF), $logicalExpression.result); } 
		'{' blockContents[elseIfStmt] '}'
		{	endScope(); }
	)*
	( 'else' { beginScope(); } 
		{ ASTBlock elseStmt = $result.checkOutElse(createASTToken(ELSE)); }
		'{' blockContents[elseStmt] '}'
		{	endScope(); }
	)?
	;
	
/**************************************** 
 * LOOP Statement
 ***************************************/
foreachStatement returns [ASTBlock result]
	: 'foreach'  {	beginScope(); }
		'(' loopCondition  ')' 
		{ 	$result = loopStatement(FOREACH, $loopCondition.result);  }
		'{' blockContents[$result] '}'
		END_OF_STMT?
		{	endScope(); }
	;
	
	
loopCondition 	returns [ASTExpr result]
	: typeExpr IDENT 
		{ 
			ASTDeclaration varDecl = variableDecl(VAR_DECL, $typeExpr.result, $IDENT.text,null );
		}
	'in' iterableTerm
		{	
			$result = loopCondition(varDecl, $iterableTerm.result);
		}
	;


whileStatement returns [ASTBlock result]
	: 'while'  { beginScope(); }
		'(' logicalExpression  ')' 
		{ 	$result = loopStatement(WHILE, $logicalExpression.result);  }
		'{' blockContents[$result] '}'
		END_OF_STMT?
		{	endScope(); }
	;


/* *************************************
 * assign statement
 *************************************** */
assignStatement  returns [ASTStatement result]
	: 
	(
		leftAssign 	{ $result = $leftAssign.result ; }
		| rightAssign { $result = $rightAssign.result ; }
	)
	
	; 
 
leftAssign  returns [ASTStatement result]
	: { ASTExpr settable = null; }
	(
		IDENT 			{ settable = variable( $IDENT.text);}
		| qualifiedName	{ settable = variable($qualifiedName.result);}
	) 
	'=' expression END_OF_STMT
	{ $result = assignStatement(LEFT_ASSIGN_STMT, settable, $expression.result); }
	
	; 
 
rightAssign  returns [ASTStatement result]
	: { ASTExpr settable = null; } 
	expression 
	'->'
	(
		IDENT 			{ settable = variable( $IDENT.text);}
		| qualifiedName	{ settable = variable($qualifiedName.result);}
	)
	END_OF_STMT
	{ $result = assignStatement(RIGHT_ASSIGN_STMT, settable, $expression.result); }
	; 
 

/***************************************************
 * Declarations  
 *************************************************** */
paramDecl [CompilationUnit module] 
	: 'param' 
		{ String alias = null; }
		type = qualifiedName 
		name = IDENT
		('as' IDENT  { alias = $IDENT.text; })?
		{ $module.append( asStatement( paramDecl(PARAM_DECL, $type.result, $name.text, alias) ) ); }
		';'
	;
 
variableDecl returns [ASTStatement result]
	: { ASTExpr valueExpr = null; }
	typeExpr IDENT 
	( '=' expression {	valueExpr = $expression.result;  })?
	END_OF_STMT
	{	$result = asStatement(variableDecl(VAR_DECL, $typeExpr.result, $IDENT.text,valueExpr )); }
	;
	
/*********************************************
 * Function Decl
 ******************************************* */
functionDecl returns [ASTBlock result]
	: 'function' 
		{ 	beginScope();
			TypeSpec returnType = null; 
			List<ASTDeclaration> args = new LinkedList<ASTDeclaration>();
		}
		IDENT '(' argsDecl[args]? ')' ( ':' typeExpr { returnType = $typeExpr.result; })?
		{
			$result = functionDecl(FUNC_DECL,returnType, $IDENT.text, args );
		}
		'{'
		blockContents[$result]
		'}'
		END_OF_STMT?
		{	endScope(); }
	;


argsDecl [List<ASTDeclaration> args]
	: 
	(
		typeExpr IDENT { $args.add( variableDecl(ARG_DECL, $typeExpr.result, $IDENT.text, null ) ); }
		(
			',' typeExpr IDENT { $args.add( variableDecl(ARG_DECL, $typeExpr.result, $IDENT.text, null ) ); }
		)*
		
	)
	;



/***************************************************
 * EXPRESSIONS  
 *************************************************** */
expression returns [ASTExpr result]
	: 
	(
	operatorExpression { $result = $operatorExpression.result ; }
	) 
	;

funcCallExp returns [ASTExpr result]
	: 
	(IDENT '(' ')'  { $result = call(FUNC_CALL, null, $IDENT.text, null) ;} )
	| (IDENT '(' arguments ')'  { $result = call(FUNC_CALL, null, $IDENT.text, $arguments.argList) ;} )
	;

methodCallExp returns [ASTExpr result]
	: 
	(
		( qualifiedName'.' IDENT '(' ')'	
			{ $result = call(METHOD_CALL, variable( $qualifiedName.result), $IDENT.text, null) ; }
		)
		| ( qualifiedName'.' IDENT '(' arguments ')' 
			{ $result = call(METHOD_CALL, variable( $qualifiedName.result), $IDENT.text, $arguments.argList) ; }
		)
	)
	;

arguments  returns [List<ASTExpr> argList]
	: { $argList = new LinkedList<ASTExpr>(); }
		(arg2 = expression { $argList.add($arg2.result); })
		(',' arg2 = expression { $argList.add($arg2.result); } )*
	;

//TODO 
chooseExpr returns [ASTExpr result]
	: 'case' '(' formulaTerm ')'
	'{'
		( chooseWhenExpr ':' expression  END_OF_STMT )*
	'}'
	;
//TODO 
chooseWhenExpr returns [ASTExpr result]
	:
	(
		'=='  op2 = additiveExpression {$result = binary(OP_EQ, $result, $op2.result); }
		|'is'  op2 = additiveExpression {$result = binary(OP_EQ, $result, $op2.result); }
		|'!=' op2 = additiveExpression {$result = binary(OP_NOT_EQ, $result, $op2.result); }
		|'<>' op2 = additiveExpression {$result = binary(OP_NOT_EQ, $result, $op2.result); }
		|'is' 'not' op2 = additiveExpression {$result = binary(OP_NOT_EQ, $result, $op2.result); }
		|'>'  op2 = additiveExpression {$result = binary(OP_GT, $result, $op2.result); }
		|'>=' op2 = additiveExpression {$result = binary(OP_EQ_GT, $result, $op2.result); }
		|'<'  op2 = additiveExpression {$result = binary(OP_LT, $result, $op2.result); }
		|'<=' op2 = additiveExpression {$result = binary(OP_EQ_LT, $result, $op2.result); }
	)
	;
	
literalTerm  returns [ASTExpr result]
	: BOOLEAN 			{ $result = literal( LIT_BOOLEAN, $BOOLEAN.text); }
	| STRING_LITERAL	{ $result = literal( LIT_STRING,  strip($STRING_LITERAL.text)); }
	| NUMBER			{ $result = literal( LIT_NUMBER, $NUMBER.text); }
	| NULL				{ $result = literal( LIT_NULL, null); }
	;

pathExpr returns [String path] 
	:{ StringBuilder builder = new StringBuilder(); boolean isArray = false;}
	IDENT 	{ builder.append( $IDENT.text); }
	(
		('.' IDENT	{ builder.append(".").append( $IDENT.text); } )
		| ('/' IDENT	{ builder.append("/").append( $IDENT.text); } )
	)*
	{ $path = builder.toString(); }
	;
	
typeExpr returns [TypeSpec result]
	: { StringBuilder builder = new StringBuilder(); boolean isArray = false;}
	(
		( 'function' { builder.append( "function"); } )
		| (
			IDENT 	{ builder.append( $IDENT.text); }
			('.' IDENT	{ builder.append(".").append( $IDENT.text); } )*
		)
	) 
	('[' ']' 	{ isArray = true; })?
	{ $result = (isArray ? arrayType(builder.toString()) : type(builder.toString()) ); }
	;
	
qualifiedName returns [QName result]
	: IDENT 	{ $result = qname( $IDENT.text); }
	(	('.' IDENT	{ $result = qname( $result, $IDENT.text); } )
		| ('[' NUMBER ']'	{ $result = indexedQname( $result, $NUMBER.text); } )
		| ('[' index = qualifiedName ']'	{ $result = varQname( $result, $index.result ); } )
	)* 
	;

array   returns [ASTExpr result]
	:  	
	(
		( '['
			{ List<ASTExpr> elements = new LinkedList<ASTExpr>(); }
			( formulaTerm 		{ elements.add($formulaTerm.result); } )
			(',' formulaTerm 		{ elements.add($formulaTerm.result); } )* 
			']'
			{	$result = array(elements); }
		)
		| ( '[' from=expression ':' to=expression  ']'
				{ 
					$result = array(null);
					ASTArrayExpr arrayExpr = (ASTArrayExpr)$result;
					arrayExpr.setFrom($from.result);
					arrayExpr.setTo($to.result);
				} 
		)
	) 
	;

/**************************************
 * MAP Expression
 */
mapExpr   returns [ASTExpr result]
	: '{' 	{ $result = map(SIMPLE_MAP); String key;}
		(
			( ( IDENT {key = $IDENT.text; } ) | (STRING_LITERAL {key = strip($STRING_LITERAL.text); }) ) 
			':' formulaTerm	
				{ mapEntry( SIMPLE_MAP, $result, null, key, $formulaTerm.result ); }
			(',' 
				(( IDENT {key = $IDENT.text; } ) | (STRING_LITERAL {key = strip($STRING_LITERAL.text); })) 
				 ':' formulaTerm 
				{ mapEntry(SIMPLE_MAP,  $result, null, key, $formulaTerm.result ); }
			)*
		)?
	  '}'
	;

/** iterableTerm used in loop condition */
iterableTerm returns [ASTExpr result]
	: IDENT				{ $result = variable( $IDENT.text); }
	| qualifiedName		{ $result = variable( $qualifiedName.result) ; }
	| funcCallExp		{ $result = $funcCallExp.result; }
	| methodCallExp		{ $result = $methodCallExp.result; }
	| array 			{ $result = $array.result; }
	;
	
formulaTerm returns [ASTExpr result]
	: literalTerm 		{ $result = $literalTerm.result; }
	| IDENT				{ $result = variable( $IDENT.text); }
	| qualifiedName		{ $result = variable( $qualifiedName.result) ; }
	| funcCallExp { $result =  $funcCallExp.result ; }
	| methodCallExp { $result =  $methodCallExp.result ; }
	| array { $result =  $array.result ; }
	| mapExpr { $result =  $mapExpr.result ; }
	| chooseExpr { $result =  $chooseExpr.result ; }
	;


// Operations
unary  returns [ASTExpr result]
	:  { boolean negative = false; }
		( '-' { negative = true; } )? ( 
		formulaTerm { $result = $formulaTerm.result;  }
		| '(' operatorExpression ')' { $result = $operatorExpression.result;  }
		) 
		{ 
			if(negative){
				$result = unary(OP_NUM_NEGATION, $result );
			} 
		}
	;

percent  returns [ASTExpr result]
	:	unary 	{ $result = $unary.result;  }
    	('%' {$result = unary(OP_PERCENT, $result); } )?
    ;

    
exponential returns [ASTExpr result]
    :	percent 	{ $result = $percent.result;  }
    	(
    		'^'		op2 = percent  	{$result = binary(OP_POW, $result, $op2.result); }
    	)*
    ;
    
multiplicative returns [ASTExpr result]
    :	exponential 	{ $result = $exponential.result;  }
    	(
    		'*' 		op2 = exponential 	{$result = binary(OP_MULTI, $result, $op2.result); }
    		| '/' 		op2 = exponential  	{$result = binary(OP_DIVIDE, $result, $op2.result); }
    	)*
    ;
    
additiveExpression returns [ASTExpr result]
    :   multiplicative { $result = $multiplicative.result;  }
    ( 
    	'+' 	op2 = multiplicative	{$result = binary(OP_PLUS, $result, $op2.result); }
    	| '-' 	op2 = multiplicative	{$result = binary(OP_MINUS, $result, $op2.result); }
    )*
    ;
    
/*
	Logical Expression
*/
comparison returns [ASTExpr result]
	: additiveExpression  { $result = $additiveExpression.result;  }
	( 
		'=='  op2 = additiveExpression {$result = binary(OP_EQ, $result, $op2.result); }
		|'is'  op2 = additiveExpression {$result = binary(OP_EQ, $result, $op2.result); }
		|'!=' op2 = additiveExpression {$result = binary(OP_NOT_EQ, $result, $op2.result); }
		|'<>' op2 = additiveExpression {$result = binary(OP_NOT_EQ, $result, $op2.result); }
		|'is' 'not' op2 = additiveExpression {$result = binary(OP_NOT_EQ, $result, $op2.result); }
		|'>'  op2 = additiveExpression {$result = binary(OP_GT, $result, $op2.result); }
		|'>=' op2 = additiveExpression {$result = binary(OP_EQ_GT, $result, $op2.result); }
		|'<'  op2 = additiveExpression {$result = binary(OP_LT, $result, $op2.result); }
		|'<=' op2 = additiveExpression {$result = binary(OP_EQ_LT, $result, $op2.result); }
	)*
	;
	
notExpression returns [ASTExpr result]
	: 
	(
		comparison { $result = $comparison.result;  }
		| 'not' comparison {$result = unary(OP_NOT, $comparison.result); }
		
	)
	;
	
logicalExpression returns [ASTExpr result]
	: notExpression { $result = $notExpression.result;  }
	( 
		'and' 	op2 = operatorExpression {$result = binary(OP_AND, $result, $op2.result); }
		|'or' 	op2 = operatorExpression {$result = binary(OP_OR, $result, $op2.result); }
		
	)*
	;
    
ternaryExpression returns [ASTExpr result]
	: 	op1 = logicalExpression 
		'?'
		( op2 = operatorExpression  )
		':'
		( op3 = operatorExpression )
		{$result = ternary(OP_TERNARY, $op1.result, $op2.result, $op3.result); }
	;
    
operatorExpression returns [ASTExpr result]
	: (
		logicalExpression { $result = $logicalExpression.result;  }
		| ternaryExpression { $result = $ternaryExpression.result;  }
		)
	;
    


/* *********************************************
	Lexer rules
********************************************* */
fragment DIGIT	: '0'..'9' ;

// LATIN ALPAHBETs, $, _ and Korean charset  
fragment LETTER
    : 	'$'
    	| 'A'..'Z' 
    	| '_' | 'a'..'z'
    	| '\uAC00'..'\uD7AF'
    	| '\u3130'..'\u318F'
        | '\u1100'..'\u11FF'
    ;

END_OF_STMT : ';' ;

NUMBER : DIGIT+ ('.' DIGIT+)? ;

STRING_LITERAL
	:	( '"' ( ~('"'|'\r'|'\n') )* '"' )
		| ( '\'' ( ~('\''|'\r'|'\n') )* '\'' )
	;

NULL : ('null'|'nil'|'NULL') ;

BOOLEAN :	('true' | 'false' | 'TRUE' | 'FALSE') ;
IDENT :  LETTER (LETTER|DIGIT)* ;

//
// Whitespace and comments
//
WS  :  [ \t\r\n] -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;