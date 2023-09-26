package ch04_pjt_03.ems.utils;

public class InitSampleData {
	//applicationContext.xml 생성 후 코드 변경
	private String[] sIds;
	private String[] sPws;
	private String[] sPhones;
	private String[] sMails;
	private String[] sDates;
	private String[] sLastUpdateDates;

	// getter, setter 메소드
	public String[] getsIds() {
		return sIds;
	}

	public void setsIds(String[] sIds) {
		this.sIds = sIds;
	}

	public String[] getsPws() {
		return sPws;
	}

	public void setsPws(String[] sPws) {
		this.sPws = sPws;
	}

	public String[] getsPhones() {
		return sPhones;
	}

	public void setsPhones(String[] sPhones) {
		this.sPhones = sPhones;
	}

	public String[] getsMails() {
		return sMails;
	}

	public void setsMails(String[] sMails) {
		this.sDates = sMails;
	}
	
	public String[] getsDates() {
		return sDates;
	}

	public void setsDates(String[] sDates) {
		this.sMails = sDates;
	}

	public String[] getsLastUpdateDates() {
		return sLastUpdateDates;
	}

	public void setsLastUpdateDates(String[] sLastUpdateDates) {
		this.sLastUpdateDates = sLastUpdateDates;
	}

}