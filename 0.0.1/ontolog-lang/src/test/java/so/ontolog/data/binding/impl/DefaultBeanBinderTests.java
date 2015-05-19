package so.ontolog.data.binding.impl;

import org.junit.Test;

import so.ontolog.data.binding.BeanBinder;
import so.ontolog.data.binding.factory.CachedBeanBinderFactory;
import so.ontolog.samples.bean.CarCoverageInfo;
import so.ontolog.samples.bean.CarCovrPremInfo;
import so.ontolog.samples.bean.CarEntryDsgnInfo;
import so.ontolog.samples.bean.CarInsuredCarInfo;
import so.ontolog.samples.bean.CarInsuredDriverInfo;
import so.ontolog.samples.bean.CarInsuredHumanInfo;
import so.ontolog.samples.bean.CarPremiumRateInfo;
import so.ontolog.samples.bean.ComplexBean;
import so.ontolog.test.TestBeanFiller;

public class DefaultBeanBinderTests {

	private static TestBeanFiller filler = new TestBeanFiller();
	
	@Test
	public void testSimple(){
		make(CarCoverageInfo.class);
		make(CarCovrPremInfo.class);
		make(CarEntryDsgnInfo.class);
		make(CarInsuredCarInfo.class);
		make(CarInsuredDriverInfo.class);
		make(CarInsuredHumanInfo.class);
		make(CarPremiumRateInfo.class);
		make(ComplexBean.class);
	}
	
	<T> T make(Class<T>beanClass){
		CachedBeanBinderFactory factory = CachedBeanBinderFactory.getInstance();
		BeanBinder<T> binder = factory.createBeanBinder(beanClass);
		
		T bean = filler.fillData(binder.newBean(), binder);
		
		StringBuilder builder = new StringBuilder();
		binder.print(bean, builder);
		System.out.println(builder);
		return bean;
	}
}
