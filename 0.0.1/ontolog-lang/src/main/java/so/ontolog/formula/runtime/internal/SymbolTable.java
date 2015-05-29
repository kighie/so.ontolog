package so.ontolog.formula.runtime.internal;

import so.ontolog.data.common.Field;
import so.ontolog.data.common.FieldMap;
import so.ontolog.formula.runtime.QName;

public class SymbolTable extends FieldMap<QName, Field<QName>> {
	private static final long serialVersionUID = -1716640383384212455L;

	public SymbolTable(QName[] strArray, Field<QName>[] fields) {
		super(strArray, fields);
	}

	
}
