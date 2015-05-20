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
package so.ontolog.data.binding.impl;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

import so.ontolog.data.binding.metadata.BeanMetadata;
import so.ontolog.data.binding.metadata.BeanProperty;
import so.ontolog.data.binding.metadata.factory.BeanMetadataFactory;
import so.ontolog.data.type.TypeKind;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class BeanPrinter {
	private BeanMetadataFactory factory;
	
	public BeanPrinter(BeanMetadataFactory factory) {
		this.factory = factory;
	}

	@SuppressWarnings("unchecked")
	public <T> String print(T bean) {
		StringBuilder builder = new StringBuilder();
		print(bean, (BeanMetadata<T>)factory.create(bean.getClass()), builder, "");
		return builder.toString();
	}

	public <T> String print(T bean, BeanMetadata<T> metadata) {
		StringBuilder builder = new StringBuilder();
		print(bean, metadata, builder, "");
		return builder.toString();
	}

	@SuppressWarnings("unchecked")
	public <T> void printProperty(T bean, BeanProperty<?> property, StringBuilder builder, String indent) {
		if( TypeUtils.isSimpleValueType(bean.getClass()) ){
			builder.append(bean);
		} else if(bean instanceof Collection){
			printCollection((Collection<?>)bean, property.getGenericParamType(0), builder, indent);
		} else if(bean instanceof Map){
			printMap((Map<?,?>)bean, property.getGenericParamType(0),property.getGenericParamType(1),builder, indent);
		} else if(bean.getClass().isArray()){
			printArray((Object[])bean, property.typeSpec().getComponentType(), builder, indent);
		} else {
			print(bean, (BeanMetadata<T>)factory.create(bean.getClass()), builder, indent);
		}	
	}

	public void printMap(Map<?,?> map, Type keyParamType, Type valueParamType, StringBuilder builder, String indent) {

		builder.append(" ").append(map.size()).append(" {");
		
		if (valueParamType == null || !TypeUtils.isSimpleValueType(valueParamType)) {
			for (Map.Entry<?, ?> entry : map.entrySet()) {
				builder.append("\t\t").append(entry.getKey()).append("=");
				
				Object value = entry.getValue();
				if(value != null){
					BeanMetadata<?> meta = factory.create(value.getClass());
					print(value, meta, builder, indent + "\t\t");
				} else {
					builder.append("null");
				}
				builder.append("\n").append(indent);
			}
		} else {
			for (Map.Entry<?, ?> entry : map.entrySet()) {
				builder.append("\t").append(entry.getKey()).append("=");
				builder.append(entry.getValue());
				builder.append("\n").append(indent);
			}
		}
		builder.append("\t}");
	}
	
	public void printCollection(Collection<?> collection, Type genericParamType, StringBuilder builder, String indent) {
		builder.append(" ").append(collection.size()).append(" [");
		Class<?>elementClass = null;
		
		if((genericParamType != null) && genericParamType instanceof Class){
			elementClass = (Class<?>)genericParamType;
		}

		if (elementClass == null || !TypeUtils.isSimpleValueType(elementClass)) {
			for (Object value : collection) {
				if(value != null){
					if(TypeUtils.isSimpleValueType(value.getClass())){
						builder.append(value);
					} else {
						BeanMetadata<?> meta = factory.create(value.getClass());
						print(value, meta, builder, indent + "\t");
					}
				} else {
					builder.append("null");
				}
				builder.append("\n").append(indent).append("\t");
			}
			builder.append("]");
		} else {
			boolean first = true;
			for (Object value : collection) {
				if(first){
					first = false;
				} else {
					builder.append(",");
				}
				if (value == null) {
					builder.append("null");
				} else if (value instanceof CharSequence) {
					builder.append("\"").append(value).append("\"");
				} else {
					builder.append(value);
				}
			}
			builder.append("]");
		}
		
	}
	
	public void printArray(Object arrayObj, TypeSpec compType, StringBuilder builder, String indent) {
		if (arrayObj != null) {
			Iterable<?> array = TypeUtils.toArrayIterable(arrayObj, compType);
			
			builder.append(" ").append(TypeUtils.getArrayLength(arrayObj)).append(" [");
			if (compType.isSimpleValueType()) {
//				builder.append("\n\t").append(indent);
				boolean first = true;
				for (Object value : array) {
					if(first){
						first = false;
					} else {
						builder.append(",");
					}
					if (value == null) {
						builder.append("null");
					} else if (compType.isText()) {
						builder.append("\"").append(value).append("\"");
					} else {
						builder.append(value);
					}
				}
				builder.append("]");
			} else {
				for (Object child : array) {
					print(child, factory.create(child.getClass()), builder, indent + "\t");
				}
				builder.append("\n").append(indent).append("\t]");
			}
			
			
		}
		
	}
	
	@SuppressWarnings({ "rawtypes"})
	public void print(Object bean, BeanMetadata<?> metadata, StringBuilder builder, String indent) {
		builder.append("\n").append(indent).append(metadata.type()).append("{");
		
		for (BeanProperty<?> property : metadata) {
			try {
				builder.append("\n").append(indent);
				builder.append(" ").append(property.name());
				builder.append(": ");

				TypeSpec fieldType = property.typeSpec();
				
				if (fieldType.isSimpleValueType()) {
					Object val = property.get(bean);
					
					if (val == null) {
						builder.append("null");
					} else if (fieldType.isText()) {
						builder.append("\"").append(val).append("\"");
					} else {
						builder.append(val);
					}
				} else if (fieldType.getTypeKind() == TypeKind.Collection) {
					Collection collection = (Collection)property.get(bean);
					if (collection != null) {
						printCollection(collection, property.getGenericParamType(0), builder, indent+"\t");
					}
				} else if (fieldType.getTypeKind() == TypeKind.Array) {
					printArray(property.get(bean), fieldType.getComponentType(), builder, indent);
				} else if (fieldType.getTypeKind() == TypeKind.Map) {
					Map map = (Map)property.get(bean);
					if (map != null) {
						printMap(map, property.getGenericParamType(0),property.getGenericParamType(1),builder, indent+"\t");
					}
				} else if (fieldType.getTypeKind() == TypeKind.Object) {
					Object child = property.get(bean);
					if (child != null) {
						printProperty(child, property, builder, indent + "\t");
					} else {
						builder.append("null");
					}
				} else {
					Object value = property.get(bean);
					builder.append(value);
				}
			} catch (Throwable e) {
				builder.append("\nERROR :: ").append(e.toString()).append("\n");
				e.printStackTrace();
			}
		}
		
		builder.append("\n").append(indent).append("}");
	}
}
