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

import so.ontolog.formula.SourcePosition;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTToken implements SourcePosition {
	private String token;
	private int line;
	private int charPositionInLine;
	private int startIndex;
	private int endIndex;
	
	
	public ASTToken(String token, int line, int charPositionInLine,
			int startIndex, int endIndex) {
		this.token = token;
		this.line = line;
		this.charPositionInLine = charPositionInLine;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}


	/**
	 * @param line
	 * @param charPositionInLine
	 * @param startIndex
	 * @param endIndex
	 */
	public ASTToken(int line, int charPositionInLine, int startIndex,
			int endIndex) {
		this.line = line;
		this.charPositionInLine = charPositionInLine;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}
	
	
	/**
	 * @param line
	 * @param charPositionInLine
	 */
	public ASTToken(int line, int charPositionInLine) {
		this(charPositionInLine, charPositionInLine, -1, -1);
	}


	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getCharPositionInLine() {
		return charPositionInLine;
	}
	public void setCharPositionInLine(int charPositionInLine) {
		this.charPositionInLine = charPositionInLine;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	
	public void setToken(String text) {
		this.token = text;
	}


	@Override
	public String getName() {
		return token;
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("[");
		buf.append(line).append(":").append(charPositionInLine);
		buf.append(",");
		buf.append(startIndex).append(":").append(endIndex);
		buf.append("]");
		
		if(token !=null){
			buf.append(" ").append(token);
		}
		return buf.toString();
	}
}
