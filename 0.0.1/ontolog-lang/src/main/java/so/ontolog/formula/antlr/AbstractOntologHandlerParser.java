package so.ontolog.formula.antlr;

import java.util.BitSet;
import java.util.List;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTBlock;
import so.ontolog.formula.ast.ASTContext;
import so.ontolog.formula.ast.ASTDeclaration;
import so.ontolog.formula.ast.ASTException;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTFactory;
import so.ontolog.formula.ast.ASTStatement;
import so.ontolog.formula.ast.ASTSymbol;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.CompilationUnit;
import so.ontolog.formula.ast.GrammarTokens;
import so.ontolog.formula.ast.SyntaxErrorHandler;
import so.ontolog.formula.ast.context.RootASTContext;
import so.ontolog.formula.ast.context.ScopeASTContext;
import so.ontolog.formula.ast.stmt.ASTIfStatement;
import so.ontolog.formula.runtime.QName;

public abstract class AbstractOntologHandlerParser extends Parser implements GrammarTokens, ANTLRErrorListener {
	
	private ASTFactory factory;
	private SyntaxErrorHandler syntaxErrorHandler;
	private RootASTContext rootContext;
	private ASTContext current;
	
	public AbstractOntologHandlerParser(TokenStream input) {
		super(input);
	}
	

  	public void setASTFactory(ASTFactory factory){
  		this.factory = factory;
  	}
  	
  	public void setSyntaxErrorHandler(SyntaxErrorHandler syntaxErrorHandler) {
		this.syntaxErrorHandler = syntaxErrorHandler;
		addErrorListener(this);
	}
  	
  	/**
	 * @return the rootContext
	 */
	public RootASTContext getRootContext() {
		return rootContext;
	}
	
  	/**
	 * @param rootContext the rootContext to set
	 */
	public void setRootContext(RootASTContext rootContext) {
		this.rootContext = rootContext;
	}

	public ASTContext beginScope(){
		if(current == null){
			current = rootContext;
		} else {
			ScopeASTContext newCtx = new ScopeASTContext(current);
			current = newCtx;
		}
		return current;
	}

	public ASTContext endScope(){
		if(current == null){
			throw new ASTException("Excess root scope.").setLocation(createASTToken());
		}
		
		ASTContext prevCtx = current.parent();
		current = prevCtx;
		return current;
	}
	
	public CompilationUnit createModule(String token) {
		ASTToken astToken = createASTToken(token);
		ASTContext context = beginScope();
		return factory.createModule(context, astToken);
	}


	public TypeSpec type(String expr) {
		return factory.createType(current, expr);
	}

	public TypeSpec arrayType(String expr) {
		return factory.createArrayType(current, expr);
	}


	public QName qname(String name) {
		return factory.createQName(current, name);
	}


	public QName qname(QName parent, String name) {
		return factory.createQName(current, parent, name);
	}


	public QName indexedQname(QName parent, String index) {
		return factory.createIndexedQName(current, parent, index);
	}

	public QName varQname(QName parent, QName index) {
		return factory.createVarQName(current, parent, index);
	}

	public void importJava(QName qname) {
		factory.importJava(current, qname);
	}

	public void importModule(String path, String alias) {
		factory.importModule(current, path, alias);
	}


	public ASTExpr unary(String token, ASTExpr expr) {
		ASTToken astToken = createASTToken(token);
		return factory.createUnary(current, astToken, expr);
	}


	public ASTExpr binary(String token, ASTExpr left,
			ASTExpr right) {
		ASTToken astToken = createASTToken(token);
		return factory.createBinary(current, astToken, left, right);
	}


	public ASTExpr ternary(String token, ASTExpr expr1,
			ASTExpr expr2, ASTExpr expr3) {
		ASTToken astToken = createASTToken(token);
		return factory.createTernary(current, astToken, expr1, expr2, expr3);
	}


	public ASTSymbol variable(QName qname) {
		ASTToken astToken = createASTToken(GrammarTokens.VAR);
		return factory.createVariable(current, astToken, qname);
	}

	public ASTSymbol variable(String name) {
		QName qname = factory.createQName(current, name);
		ASTToken astToken = createASTToken(GrammarTokens.VAR);
		return factory.createVariable(current, astToken, qname);
	}

	

