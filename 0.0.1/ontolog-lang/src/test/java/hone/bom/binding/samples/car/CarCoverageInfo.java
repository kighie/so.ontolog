package hone.bom.binding.samples.car;

import java.math.BigDecimal;
import java.util.List;

/**
 * Desc : 담보 정보
 * @Author : linuxholic
 * @Date : 2011. 11. 21.
 * @Version :
 */

public class CarCoverageInfo {

	/** 담보코드 */
	private String cvCd;

	/** 약관구분 */
	private String clauClCd;

	/** 가입금액 */
	private BigDecimal entrAmount;

	/** 외화여부 */
	private String frYn;

	/** 가입구분코드 */
	private String entrClCd;

	/** 보험료 정보 */
	private List<CarCovrPremInfo> carCovrPremInfos;

	/**
	 * @return the cvCd
	 */
	public String getCvCd() {
		return cvCd;
	}

	/**
	 * @param cvCd the cvCd to set
	 */
	public void setCvCd(String cvCd) {
		this.cvCd = cvCd;
	}

	/**
	 * @return the clauClCd
	 */
	public String getClauClCd() {
		return clauClCd;
	}

	/**
	 * @param clauClCd the clauClCd to set
	 */
	public void setClauClCd(String clauClCd) {
		this.clauClCd = clauClCd;
	}

	/**
	 * @return the entrAmount
	 */
	public BigDecimal getEntrAmount() {
		return entrAmount;
	}

	/**
	 * @param entrAmount the entrAmount to set
	 */
	public void setEntrAmount(BigDecimal entrAmount) {
		this.entrAmount = entrAmount;
	}

	/**
	 * @return the frYn
	 */
	public String getFrYn() {
		return frYn;
	}

	/**
	 * @param frYn the frYn to set
	 */
	public void setFrYn(String frYn) {
		this.frYn = frYn;
	}

	/**
	 * @return the entrClCd
	 */
	public String getEntrClCd() {
		return entrClCd;
	}

	/**
	 * @param entrClCd the entrClCd to set
	 */
	public void setEntrClCd(String entrClCd) {
		this.entrClCd = entrClCd;
	}

	/**
	 * @return the carCovrPremInfos
	 */
	public List<CarCovrPremInfo> getCarCovrPremInfos() {
		return carCovrPremInfos;
	}
	public void setCarCovrPremInfos(List<CarCovrPremInfo> carCovrPremInfos) {
		this.carCovrPremInfos = carCovrPremInfos;
	}
	/**
	 * 
	 * Desc : 보험료 정보 추가
	 * @Method Name : addCarCovrPremInfo
	 * @param carCovrPremInfo
	 */
	public void addCarCovrPremInfo(CarCovrPremInfo carCovrPremInfo) {
		this.carCovrPremInfos.add(carCovrPremInfo);
	}

	/**
	 * 
	 * Desc : 지정위치에 해당하는 보험료 정보 조회
	 * @Method Name : getCarCovrPremInfo
	 * @param index
	 */
	public CarCovrPremInfo getCarCovrPremInfo(int index) {
		return this.carCovrPremInfos.get(index);
	}

}
