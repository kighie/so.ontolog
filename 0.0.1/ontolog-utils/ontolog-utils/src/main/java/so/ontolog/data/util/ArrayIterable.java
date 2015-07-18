package so.ontolog.data.util;

import java.util.Iterator;

public class ArrayIterable<T> implements Iterable<T>{

	private T[] array;
	
	public ArrayIterable(T[] array) {
		super();
		this.array = array;
	}

	public int length(){
		return (array != null) ? array.length : 0;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new ArrayIterator();
	}

	class ArrayIterator implements Iterator<T> {
		int cursor;
		
		@Override
		public boolean hasNext() {
			if(array==null){
				return false;
			}
			return cursor < array.length;
		}

		@Override
		public T next() {
			return array[cursor++];
		}

		@Override
		public void remove() {
			throw new RuntimeException("ArrayIterator#remove method is not supported.");
		}
		
	}
}
