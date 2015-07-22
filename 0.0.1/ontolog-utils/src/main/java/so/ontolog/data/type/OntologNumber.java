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
package so.ontolog.data.type;

import java.math.RoundingMode;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class OntologNumber<T extends Number> extends Number {
	private static final long serialVersionUID = -6373749231028897554L;
	
	protected final T innerNumber;
	
	public OntologNumber(T innerNumber) {
		this.innerNumber = innerNumber;
	}
	
	public int intValue() {
		return innerNumber.intValue();
	}

	public long longValue() {
		return innerNumber.longValue();
	}

	public float floatValue() {
		return innerNumber.floatValue();
	}

	public double doubleValue() {
		return innerNumber.doubleValue();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((innerNumber == null) ? 0 : innerNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OntologNumber<?> other = (OntologNumber<?>) obj;
		if (innerNumber == null) {
			if (other.innerNumber != null)
				return false;
		} else if (!innerNumber.equals(other.innerNumber))
			return false;
		return true;
	}

	public abstract OntologNumber<T> add(Number number);
	
	public abstract OntologNumber<T> subtract(Number number);

	public abstract OntologNumber<T> nagate(Number number);
	
	public abstract OntologNumber<T> multifly(Number number);

	public abstract OntologNumber<T> divide(Number number);

	public abstract OntologNumber<T> divide(Number number, int scale);
	
	public abstract OntologNumber<T> divide(Number number, int scale, RoundingMode rounding);
	
	public abstract OntologNumber<T> remainder(Number number);
	
	public abstract OntologNumber<T> pow(int number);
}
