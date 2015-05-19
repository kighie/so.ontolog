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

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import so.ontolog.data.binding.BeanBinder;
import so.ontolog.data.binding.factory.CachedBeanBinderFactory;
import so.ontolog.samples.bean.CarCoverageInfo;
import so.ontolog.samples.bean.CarCovrPremInfo;
import so.ontolog.test.TestBeanFiller;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class BeanAdapterTests {
	
	private static TestBeanFiller filler = new TestBeanFiller();
	
	@Test
	public void testSimple(){
		CachedBeanBinderFactory factory = CachedBeanBinderFactory.getInstance();
		BeanBinder<CarCoverageInfo> binder = factory.createBeanBinder(CarCoverageInfo.class);
		CarCoverageInfo bean = new CarCoverageInfo();
		BeanAdapter<CarCoverageInfo> adapter = new BeanAdapter<CarCoverageInfo>(binder, bean);

		adapter.setValue("cvCd", "test string 1");
		adapter.setValue("clauClCd", "test string 2");
		adapter.setValue("entrAmount", 100);
		adapter.setValue("frYn", true);
		adapter.setValue("entrClCd", "test string 3");
		adapter.setValue("insuredClCd", "ONE");
		
		List<CarCovrPremInfo> carCovrPremInfos = new ArrayList<CarCovrPremInfo>();
		
		BeanBinder<CarCovrPremInfo> childBinder = factory.createBeanBinder(CarCovrPremInfo.class);

		carCovrPremInfos.add(filler.fillData(new CarCovrPremInfo(), childBinder));
		carCovrPremInfos.add(filler.fillData(new CarCovrPremInfo(), childBinder));
		carCovrPremInfos.add(filler.fillData(new CarCovrPremInfo(), childBinder));
		carCovrPremInfos.add(filler.fillData(new CarCovrPremInfo(), childBinder));
		
		adapter.setValue("carCovrPremInfos", carCovrPremInfos);
		
		StringBuilder builder = new StringBuilder();
		binder.print(bean, builder,"");
		System.out.println(builder);
	}
}