	public ASTExpr loopCondition(ASTDeclaration varDecl, ASTExpr iteratorExpr) {
		ASTToken astToken = createASTToken(GrammarTokens.LOOP_COND_DECL);
		return factory.createLoopCondition(current, astToken, varDecl,
				iteratorExpr);
	}


	public ASTExpr literal(String token, String expr) {
		ASTToken astToken = createASTToken(token);
		return factory.createLiteral(astToken, expr);
	}

	public ASTExpr array(List<ASTExpr> elements) {
		ASTToken astToken = createASTToken(GrammarTokens.ARRAY_EL);
		return factory.createArray(astToken, elements);
	}

	public ASTExpr call(String token, ASTSymbol beanSymbol, String name, List<ASTExpr> args) {
		ASTToken astToken = createASTToken(token);
		return factory.createCall(current, astToken, beanSymbol, name, args);
	}


	public ASTDeclaration paramDecl(String token, QName typeName,
			String name, String alias) {
		ASTToken astToken = createASTToken(token);
		TypeSpec type = factory.createType(current, typeName);
		return factory.createParamDecl(current, astToken, type, name, alias);
	}

	public ASTDeclaration variableDecl(String token, TypeSpec type,
			String name, ASTExpr value) {
		ASTToken astToken = createASTToken(token);
		return factory.createVariableDecl(current, astToken, type, name, value);
	}


	public ASTStatement asStatement(ASTDeclaration decl) {
		return factory.asStatement(current, decl);
	}

	public ASTStatement asStatement(ASTExpr callExpr) {
		return factory.asStatement(current, callExpr);
	}

	public ASTStatement returnStatement(ASTExpr expr) {
		return factory.createReturnStatement(current, expr);
	}

	public ASTIfStatement ifStatement(String token, ASTExpr condition) {
		ASTToken astToken = createASTToken(token);
		return (ASTIfStatement)factory.createIfStmt(current, astToken, condition);
	}

	public ASTBlock loopStatement(String token, ASTExpr condition) {
		ASTToken astToken = createASTToken(token);
		return factory.createLoopStatement(current, astToken, condition);
	}

	

	public ASTStatement assignStatement(String token, ASTExpr varExpr, ASTExpr valueExpr) {
		ASTToken astToken = createASTToken(token);
		return factory.createAssignStatement(current, astToken, varExpr, valueExpr);
	}


	public ASTStatement createEvalStmt(String token, ASTExpr expr) {
		ASTToken astToken = createASTToken(token);
		return factory.createEvalStmt(astToken, expr);
	}


	protected String strip( String text ) {
    	if( text != null && text.length() >= 2 ) {
    		text = text.substring( 1, text.length() - 1 );
    		text = text.replaceAll( "\'", "'" );
    		text = text.replaceAll( "\"", "\\\"" );
    	}
    	return text;
	}

	protected ASTToken createASTToken(String tokenStr){
		ASTToken location = createASTToken();
		location.setToken(tokenStr);
		
		return location;
	}

	protected ASTToken createASTToken(){
		ASTToken location = null;
		
		if(_ctx == null){
			Token token = this.getCurrentToken();
			location = new ASTToken(token.getLine(), token.getCharPositionInLine(), 
					token.getStartIndex(), token.getStopIndex());
			return location;
		} else {
			location = new ASTToken(_ctx.start.getLine(), _ctx.start.getCharPositionInLine(), 
					_ctx.start.getStartIndex(), _ctx.start.getStopIndex());
			
			int end = -1;
			
			if(_ctx.children != null){
				ParseTree last = _ctx.children.get(_ctx.children.size()-1);
				
				if(last instanceof TerminalNode){
					end = ((TerminalNode)last).getSymbol().getStopIndex();
				} else if(last instanceof ParserRuleContext) {
					end = ((ParserRuleContext)last).stop.getStopIndex();
				}
			}
			
			
			location.setEndIndex(end);
		}
		
		return location;
	}


	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		if(syntaxErrorHandler != null){
			ASTToken location = new ASTToken(line, charPositionInLine);
			syntaxErrorHandler.syntaxError(msg, offendingSymbol, location, e);
		}
	}


	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex,
			int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
	}


	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa,
			int startIndex, int stopIndex, BitSet conflictingAlts,
			ATNConfigSet configs) {
	}


	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa,
			int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
	}
	
}
