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
package so.ontolog.data.util;


/**
 * 
 * <pre></pre>
 * @author kighie@gmail.com
 *
 */
public class StringArraySet extends KeyArraySet<String> {

	private static final long serialVersionUID = 1L;

	public final static String[] EMPTY_STRING_ARRAY = new String[0];
	
	public StringArraySet(String[] strArray){
		super(strArray);
	}
	
}
