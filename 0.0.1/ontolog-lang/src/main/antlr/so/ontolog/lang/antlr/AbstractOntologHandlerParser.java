package so.ontolog.lang.antlr;

import java.util.BitSet;
import java.util.List;
import java.util.Map;

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

import so.ontolog.lang.GrammarTokens;
import so.ontolog.lang.ast.ASTBlock;
import so.ontolog.lang.ast.ASTBlockStatement;
import so.ontolog.lang.ast.ASTFunction;
import so.ontolog.lang.ast.ASTGettable;
import so.ontolog.lang.ast.ASTLiteral;
import so.ontolog.lang.ast.ASTNode;
import so.ontolog.lang.ast.ASTRef;
import so.ontolog.lang.ast.ASTStatement;
import so.ontolog.lang.build.BuildContext;
import so.ontolog.lang.build.BuildHandler;
import so.ontolog.lang.build.SyntaxErrorHandler;
import so.ontolog.lang.runtime.Gettable;
import so.ontolog.lang.util.SimpleSourceLocation;
import so.ontolog.lang.util.SourceLocation;

public abstract class AbstractOntologHandlerParser extends Parser implements GrammarTokens, ANTLRErrorListener {
	
	private String sourceText;
	private BuildHandler handler;
	private SyntaxErrorHandler syntaxErrorHandler;
	
	public AbstractOntologHandlerParser(TokenStream input) {
		super(input);
	}
	

  	public void setHandler(BuildHandler handler){
  		this.handler = handler;
  	}
  	
  	public void setSyntaxErrorHandler(SyntaxErrorHandler syntaxErrorHandler) {
		this.syntaxErrorHandler = syntaxErrorHandler;
		addErrorListener(this);
	}


	public void setSourceText(String sourceText) {
		this.sourceText = sourceText;
	}
  	
	

	public BuildContext current() {
		return handler.current();
	}


	public ASTBlock block(String token) {
		return handler.block(token);
	}


	public void beginScope() {
		handler.beginScope();
	}


	public void endScope() {
		handler.endScope();
	}


	public ASTGettable<?> operator(String token, ASTNode node) {
		return handler.operator(token, node);
	}


	public ASTGettable<?> operator(String token, ASTNode left, ASTNode right) {
		return handler.operator(token, left, right);
	}


	public ASTLiteral<?> literal(String token, String value) {
		return handler.literal(token, value);
	}


	public ASTRef refer(String name) {
		return handler.refer(name);
	}


	public ASTRef refer(ASTRef parent, String name) {
		return handler.refer(parent, name);
	}


	public ASTRef referIndexed(ASTRef parent, ASTNode index) {
		return handler.referIndexed(parent, index);
	}


	public ASTRef declare(String token, Class<?> type, String name) {
		return handler.declare(token, type, name);
	}


	public ASTGettable<?> declareProto(String token, List<?> fieldList) {
		return handler.declareProto(token, fieldList);
	}


	public void protoField(String token, List<?> fieldList, Class<?> type,
			String name, ASTNode defaultValue, Object... extra) {
		handler.protoField(token, fieldList, type, name, defaultValue, extra);
	}


	public ASTFunction<?> declareFn(Class<?> retType, String name,
			List<ASTRef> args) {
		return handler.declareFn(retType, name, args);
	}


	public Class<?> type(String typeQname) {
		return handler.type(typeQname);
	}


	public <T> Class<T[]> arrayType(Class<T> type) {
		return handler.arrayType(type);
	}


	public ASTGettable<?> functionCall(String name, List<ASTNode> args) {
		return handler.functionCall(name, args);
	}


	public ASTRef methodCall(ASTRef parent, String name, List<ASTNode> args) {
		return handler.methodCall(parent, name, args);
	}


	public ASTStatement statement(String token, ASTNode... args) {
		return handler.statement(token, args);
	}


	public ASTBlockStatement statementBlock(String token, ASTNode... args) {
		return handler.statementBlock(token, args);
	}


	public ASTGettable<?> array(List<ASTNode> elements) {
		return handler.array(elements);
	}


	@SuppressWarnings("rawtypes")
	public ASTGettable<Map> map(String token) {
		return handler.map(token);
	}

	@SuppressWarnings({ "rawtypes" })
	public void mapEntry( Gettable<Map> mapGettable, Class<?> entryType,
			String name, ASTNode value) {
		handler.mapEntry(mapGettable, entryType, name, value);
	}


	public void importJava(ASTRef ref) {
		handler.importJava(ref);
	}


	public SourceLocation currentLocation(){
		SimpleSourceLocation location = null;
		
		if(_ctx == null){
			Token token = this.getCurrentToken();
			location = new SimpleSourceLocation(token.getLine(), token.getCharPositionInLine(), 
					token.getStartIndex(), token.getStopIndex());
			location.setText(token.getText());
			return location;
		} else {
			location = new SimpleSourceLocation(_ctx.start.getLine(), _ctx.start.getCharPositionInLine(), 
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
		
		if(sourceText != null){
			location.setText(sourceText.substring(location.getStartIndex(), location.getEndIndex()+1));
		} else {
			location.setText(_ctx.getText());
		}
		
		
//		System.out.println("\t" + location);
		return location;
	}


	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		if(syntaxErrorHandler != null){
			SimpleSourceLocation location = new SimpleSourceLocation(line, charPositionInLine);
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
