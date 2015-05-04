package so.ontolog.data.table;

import java.util.Iterator;

import so.ontolog.data.record.Record;
import so.ontolog.data.record.RecordMetadata;

public class Table implements Iterable<Record> {

	protected final RecordMetadata metadata;
	
	
	public Table(RecordMetadata metadata) {
		this.metadata = metadata;
	}

	public RecordMetadata getMetadata() {
		return metadata;
	}
	
	@Override
	public Iterator<Record> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected class CursorIterator implements Iterator<Record> {
		private Record record;
		
		public CursorIterator() {
			this.record = new Record(metadata);
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Record next() {
			if(hasNext()){
				return record;
			}
			return null;
		}

		@Override
		public void remove() {
			throw new RuntimeException("Operation remove is not supported.");
		}
		
	}
}
