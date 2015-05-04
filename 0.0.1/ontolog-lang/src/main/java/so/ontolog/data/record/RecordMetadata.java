package so.ontolog.data.record;

import java.util.List;

import so.ontolog.data.common.FieldMap;
import so.ontolog.data.util.StringArraySet;

public class RecordMetadata extends FieldMap<RecordField>{
	private static final long serialVersionUID = 5299769118204358961L;

	private final String name;

	
	public RecordMetadata(String name, String[] strArray) {
		this(name, strArray, new RecordField[strArray.length]);
	}


	public RecordMetadata(String name, String[] strArray, RecordField[] fields) {
		super(strArray, fields);
		this.name = name;
	}


	public RecordMetadata(String name, StringArraySet keySet, RecordField[] fields) {
		super(keySet, fields);
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public static RecordMetadata newMetadata(String name, List<RecordField> fieldList){
		int length = fieldList.size();
		RecordField[] fieldArray = new RecordField[length];
		fieldList.toArray(fieldArray);
		
		return newMetadata(name, fieldArray);
	}
	

	public static RecordMetadata newMetadata(String name, RecordField[] fieldArray){
		int length = fieldArray.length;
		String[] strArray = new String[length];
		
		for(int i =0; i< length; i++){
			strArray[i] = fieldArray[i].name();
		}
		
		return new RecordMetadata(name, strArray, fieldArray);
	}
}
