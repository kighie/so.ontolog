package so.ontolog.lang.antlr;

import java.util.BitSet;

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
import so.ontolog.lang.ast.ASTExpr;
import so.ontolog.lang.ast.ASTFactory;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.GrammarTokens;
import so.ontolog.lang.ast.SyntaxErrorHandler;
import so.ontolog.lang.ast.expr.BinaryExpr;
import so.ontolog.lang.ast.expr.LiteralExpr;
import so.ontolog.lang.ast.expr.TernaryExpr;
import so.ontolog.lang.ast.expr.UnaryExpr;
import so.ontolog.lang.ast.expr.VariableExpr;
import so.ontolog.lang.runtime.QName;

public abstract class AbstractOntologHandlerParser extends Parser implements GrammarTokens, ANTLRErrorListener {
	
	private ASTFactory factory;
	private SyntaxErrorHandler syntaxErrorHandler;
	
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


	public UnaryExpr unary(String token, ASTExpr expr) {
		ASTToken astToken = createASTToken(token);
		return factory.createUnary(astToken, expr);
	}


	public BinaryExpr binary(String token, ASTExpr left,
			ASTExpr right) {
		ASTToken astToken = createASTToken(token);
		return factory.createBinary(astToken, left, right);
	}


	public TernaryExpr ternary(String token, ASTExpr expr1,
			ASTExpr expr2, ASTExpr expr3) {
		ASTToken astToken = createASTToken(token);
		return factory.createTernary(astToken, expr1, expr2, expr3);
	}


	public VariableExpr variable(QName qname) {
		ASTToken astToken = createASTToken(GrammarTokens.VAR);
		return factory.createVariable(astToken, qname);
	}

	public VariableExpr variable(String name) {
		QName qname = factory.createQName(name);
		ASTToken astToken = createASTToken(GrammarTokens.VAR);
		return factory.createVariable(astToken, qname);
	}


	public LiteralExpr literal(String token, String expr) {
		ASTToken astToken = createASTToken(token);
		return factory.createLiteral(astToken, expr);
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
		ASTToken location = null;
		
		if(_ctx == null){
			Token token = this.getCurrentToken();
			location = new ASTToken(tokenStr, token.getLine(), token.getCharPositionInLine(), 
					token.getStartIndex(), token.getStopIndex());
			return location;
		} else {
			location = new ASTToken(tokenStr, _ctx.start.getLine(), _ctx.start.getCharPositionInLine(), 
					_ctx.start.getStartIndex(), _ctx.start.getStopIndex());
			
			int end = -1;
			ParseTree last = _ctx.children.get(_ctx.children.size()-1);
			
			if(last instanceof TerminalNode){
				end = ((TerminalNode)last).getSymbol().getStopIndex();
			} else if(last instanceof ParserRuleContext) {
				end = ((ParserRuleContext)last).stop.getStopIndex();
			}
			
			location.setEndIndex(end);
		}
		
//		System.out.println(location + "\t" + this.getCurrentToken());
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
