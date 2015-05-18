package hone.bom.binding.samples.car;
import java.math.BigDecimal;

/**
 * Desc : 담보별 보험료 정보
 * @Author : linuxholic
 * @Date : 2011. 11. 21.
 * @Version :
 */

public class CarCovrPremInfo {

	/** 금액 구분 */
	private String smClCd;

	/** 기본 보험료 */
	private BigDecimal bascPrem;

	/** 적용 보험료 */
	private BigDecimal applPrem;

	/** 년간자동차 적용 보험료 */
	private BigDecimal yearVhcApplPrem;

	/** 수납 보험료 */
	private BigDecimal rctPrem;

	/** 기본 보험료 */
	private BigDecimal rsvfPremBfrAm;

	/** 특약 자동차 적용 보험료 */
	private BigDecimal spccVhcApplPrem;

	/** 특약 년간 자동차 적용 보험료 */
	private BigDecimal spccYearVhcApplPrem;

	/** 특약 자동차 수납 보험료 */
	private BigDecimal spccVhcRctPrem;

	/** 요일제 자동차 환급 적용 보험료 */
	private BigDecimal srtdVhcRfapPrem;

	/** 요일제 년간 자동차 환급 적용 보험료 */
	private BigDecimal srtdYearVhcRfapPrem2;

	/** 요일제 자동차 환급 보험료 */
	private BigDecimal srtdVhcRfndPrem;

	/** 요일제 자동차 환급 적용 보험료3 */
	private BigDecimal srtdVhcRfapPrem3;

	/** 요일제 자동차 환급 적용 보험료4 */
	private BigDecimal srtdYearVhcRfapPrem4;

	/** 요일제 자동차 환급 보험료2 */
	private BigDecimal srtdVhcRfapPrem2;

	/** 적용 보험료 할인율 */
	private BigDecimal applPremDcRate;

	/** 환급 보험료 할인율 */
	private BigDecimal rfndPremDcRate;

	/**
	 * @return the smClCd
	 */
	public String getSmClCd() {
		return smClCd;
	}

	/**
	 * @param smClCd the smClCd to set
	 */
	public void setSmClCd(String smClCd) {
		this.smClCd = smClCd;
	}

	/**
	 * @return the bascPrem
	 */
	public BigDecimal getBascPrem() {
		return bascPrem;
	}

	/**
	 * @param bascPrem the bascPrem to set
	 */
	public void setBascPrem(BigDecimal bascPrem) {
		this.bascPrem = bascPrem;
	}

	/**
	 * @return the applPrem
	 */
	public BigDecimal getApplPrem() {
		return applPrem;
	}

	/**
	 * @param applPrem the applPrem to set
	 */
	public void setApplPrem(BigDecimal applPrem) {
		this.applPrem = applPrem;
	}

	/**
	 * @return the yearVhcApplPrem
	 */
	public BigDecimal getYearVhcApplPrem() {
		return yearVhcApplPrem;
	}

	/**
	 * @param yearVhcApplPrem the yearVhcApplPrem to set
	 */
	public void setYearVhcApplPrem(BigDecimal yearVhcApplPrem) {
		this.yearVhcApplPrem = yearVhcApplPrem;
	}

	/**
	 * @return the rctPrem
	 */
	public BigDecimal getRctPrem() {
		return rctPrem;
	}

	/**
	 * @param rctPrem the rctPrem to set
	 */
	public void setRctPrem(BigDecimal rctPrem) {
		this.rctPrem = rctPrem;
	}

	/**
	 * @return the rsvfPremBfrAm
	 */
	public BigDecimal getRsvfPremBfrAm() {
		return rsvfPremBfrAm;
	}

	/**
	 * @param rsvfPremBfrAm the rsvfPremBfrAm to set
	 */
	public void setRsvfPremBfrAm(BigDecimal rsvfPremBfrAm) {
		this.rsvfPremBfrAm = rsvfPremBfrAm;
	}

	/**
	 * @return the spccVhcApplPrem
	 */
	public BigDecimal getSpccVhcApplPrem() {
		return spccVhcApplPrem;
	}

	/**
	 * @param spccVhcApplPrem the spccVhcApplPrem to set
	 */
	public void setSpccVhcApplPrem(BigDecimal spccVhcApplPrem) {
		this.spccVhcApplPrem = spccVhcApplPrem;
	}

	/**
	 * @return the spccYearVhcApplPrem
	 */
	public BigDecimal getSpccYearVhcApplPrem() {
		return spccYearVhcApplPrem;
	}

