package so.ontolog.samples.bean;

import hone.bom.binding.samples.car.CarCoverageInfo;
import hone.bom.binding.samples.car.CarCovrPremInfo;
import hone.bom.binding.samples.car.CarInsuredCarInfo;
import hone.bom.binding.samples.car.CarInsuredHumanInfo;

import java.util.List;
import java.util.Map;

public class ComplexBean {
	private CarInsuredCarInfo carInsuredCarInfo;
	private CarInsuredHumanInfo carInsuredHumanInfo;
	private CarInsuredHumanInfo[] carInsuredHumanInfoArray;
	private List<CarCoverageInfo> carCoverageInfoList;
	private Map<String, CarCovrPremInfo> carCovrPremInfoMap;
	
	
	public CarInsuredHumanInfo[] getCarInsuredHumanInfoArray() {
		return carInsuredHumanInfoArray;
	}
	public void setCarInsuredHumanInfoArray(
			CarInsuredHumanInfo[] carInsuredHumanInfoArray) {
		this.carInsuredHumanInfoArray = carInsuredHumanInfoArray;
	}
	public CarInsuredCarInfo getCarInsuredCarInfo() {
		return carInsuredCarInfo;
	}
	public void setCarInsuredCarInfo(CarInsuredCarInfo carInsuredCarInfo) {
		this.carInsuredCarInfo = carInsuredCarInfo;
	}
	public CarInsuredHumanInfo getCarInsuredHumanInfo() {
		return carInsuredHumanInfo;
	}
	public void setCarInsuredHumanInfo(CarInsuredHumanInfo carInsuredHumanInfo) {
		this.carInsuredHumanInfo = carInsuredHumanInfo;
	}
	public List<CarCoverageInfo> getCarCoverageInfoList() {
		return carCoverageInfoList;
	}
	public void setCarCoverageInfoList(List<CarCoverageInfo> carCoverageInfoList) {
		this.carCoverageInfoList = carCoverageInfoList;
	}
	public Map<String, CarCovrPremInfo> getCarCovrPremInfoMap() {
		return carCovrPremInfoMap;
	}
	public void setCarCovrPremInfoMap(
			Map<String, CarCovrPremInfo> carCovrPremInfoMap) {
		this.carCovrPremInfoMap = carCovrPremInfoMap;
	}

	
}
