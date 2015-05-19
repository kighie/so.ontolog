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
package so.ontolog.samples.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class SampleBean {

	private String propA;
	private int propB;
	private boolean propC;
	private Boolean propD;
	private int[] propArray;
	private List<String> propList;
	private Map<String,BigDecimal> propMap;
	@SuppressWarnings("rawtypes")
	private ArrayList propList2;
	@SuppressWarnings("rawtypes")
	private HashMap propMap2;
	
	
	
	public String getPropA() {
		return propA;
	}



	public void setPropA(String propA) {
		this.propA = propA;
	}



	public int getPropB() {
		return propB;
	}



	public void setPropB(int propB) {
		this.propB = propB;
	}



	public boolean isPropC() {
		return propC;
	}



	public void setPropC(boolean propC) {
		this.propC = propC;
	}



	public Boolean isPropD() {
		return propD;
	}



	public void setPropD(Boolean propD) {
		this.propD = propD;
	}



	public List<String> getPropList() {
		return propList;
	}



	public void setPropList(List<String> propList) {
		this.propList = propList;
	}



	public Map<String, BigDecimal> getPropMap() {
		return propMap;
	}



	public void setPropMap(Map<String, BigDecimal> propMap) {
		this.propMap = propMap;
	}



	@SuppressWarnings("rawtypes")
	public ArrayList getPropList2() {
		return propList2;
	}



	@SuppressWarnings("rawtypes")
	public void setPropList2(ArrayList propList2) {
		this.propList2 = propList2;
	}



	@SuppressWarnings("rawtypes")
	public HashMap getPropMap2() {
		return propMap2;
	}



	@SuppressWarnings("rawtypes")
	public void setPropMap2(HashMap propMap2) {
		this.propMap2 = propMap2;
	}



	public BigDecimal testMethod(BigDecimal number){
//		new Exception().printStackTrace();
		return number.add(new BigDecimal(33));
	}



	public int[] getPropArray() {
		return propArray;
	}



	public void setPropArray(int[] propArray) {
		this.propArray = propArray;
	}
	
	
}
