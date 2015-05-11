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

import so.ontolog.lang.ast.GrammarTokens;
import so.ontolog.lang.ast.SimpleSourcePosition;
import so.ontolog.lang.ast.SourcePosition;
import so.ontolog.lang.build.BuildContext;
import so.ontolog.lang.build.BuildHandler;
import so.ontolog.lang.build.SyntaxErrorHandler;

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


	public SourcePosition currentLocation(){
		SimpleSourcePosition location = null;
		
		if(_ctx == null){
			Token token = this.getCurrentToken();
			location = new SimpleSourcePosition(token.getLine(), token.getCharPositionInLine(), 
					token.getStartIndex(), token.getStopIndex());
			location.setText(token.getText());
			return location;
		} else {
			location = new SimpleSourcePosition(_ctx.start.getLine(), _ctx.start.getCharPositionInLine(), 
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
			SimpleSourcePosition location = new SimpleSourcePosition(line, charPositionInLine);
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
