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
package so.ontolog.data.binding.factory;

import org.junit.Test;

import so.ontolog.data.binding.BeanBinder;
import so.ontolog.data.binding.metadata.BeanMetadata;
import so.ontolog.samples.bean.CarCoverageInfo;
import so.ontolog.samples.bean.CarCovrPremInfo;
import so.ontolog.samples.bean.CarEntryDsgnInfo;
import so.ontolog.samples.bean.CarInsuredCarInfo;
import so.ontolog.samples.bean.CarInsuredDriverInfo;
import so.ontolog.samples.bean.CarInsuredHumanInfo;
import so.ontolog.samples.bean.CarPremiumRateInfo;
import so.ontolog.samples.bean.ComplexBean;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultBeanBinderFactoryTests {
	
	@Test
	public void testSimple(){
		test(CarCoverageInfo.class);
		test(CarCovrPremInfo.class);
		test(CarEntryDsgnInfo.class);
		test(CarInsuredCarInfo.class);
		test(CarInsuredDriverInfo.class);
		test(CarInsuredHumanInfo.class);
		test(CarPremiumRateInfo.class);
		test(ComplexBean.class);
	}
	
	<T> void test(Class<T>beanClass){
		DefaultBeanBinderFactory factory = DefaultBeanBinderFactory.getInstance();
		BeanBinder<T> binder1 = factory.createBeanBinder(beanClass);
		BeanMetadata<T> metadata1 = binder1.getMetadata();
		System.out.println(metadata1);
	}
}
