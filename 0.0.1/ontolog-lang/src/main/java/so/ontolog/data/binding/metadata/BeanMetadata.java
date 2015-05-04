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
package so.ontolog.data.binding.metadata;

import so.ontolog.data.common.FieldMap;
import so.ontolog.data.util.StringArraySet;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class BeanMetadata extends FieldMap<BeanField>{
	private static final long serialVersionUID = 8012712582777493688L;

	public BeanMetadata(String[] strArray) {
		super(strArray, BeanField.class);
	}
	
	public BeanMetadata(String[] strArray, BeanField[] fields) {
		super(strArray, fields);
	}

	public BeanMetadata(StringArraySet keySet, BeanField[] fields) {
		super(keySet, fields);
	}

}
