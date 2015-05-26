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
package so.ontolog.formula.ast;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public interface GrammarTokens {

	String EXPR_MODULE 		= "EXPR_MODULE";
	String SCRIPT_MODULE 	= "SCRIPT_MODULE";

	/*
	 * Expr
	 */
	
	String LIT_NUMBER 		= "LIT_NUMBER";
	String LIT_BOOLEAN 		= "LIT_BOOLEAN";
	String LIT_DATE 		= "LIT_DATE";
	String LIT_STRING 		= "LIT_STRING";
	String LIT_NULL 		= "LIT_NULL";
	
	String OP_NUM_NEGATION 	= "OP_NUM_NEGATION";
	String OP_PERCENT 		= "OP_PERCENT";
	String OP_MINUS 		= "OP_MINUS";
	String OP_PLUS 			= "OP_PLUS";
	String OP_MULTI 		= "OP_MULTI";
	String OP_DIVIDE 		= "OP_DIVIDE";
	String OP_POW			= "OP_POW";
	String OP_NOT	 		= "OP_NOT";
	String OP_AND	 		= "OP_AND";
	String OP_OR	 		= "OP_OR";
	String OP_CONCAT 		= "OP_CONCAT";
	String OP_EQ	 		= "OP_EQ";
	String OP_NOT_EQ		= "OP_NOT_EQ";
	String OP_EQ_LT 		= "OP_EQ_LT";
	String OP_EQ_GT	 		= "OP_EQ_GT";
	String OP_LT 			= "OP_LT";
	String OP_GT	 		= "OP_GT";
	String OP_TERNARY	 	= "OP_TERNARY";

	String VAR				= "VAR";
	
	String METHOD_CALL		= "METHOD_CALL";
	String FUNC_CALL		= "FUNC_CALL";

	/*
	 * Statements
	 */
	
	String IF 				= "IF";
	String ELSEIF 			= "ELSEIF";
	String ELSE 			= "ELSE";
	String FOREACH			= "FOREACH";
	String LOOP_COND_DECL		= "LOOP_COND_DECL";
	String MTHODE_CALL_STMT	= "MTHODE_CALL_STMT";
	String FUNCTION_CALL_STMT	= "FUNC_CALL_STMT";
	String ASSIGN_STMT		= "ASSIGN_STMT";
//	String PARAM_DECL_STMT	= "PARAM_DECL_STMT";

	String EVAL_EXPR_STMT	= "EVAL";
	String RETURN		= "RETURN";
	
	/*
	 * Declaration
	 */
	
	String SIMPLE_MAP		= "SIMPLE_MAP";
	String VAR_DECL			= "VAR_DECL";
	String ARG_DECL			= "ARG_DECL";
	String FUNC_DECL		= "FUNC_DECL";
	String FUNC_REF 		= "FUNC_REF";
	String PARAM_DECL		= "PARAM_DECL";


	String ARRAY_GET 	= "GET[]";
	String ARRAY_EL 	= "GET[x]";

	String LAMBDA		= "LAMBDA";

	String RECORD		= "R";
	
	
}
