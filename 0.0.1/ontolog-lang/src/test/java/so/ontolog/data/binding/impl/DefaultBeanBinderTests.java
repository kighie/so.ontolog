package so.ontolog.data.binding.impl;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import so.ontolog.data.binding.BeanBinder;
import so.ontolog.data.binding.Binder;
import so.ontolog.data.binding.factory.CachedBeanBinderFactory;
import so.ontolog.samples.bean.CarCoverageInfo;
import so.ontolog.samples.bean.CarCovrPremInfo;
import so.ontolog.samples.bean.CarEntryDsgnInfo;
import so.ontolog.samples.bean.CarInsuredCarInfo;
import so.ontolog.samples.bean.CarInsuredDriverInfo;
import so.ontolog.samples.bean.CarInsuredHumanInfo;
import so.ontolog.samples.bean.CarPremiumRateInfo;
import so.ontolog.samples.bean.ComplexBean;
import so.ontolog.samples.bean.SampleBean;
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void testSampleBean() throws MalformedURLException{
		CachedBeanBinderFactory factory = CachedBeanBinderFactory.getInstance();
		BeanBinder<SampleBean> binder = factory.createBeanBinder(SampleBean.class);

		SampleBean sampleBean = filler.fillData(new SampleBean(), binder);
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("AAA");
		list1.add("BBB");
		list1.add("CCC");
		sampleBean.setPropList(list1);
		
		ArrayList list2 = new ArrayList();
		list2.add("AAA");
		list2.add(34);
		list2.add(new Date());
		sampleBean.setPropList2(list2);
		
		sampleBean.setPropArray(new int[]{1,23,4,5,53,23,24});
		
		Map<String,BigDecimal> propMap = new HashMap<String, BigDecimal>();
		propMap.put("A", new BigDecimal(3));
		propMap.put("B", new BigDecimal(4));
		propMap.put("C", new BigDecimal(5));
		propMap.put("D", new BigDecimal(6));
		propMap.put("E", new BigDecimal(7));
		
		sampleBean.setPropMap(propMap);
		

		HashMap propMap2 = new HashMap();
		propMap2.put("A", new BigDecimal(3));
		propMap2.put("B", "Text2");
		propMap2.put("C", new Date());
		propMap2.put("D", new URL("http://google.com"));
		propMap2.put("E", 4);
		
		sampleBean.setPropMap2(propMap2);
		
		StringBuilder builder = new StringBuilder();
		binder.print(sampleBean, builder);
		System.out.println(builder);
		
		Binder propMap2Binder = binder.getFieldBinder(null, "propMap2");
		
		propMap2Binder.setValue(propMap2, "B", "SSSSSS");
		
		
	}
	
}
