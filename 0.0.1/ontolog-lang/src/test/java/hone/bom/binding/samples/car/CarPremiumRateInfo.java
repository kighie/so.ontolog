package hone.bom.binding.samples.car;
import java.math.BigDecimal;

/**
 * Desc : 요율 정보
 * @Author : linuxholic
 * @Date : 2011. 11. 21.
 * @Version :
 */

public class CarPremiumRateInfo {

	/** 요율 유형 구분 코드 */
	private String pmrtRtrnClcd;

	/** 적용율 */
	private BigDecimal aprt;

	/**
	 * @return the pmrtRtrnClcd
	 */
	public String getPmrtRtrnClcd() {
		return pmrtRtrnClcd;
	}

	/**
	 * @param pmrtRtrnClcd the pmrtRtrnClcd to set
	 */
	public void setPmrtRtrnClcd(String pmrtRtrnClcd) {
		this.pmrtRtrnClcd = pmrtRtrnClcd;
	}

	/**
	 * @return the aprt
	 */
	public BigDecimal getAprt() {
		return aprt;
	}

	/**
	 * @param aprt the aprt to set
	 */
	public void setAprt(BigDecimal aprt) {
		this.aprt = aprt;
	}

}
