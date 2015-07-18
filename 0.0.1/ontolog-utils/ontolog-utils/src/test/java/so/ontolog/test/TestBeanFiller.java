package so.ontolog.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

import so.ontolog.data.binding.BeanBinder;
import so.ontolog.data.binding.metadata.BeanMetadata;
import so.ontolog.data.binding.metadata.BeanProperty;
import so.ontolog.data.type.TypeKind;

/**
 * 
 * @author kighie
 *
 */
public class TestBeanFiller {

	private String text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String number = "123456789123456789123456789123456789123456789";
	private int textCursor;
	private int numberCursor;
	private Random random = new Random(System.currentTimeMillis() % 30);
	
	public String nextString() {
		return nextString(random.nextInt(20));
	}
	
	public String nextString(int length) {
		synchronized (text) {
			int nextIndex = textCursor + length;
			if (nextIndex > text.length()) {
				textCursor = 0;
				nextIndex = length;
			}
			String str = text.substring(textCursor, nextIndex);
			textCursor = nextIndex;
			return str;
		}
	}

	public BigDecimal nextNumber() {
		return nextNumber(random.nextInt(7));
	}
	
	public BigDecimal nextNumber(int length) {
		synchronized (number) {
			int nextIndex = numberCursor + length;
			if (nextIndex > number.length()) {
				numberCursor = 0;
				nextIndex = length;
			}
			String numStr = number.substring(numberCursor, nextIndex);
			numberCursor = nextIndex;
			if(numStr.length()==0){
				numStr = "0";
			}
			return new BigDecimal(numStr);
		}
	}

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public <T> T fillData(T bean, BeanBinder<T> binder) {
		BeanMetadata<T> metadata = binder.getMetadata();

		TypeKind typeKind;
		Object value;
		for(BeanProperty<?> prop : metadata){
			if(!prop.hasSetter()){
				if(prop.hasGetter() && prop.typeKind() == TypeKind.Object){
					value = prop.get(bean);
					BeanBinder fb = binder.getFieldBeanBinder(prop.name());
					fillData(value, fb);
				}
				continue;
			}
			
			typeKind = prop.typeKind();
			switch(typeKind){
			case Number:
				value = nextNumber();
				break;
			case Text:
				value = nextString();
				break;
			case Bool:
				value = true;
				break;
			case Date:
				value = new Date();
				break;
			case Object:
				BeanBinder fb = binder.getFieldBeanBinder(prop.name());
				value = fb.newBean();
				fillData(value, fb);
				break;
			default:
				value = null;
			}
			
			prop.set(bean, value);
		}
		
		return bean;
	}
}
