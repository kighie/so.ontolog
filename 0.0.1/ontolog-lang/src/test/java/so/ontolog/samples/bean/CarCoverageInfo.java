package so.ontolog.samples.bean;

import java.math.BigDecimal;
import java.util.List;

public class CarCoverageInfo {

	
	private String cvCd;

	
	private String clauClCd;

	
	private BigDecimal entrAmount;

	
	private String frYn;

	
	private String entrClCd;

	
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

	public void addCarCovrPremInfo(CarCovrPremInfo carCovrPremInfo) {
		this.carCovrPremInfos.add(carCovrPremInfo);
	}


	public CarCovrPremInfo getCarCovrPremInfo(int index) {
		return this.carCovrPremInfos.get(index);
	}

}
