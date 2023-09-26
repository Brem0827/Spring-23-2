package ch04_pjt_03.ems.member;

public class Student {

	private String sId;
	private String sPw;
	private String sPhone;
	private String sMail;
	private String sDate;
	private String sLastUpdateDate;

	public Student(String sId, String sPw, String sPhone, String sMail, String sDate, String sLastUpdateDate) {
		this.sId = sId;
		this.sPw = sPw;
		this.sPhone = sPhone;
		this.sMail = sMail;
		this.sDate = sDate;
		this.sLastUpdateDate = sLastUpdateDate;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsPw() {
		return sPw;
	}
	public void setsPw(String sPw) {
		this.sPw = sPw;
	}
	public String getsPhone() {
		return sPhone;
	}
	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}
	public String getsMail() {
		return sMail;
	}
	public void setsMail(String sMail) {
		this.sMail = sMail;
	}
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public String getsLastUpdateDate() {
		return sLastUpdateDate;
	}
	public void setsLastUpdateDate(String sLastUpdateDate) {
		this.sLastUpdateDate = sLastUpdateDate;
	}
}