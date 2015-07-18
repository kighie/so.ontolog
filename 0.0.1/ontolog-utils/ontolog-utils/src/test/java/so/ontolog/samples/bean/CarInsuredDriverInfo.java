package so.ontolog.samples.bean;


public class CarInsuredDriverInfo extends CarInsuredHumanInfo{

	private String driverNm;

	private String driverId;

	private int driverAge;

	private int cntDriversUnder21;

	private int cntDriversOver21Under26;

	private int cntDriversOver26;

	/**
	 * @return the driverNm
	 */
	public String getDriverNm() {
		return driverNm;
	}

	/**
	 * @param driverNm the driverNm to set
	 */
	public void setDriverNm(String driverNm) {
		this.driverNm = driverNm;
	}

	/**
	 * @return the driverId
	 */
	public String getDriverId() {
		return driverId;
	}

	/**
	 * @param driverId the driverId to set
	 */
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	/**
	 * @return the driverAge
	 */
	public int getDriverAge() {
		return driverAge;
	}

	/**
	 * @param driverAge the driverAge to set
	 */
	public void setDriverAge(int driverAge) {
		this.driverAge = driverAge;
	}

	/**
	 * @return the cntDriversUnder21
	 */
	public int getCntDriversUnder21() {
		return cntDriversUnder21;
	}

	/**
	 * @param cntDriversUnder21 the cntDriversUnder21 to set
	 */
	public void setCntDriversUnder21(int cntDriversUnder21) {
		this.cntDriversUnder21 = cntDriversUnder21;
	}

	/**
	 * @return the cntDriversOver21Under26
	 */
	public int getCntDriversOver21Under26() {
		return cntDriversOver21Under26;
	}

	/**
	 * @param cntDriversOver21Under26 the cntDriversOver21Under26 to set
	 */
	public void setCntDriversOver21Under26(int cntDriversOver21Under26) {
		this.cntDriversOver21Under26 = cntDriversOver21Under26;
	}

	/**
	 * @return the cntDriversOver26
	 */
	public int getCntDriversOver26() {
		return cntDriversOver26;
	}

	/**
	 * @param cntDriversOver26 the cntDriversOver26 to set
	 */
	public void setCntDriversOver26(int cntDriversOver26) {
		this.cntDriversOver26 = cntDriversOver26;
	}

}
