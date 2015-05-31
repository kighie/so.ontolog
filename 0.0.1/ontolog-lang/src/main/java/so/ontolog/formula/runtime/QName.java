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
package so.ontolog.formula.runtime;

import java.io.Serializable;
import java.util.regex.Pattern;

/**
 * 
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class QName implements Serializable {
	private static final long serialVersionUID = 7111834758219252316L;
	private static final Pattern pattern = Pattern.compile("\\.");
	

	public static QName parseQName(String fullName){
		String[] tokens = pattern.split(fullName);
		QName qname = null;
		for(String t : tokens){
			qname = new QName(qname, t);
		}
		return qname;
	}

	/**
	 * <pre>
	 * {functionName}/{argCount}
	 * ex) testFnc/0, testFnc/2, etc.
	 * 
	 * </pre>
	 * @param name
	 * @param argCount
	 * @return
	 */
	public static QName createFunctionQName(String name, int argCount){
		QName qname = new QName(name +"/" + argCount);
		return qname;
	}
	
	
	protected final QName parent;
	protected final String name;
	private final int hashcode;
	
	public QName(QName parent, String name){
		this.name = name;
		this.parent = parent;
		hashcode = getFullName().hashCode();
	}

	public QName(String name){
		this(null,name);
	}

	/**
	 * @return the root
	 */
	public QName getRoot() {
		if(parent != null){
			return parent.getRoot();
		}
		return this;
	}
	
	/**
	 * @return the parent
	 */
	public QName getParent() {
		return parent;
	}

	/**<pre>
	 * </pre>
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	
	public String getFullName() {
		if(parent != null){
			StringBuilder buf = new StringBuilder();
			toString(buf, ".");
			return buf.toString().intern();
		} else {
			return name;
		}
	}
	
	@Override
	public int hashCode() {
		return hashcode;
	}

	@Override
	public boolean equals(Object obj) {
		if( this == obj ){
			return true;
		} else if(obj instanceof QName){
			return this.hashcode == ((QName)obj).hashcode;
		} else if (obj instanceof String){
			return getFullName().equals(obj);
		}
		
		return false;
	}
	
	public boolean equals(String obj) {
		return (obj.equals(this));
	}
	
	
	@Override
	public String toString() {
		return getFullName();
	}
	
	public void toString(StringBuilder buf, String pathDelimiter) {
		if(parent != null){
			parent.toString(buf, pathDelimiter);
			buf.append(pathDelimiter);
		}
		
		buf.append(name);
	}

}