	/**
	 * @param spccYearVhcApplPrem the spccYearVhcApplPrem to set
	 */
	public void setSpccYearVhcApplPrem(BigDecimal spccYearVhcApplPrem) {
		this.spccYearVhcApplPrem = spccYearVhcApplPrem;
	}

	/**
	 * @return the spccVhcRctPrem
	 */
	public BigDecimal getSpccVhcRctPrem() {
		return spccVhcRctPrem;
	}

	/**
	 * @param spccVhcRctPrem the spccVhcRctPrem to set
	 */
	public void setSpccVhcRctPrem(BigDecimal spccVhcRctPrem) {
		this.spccVhcRctPrem = spccVhcRctPrem;
	}

	/**
	 * @return the srtdVhcRfapPrem
	 */
	public BigDecimal getSrtdVhcRfapPrem() {
		return srtdVhcRfapPrem;
	}

	/**
	 * @param srtdVhcRfapPrem the srtdVhcRfapPrem to set
	 */
	public void setSrtdVhcRfapPrem(BigDecimal srtdVhcRfapPrem) {
		this.srtdVhcRfapPrem = srtdVhcRfapPrem;
	}

	/**
	 * @return the srtdYearVhcRfapPrem2
	 */
	public BigDecimal getSrtdYearVhcRfapPrem2() {
		return srtdYearVhcRfapPrem2;
	}

	/**
	 * @param srtdYearVhcRfapPrem2 the srtdYearVhcRfapPrem2 to set
	 */
	public void setSrtdYearVhcRfapPrem2(BigDecimal srtdYearVhcRfapPrem2) {
		this.srtdYearVhcRfapPrem2 = srtdYearVhcRfapPrem2;
	}

	/**
	 * @return the srtdVhcRfndPrem
	 */
	public BigDecimal getSrtdVhcRfndPrem() {
		return srtdVhcRfndPrem;
	}

	/**
	 * @param srtdVhcRfndPrem the srtdVhcRfndPrem to set
	 */
	public void setSrtdVhcRfndPrem(BigDecimal srtdVhcRfndPrem) {
		this.srtdVhcRfndPrem = srtdVhcRfndPrem;
	}

	/**
	 * @return the srtdVhcRfapPrem3
	 */
	public BigDecimal getSrtdVhcRfapPrem3() {
		return srtdVhcRfapPrem3;
	}

	/**
	 * @param srtdVhcRfapPrem3 the srtdVhcRfapPrem3 to set
	 */
	public void setSrtdVhcRfapPrem3(BigDecimal srtdVhcRfapPrem3) {
		this.srtdVhcRfapPrem3 = srtdVhcRfapPrem3;
	}

	/**
	 * @return the srtdYearVhcRfapPrem4
	 */
	public BigDecimal getSrtdYearVhcRfapPrem4() {
		return srtdYearVhcRfapPrem4;
	}

	/**
	 * @param srtdYearVhcRfapPrem4 the srtdYearVhcRfapPrem4 to set
	 */
	public void setSrtdYearVhcRfapPrem4(BigDecimal srtdYearVhcRfapPrem4) {
		this.srtdYearVhcRfapPrem4 = srtdYearVhcRfapPrem4;
	}

	/**
	 * @return the srtdVhcRfapPrem2
	 */
	public BigDecimal getSrtdVhcRfapPrem2() {
		return srtdVhcRfapPrem2;
	}

	/**
	 * @param srtdVhcRfapPrem2 the srtdVhcRfapPrem2 to set
	 */
	public void setSrtdVhcRfapPrem2(BigDecimal srtdVhcRfapPrem2) {
		this.srtdVhcRfapPrem2 = srtdVhcRfapPrem2;
	}

	/**
	 * @return the applPremDcRate
	 */
	public BigDecimal getApplPremDcRate() {
		return applPremDcRate;
	}

	/**
	 * @param applPremDcRate the applPremDcRate to set
	 */
	public void setApplPremDcRate(BigDecimal applPremDcRate) {
		this.applPremDcRate = applPremDcRate;
	}

	/**
	 * @return the rfndPremDcRate
	 */
	public BigDecimal getRfndPremDcRate() {
		return rfndPremDcRate;
	}

	/**
	 * @param rfndPremDcRate the rfndPremDcRate to set
	 */
	public void setRfndPremDcRate(BigDecimal rfndPremDcRate) {
		this.rfndPremDcRate = rfndPremDcRate;
	}

}
