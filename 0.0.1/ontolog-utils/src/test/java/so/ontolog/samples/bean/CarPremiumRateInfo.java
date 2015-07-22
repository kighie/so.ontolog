package so.ontolog.samples.bean;
import java.math.BigDecimal;

public class CarPremiumRateInfo {

	private String pmrtRtrnClcd;

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
