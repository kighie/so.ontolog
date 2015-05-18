package so.ontolog.samples.bean;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class CarEntryDsgnInfo {

	
	private final CarInsuredHumanInfo carInsuredHumanInfo = new CarInsuredHumanInfo();

	
	private final CarInsuredCarInfo carInsuredCarInfo = new CarInsuredCarInfo();

	
	private final CarInsuredDriverInfo carInsuredDriverInfo = new CarInsuredDriverInfo();

	
	private final Map<String, CarCoverageInfo> carCoverageInfos = new HashMap<String, CarCoverageInfo>();
	
	
	private final Map<String, CarPremiumRateInfo> carPremiumRateInfos = new HashMap<String, CarPremiumRateInfo>();
	
	
	private String saleEntrDsgnNo;

	
	private int dsgnSeqNo;

	
	private String entrDsgnClCd;

	
	private String salePlNo;

	private String plNo;

	private String productCode;

	
	private String spcfThngClCd;

	
	private Date subsDate;

	
	private Date entrStartDate;

	
	private Date entrEndDate;

	
	private String entrStartTime;

	
	private String entrEndTime;

	
	private String clpsCrNo;

	
	private String collOgId;

	
	private String colcCrNo;

	
	private String colmOrId;

	
	private BigDecimal ctrPremium;

	public CarInsuredHumanInfo getCarInsuredHumanInfo() {
		return carInsuredHumanInfo;
	}

	public CarInsuredCarInfo getCarInsuredCarInfo() {
		return carInsuredCarInfo;
	}

	public CarInsuredDriverInfo getCarInsuredDriverInfo() {
		return carInsuredDriverInfo;
	}

	public Map<String, CarCoverageInfo> getCarCoverageInfos() {
		return carCoverageInfos;
	}

	public void addCarCoverageInfo(String covrCd, CarCoverageInfo carCoverageInfo) {
		carCoverageInfos.put(covrCd, carCoverageInfo);
	}

	public Map<String, CarPremiumRateInfo> getCarPremiumRateInfos() {
		return carPremiumRateInfos;
	}

	public void addCarPremiumRateInfo(String rateCd, CarPremiumRateInfo carPremiumRateInfo) {
		carPremiumRateInfos.put(rateCd, carPremiumRateInfo);
	}

	public String getSaleEntrDsgnNo() {
		return saleEntrDsgnNo;
	}

	public void setSaleEntrDsgnNo(String saleEntrDsgnNo) {
		this.saleEntrDsgnNo = saleEntrDsgnNo;
	}

	public int getDsgnSeqNo() {
		return dsgnSeqNo;
	}

	public void setDsgnSeqNo(int dsgnSeqNo) {
		this.dsgnSeqNo = dsgnSeqNo;
	}

	public String getEntrDsgnClCd() {
		return entrDsgnClCd;
	}

	public void setEntrDsgnClCd(String entrDsgnClCd) {
		this.entrDsgnClCd = entrDsgnClCd;
	}

	public String getSalePlNo() {
		return salePlNo;
	}

	public void setSalePlNo(String salePlNo) {
		this.salePlNo = salePlNo;
	}

	public String getPlNo() {
		return plNo;
	}

	public void setPlNo(String plNo) {
		this.plNo = plNo;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * @return the spcfThngClCd
	 */
	public String getSpcfThngClCd() {
		return spcfThngClCd;
	}

	/**
	 * @param spcfThngClCd the spcfThngClCd to set
	 */
	public void setSpcfThngClCd(String spcfThngClCd) {
		this.spcfThngClCd = spcfThngClCd;
	}

	/**
	 * @return the subsDate
	 */
	public Date getSubsDate() {
		return subsDate;
	}

	/**
	 * @param subsDate the subsDate to set
	 */
	public void setSubsDate(Date subsDate) {
		this.subsDate = subsDate;
	}

	/**
	 * @return the entrStartDate
	 */
	public Date getEntrStartDate() {
		return entrStartDate;
	}

	/**
	 * @param entrStartDate the entrStartDate to set
	 */
	public void setEntrStartDate(Date entrStartDate) {
		this.entrStartDate = entrStartDate;
	}

	/**
	 * @return the entrEndDate
	 */
	public Date getEntrEndDate() {
		return entrEndDate;
	}

	/**
	 * @param entrEndDate the entrEndDate to set
	 */
	public void setEntrEndDate(Date entrEndDate) {
		this.entrEndDate = entrEndDate;
	}

	/**
	 * @return the entrStartTime
	 */
	public String getEntrStartTime() {
		return entrStartTime;
	}

	/**
	 * @param entrStartTime the entrStartTime to set
	 */
	public void setEntrStartTime(String entrStartTime) {
		this.entrStartTime = entrStartTime;
	}

	/**
	 * @return the entrEndTime
	 */
	public String getEntrEndTime() {
		return entrEndTime;
	}

	/**
	 * @param entrEndTime the entrEndTime to set
	 */
	public void setEntrEndTime(String entrEndTime) {
		this.entrEndTime = entrEndTime;
	}

	/**
	 * @return the clpsCrNo
	 */
	public String getClpsCrNo() {
		return clpsCrNo;
	}

	/**
	 * @param clpsCrNo the clpsCrNo to set
	 */
	public void setClpsCrNo(String clpsCrNo) {
		this.clpsCrNo = clpsCrNo;
	}

	/**
	 * @return the collOgId
	 */
	public String getCollOgId() {
		return collOgId;
	}

	/**
	 * @param collOgId the collOgId to set
	 */
	public void setCollOgId(String collOgId) {
		this.collOgId = collOgId;
	}

	/**
	 * @return the colcCrNo
	 */
	public String getColcCrNo() {
		return colcCrNo;
	}

	/**
	 * @param colcCrNo the colcCrNo to set
	 */
	public void setColcCrNo(String colcCrNo) {
		this.colcCrNo = colcCrNo;
	}

	/**
	 * @return the colmOrId
	 */
	public String getColmOrId() {
		return colmOrId;
	}

	/**
	 * @param colmOrId the colmOrId to set
	 */
	public void setColmOrId(String colmOrId) {
		this.colmOrId = colmOrId;
	}

	/**
	 * @return the ctrPremium
	 */
	public BigDecimal getCtrPremium() {
		return ctrPremium;
	}

	/**
	 * @param ctrPremium the ctrPremium to set
	 */
	public void setCtrPremium(BigDecimal ctrPremium) {
		this.ctrPremium = ctrPremium;
	}


}
