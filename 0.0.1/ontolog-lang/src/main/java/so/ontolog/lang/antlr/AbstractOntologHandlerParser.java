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
import so.ontolog.lang.ast.ASTExpression;
import so.ontolog.lang.ast.ASTFactory;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.GrammarTokens;
import so.ontolog.lang.ast.expr.BinaryExpr;
import so.ontolog.lang.ast.expr.LiteralExpr;
import so.ontolog.lang.ast.expr.TernaryExpr;
import so.ontolog.lang.ast.expr.UnaryExpr;
import so.ontolog.lang.ast.expr.VariableExpr;
import so.ontolog.lang.build.SyntaxErrorHandler;
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

	
	public TypeSpec createType(String expr) {
		return factory.createType(expr);
	}


	public TypeSpec createType(QName qname) {
		return factory.createType(qname);
	}


	public QName createQName(String name) {
		return factory.createQName(name);
	}


	public QName createQName(QName parent, String name) {
		return factory.createQName(parent, name);
	}


	public UnaryExpr createUnary(String token, ASTExpression expr) {
		ASTToken astToken = createASTToken(token);
		return factory.createUnary(astToken, expr);
	}


	public BinaryExpr createBinary(String token, ASTExpression left,
			ASTExpression right) {
		ASTToken astToken = createASTToken(token);
		return factory.createBinary(astToken, left, right);
	}


	public TernaryExpr createTernary(String token, ASTExpression expr1,
			ASTExpression expr2, ASTExpression expr3) {
		ASTToken astToken = createASTToken(token);
		return factory.createTernary(astToken, expr1, expr2, expr3);
	}


	public VariableExpr createVariable(String token, QName qname) {
		ASTToken astToken = createASTToken(token);
		return factory.createVariable(astToken, qname);
	}


	public LiteralExpr createLiteral(String token, TypeSpec type, String expr) {
		ASTToken astToken = createASTToken(token);
		return factory.createLiteral(astToken, expr);
	}


	public ASTToken createASTToken(String tokenStr){
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
