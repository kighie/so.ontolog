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
package so.ontolog.lang.runtime;

import java.io.Serializable;

/**
 * 
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class QName implements Serializable {
	private static final long serialVersionUID = 7111834758219252316L;
	
	
	public final static QName CLOSURE_PREFIX = new QName("closure");

	public static QName getClosureQName(String name){
		return new QName(CLOSURE_PREFIX, name);
	}
	

	public static QName getQName(String name){
		return new QName(name);
	}
	
	
	private QName parent;
	private QName root;
	private String qname;
	private String name;
	
	public QName(QName parent, String name){
		this.name = name;
		this.parent = parent;
		if(parent != null){
			this.root = parent.root;
			this.qname = toString(".").intern();
		} else {
			this.root = this;
			this.qname = name;
		}
	}

	public QName(String name){
		this(null,name);
	}

	/**
	 * @return the root
	 */
	public QName getRoot() {
		return root;
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
		return qname;
	}
	
	@Override
	public int hashCode() {
		return qname.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if( this == obj ){
			return true;
		} else if(obj instanceof QName){
			return this.qname.equals(((QName)obj).qname);
		} else if (obj instanceof String){
			return this.qname.equals(obj);
		}
		
		return false;
	}
	
	public boolean equals(QName obj) {
		return (this.hashCode() == obj.hashCode());
	}

	public boolean equals(String obj) {
		return (obj.equals(this));
	}
	
	
	@Override
	public String toString() {
		return qname;
	}
	
	public String toString(String pathDelimiter) {
		StringBuilder buf = new StringBuilder();
		if(parent != null){
			buf.append(parent).append(pathDelimiter);
		}
		
		buf.append(name);
		return buf.toString();
	}

}
