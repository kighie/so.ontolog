package hone.bom.binding.samples.car;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Desc : 자동차 보험료 설계 정보
 * @Author : linuxholic
 * @Date : 2011. 11. 21.
 * @Version :
 */

public class CarEntryDsgnInfo {

	/** 피보험자 정보 */
	private final CarInsuredHumanInfo carInsuredHumanInfo = new CarInsuredHumanInfo();

	/** 자동차 정보 */
	private final CarInsuredCarInfo carInsuredCarInfo = new CarInsuredCarInfo();

	/** 운전자 정보 */
	private final CarInsuredDriverInfo carInsuredDriverInfo = new CarInsuredDriverInfo();

	/** 담보 정보 */
	private final Map<String, CarCoverageInfo> carCoverageInfos = new HashMap<String, CarCoverageInfo>();
	
	/** 요율 정보 */
	private final Map<String, CarPremiumRateInfo> carPremiumRateInfos = new HashMap<String, CarPremiumRateInfo>();
	
	/** 판매가입설계번호 */
	private String saleEntrDsgnNo;

	/** 설계순번 */
	private int dsgnSeqNo;

	/** 가입설계구분코드 */
	private String entrDsgnClCd;

	/** 판매증권번호 */
	private String salePlNo;

	/** 증권번호 */
	private String plNo;

	/** 상품코드 */
	private String productCode;

	/** 특정물건구분코드 */
	private String spcfThngClCd;

	/** 청약일자 */
	private Date subsDate;

	/** 보험시기 */
	private Date entrStartDate;

	/** 보험종기 */
	private Date entrEndDate;

	/** 보험시기시각 */
	private String entrStartTime;

	/** 보험종기시각 */
	private String entrEndTime;

	/** 모집자사번 */
	private String clpsCrNo;

	/** 모집조직ID */
	private String collOgId;

	/** 집금자사번 */
	private String colcCrNo;

	/** 집금조직ID */
	private String colmOrId;

	/** 계약보험료 */
	private BigDecimal ctrPremium;

	/**
	 * 피보험자 정보 조회
	 * @return the carInsuredHumanInfo
	 */
	public CarInsuredHumanInfo getCarInsuredHumanInfo() {
		return carInsuredHumanInfo;
	}

	/**
	 * 자동차 정보 조회
	 * @return the carInsuredCarInfo
	 */
	public CarInsuredCarInfo getCarInsuredCarInfo() {
		return carInsuredCarInfo;
	}

	/**
	 * 운전자 정보 조회
	 * @return the carInsuredDriverInfo
	 */
	public CarInsuredDriverInfo getCarInsuredDriverInfo() {
		return carInsuredDriverInfo;
	}

	/**
	 * 담보 정보 조회
	 * @return the carCoverageInfos
	 */
	public Map<String, CarCoverageInfo> getCarCoverageInfos() {
		return carCoverageInfos;
	}

	/**
	 * Desc : 담보 정보 추가
	 * @Method Name : addCarCoverageInfo
	 * @param covrCd
	 * @param carCoverageInfo
	 */
	public void addCarCoverageInfo(String covrCd, CarCoverageInfo carCoverageInfo) {
		carCoverageInfos.put(covrCd, carCoverageInfo);
	}

	/**
	 * 요율 정보 조회
	 * @return the carPremiumRateInfos
	 */
	public Map<String, CarPremiumRateInfo> getCarPremiumRateInfos() {
		return carPremiumRateInfos;
	}

	/**
	 * Desc : 요율 정보 추가
	 * @Method Name : addCarPremiumRateInfo
	 * @param rateCd
	 * @param carPremiumRateInfo
	 */
	public void addCarPremiumRateInfo(String rateCd, CarPremiumRateInfo carPremiumRateInfo) {
		carPremiumRateInfos.put(rateCd, carPremiumRateInfo);
	}

	/**
	 * @return the saleEntrDsgnNo
	 */
	public String getSaleEntrDsgnNo() {
		return saleEntrDsgnNo;
	}

	/**
	 * @param saleEntrDsgnNo the saleEntrDsgnNo to set
	 */
	public void setSaleEntrDsgnNo(String saleEntrDsgnNo) {
		this.saleEntrDsgnNo = saleEntrDsgnNo;
	}

	/**
	 * @return the dsgnSeqNo
	 */
	public int getDsgnSeqNo() {
		return dsgnSeqNo;
	}

	/**
	 * @param dsgnSeqNo the dsgnSeqNo to set
	 */
	public void setDsgnSeqNo(int dsgnSeqNo) {
		this.dsgnSeqNo = dsgnSeqNo;
	}

	/**
	 * @return the entrDsgnClCd
	 */
	public String getEntrDsgnClCd() {
		return entrDsgnClCd;
	}

	/**
	 * @param entrDsgnClCd the entrDsgnClCd to set
	 */
	public void setEntrDsgnClCd(String entrDsgnClCd) {
		this.entrDsgnClCd = entrDsgnClCd;
	}

	/**
	 * @return the salePlNo
	 */
	public String getSalePlNo() {
		return salePlNo;
	}

	/**
	 * @param salePlNo the salePlNo to set
	 */
	public void setSalePlNo(String salePlNo) {
		this.salePlNo = salePlNo;
	}

	/**
	 * @return the plNo
	 */
	public String getPlNo() {
		return plNo;
	}

	/**
	 * @param plNo the plNo to set
	 */
	public void setPlNo(String plNo) {
		this.plNo = plNo;
	}

	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * @param productCode the productCode to set
	 */
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
