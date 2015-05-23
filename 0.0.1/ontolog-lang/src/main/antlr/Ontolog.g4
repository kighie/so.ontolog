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
	superClass = so.ontolog.lang.antlr.AbstractOntologHandlerParser;
}

// generate target dir : ./src/mai/antlr
// use command line option : -package so.ontolog.lang.antlr

@parser::header {
	import java.util.List;
	import java.util.LinkedList;
	
	import so.ontolog.lang.runtime.*;
	import so.ontolog.lang.ast.*;
	import so.ontolog.lang.build.*;
}


ontologExpression returns [CompilationUnit result]
	: { $result = createModule(EXPR_MODULE); }
	( '[' paramDecl[$result]*  ']' )?
	'='
	( 
		( '(' expression ')' { $result.append( createEvalStmt (EVAL_EXPR_STMT, $expression.result) ) ; } )
		| ( expression { $result.append(createEvalStmt (EVAL_EXPR_STMT, $expression.result)) ; } )	
	)
	;

paramDecl [CompilationUnit module] 
	: 'param' 
		{ String alias = null; }
		type = qualifiedName 
		name = IDENT
		('as' IDENT  { alias = $IDENT.text; })?
		{ $module.append( asStatement( createParamDecl(PARAM_DECL, $type.result, $name.text, alias) ) ); }
		';'
	;

expression returns [ASTExpr result]
	: 
	(
	operatorExpression { $result = $operatorExpression.result ; }
//	| funcCallExp { $result =  $funcCallExp.result ; }
//	| methodCallExp { $result =  $methodCallExp.result ; }
	) 
	;


literalTerm  returns [ASTExpr result]
	: BOOLEAN 			{ $result = literal( LIT_BOOLEAN, $BOOLEAN.text); }
	| STRING_LITERAL	{ $result = literal( LIT_STRING,  strip($STRING_LITERAL.text)); }
	| NUMBER			{ $result = literal( LIT_NUMBER, $NUMBER.text); }
	| NULL				{ $result = literal( LIT_NULL, null); }
	;


qualifiedName returns [QName result]
	: IDENT 	{ $result = qname( $IDENT.text); }
	(	('.' IDENT	{ $result = qname( $result, $IDENT.text); } )
		| ('[' NUMBER ']'	{ $result = indexedQname( $result, $NUMBER.text); } )
		| ('[' qualifiedName ']'	{ $result = varQname( $result, $qualifiedName.result ); } )
	)* 
	;


formulaTerm returns [ASTExpr result]
	: literalTerm 		{ $result = $literalTerm.result; }
	| IDENT				{ $result = variable( $IDENT.text); }
	| qualifiedName		{ $result = variable( $qualifiedName.result) ; }
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
		'='  op2 = additiveExpression {$result = binary(OP_EQ, $result, $op2.result); }
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
	: logicalExpression { $result = $logicalExpression.result;  }
	(
		'?'
		( op2 = operatorExpression  )
		':'
		( op3 = operatorExpression )
		{$result = ternary(OP_TERNARY, $result, $op2.result, $op3.result); }
	)
	;
    
operatorExpression returns [ASTExpr result]
	: logicalExpression { $result = $logicalExpression.result;  }
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
WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;