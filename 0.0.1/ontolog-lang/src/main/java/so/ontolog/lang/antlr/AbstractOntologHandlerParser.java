package so.ontolog.lang.antlr;

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
import so.ontolog.lang.ast.ASTContext;
import so.ontolog.lang.ast.ASTDeclaration;
import so.ontolog.lang.ast.ASTExpr;
import so.ontolog.lang.ast.ASTFactory;
import so.ontolog.lang.ast.ASTStatement;
import so.ontolog.lang.ast.ASTSymbol;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.CompilationUnit;
import so.ontolog.lang.ast.GrammarTokens;
import so.ontolog.lang.ast.SyntaxErrorHandler;
import so.ontolog.lang.ast.context.RootASTContext;
import so.ontolog.lang.ast.context.ScopeASTContext;
import so.ontolog.lang.build.BuildException;
import so.ontolog.lang.runtime.QName;

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
			throw new BuildException("Excess root scope.").setLocation(createASTToken());
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
		return factory.createType(expr);
	}


	public TypeSpec type(QName qname) {
		return factory.createType(qname);
	}


	public QName qname(String name) {
		return factory.createQName(name);
	}


	public QName qname(QName parent, String name) {
		return factory.createQName(parent, name);
	}


	public QName indexedQname(QName parent, String index) {
		return factory.createIndexedQName(parent, index);
	}

	public QName varQname(QName parent, QName index) {
		return factory.createVarQName(parent, index);
	}


	public ASTExpr unary(String token, ASTExpr expr) {
		ASTToken astToken = createASTToken(token);
		return factory.createUnary(astToken, expr);
	}


	public ASTExpr binary(String token, ASTExpr left,
			ASTExpr right) {
		ASTToken astToken = createASTToken(token);
		return factory.createBinary(astToken, left, right);
	}


	public ASTExpr ternary(String token, ASTExpr expr1,
			ASTExpr expr2, ASTExpr expr3) {
		ASTToken astToken = createASTToken(token);
		return factory.createTernary(astToken, expr1, expr2, expr3);
	}


	public ASTSymbol variable(QName qname) {
		ASTToken astToken = createASTToken(GrammarTokens.VAR);
		return factory.createVariable(current, astToken, qname);
	}

	public ASTSymbol variable(String name) {
		QName qname = factory.createQName(name);
		ASTToken astToken = createASTToken(GrammarTokens.VAR);
		return factory.createVariable(current, astToken, qname);
	}


	public ASTExpr literal(String token, String expr) {
		ASTToken astToken = createASTToken(token);
		return factory.createLiteral(astToken, expr);
	}

	

	public ASTExpr call(String token, ASTSymbol beanSymbol, String name, List<ASTExpr> args) {
		ASTToken astToken = createASTToken(token);
		return factory.createCall(current, astToken, beanSymbol, name, args);
	}


	public ASTDeclaration createParamDecl(String token,QName typeName,
			String name, String alias) {
		ASTToken astToken = createASTToken(token);
		TypeSpec type = type(typeName);
		return factory.createParamDecl(current, astToken, type, name, alias);
	}


	public ASTStatement asStatement(ASTDeclaration decl) {
		return factory.asStatement(current, decl);
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
