package ch06_pjt_01.ems.utils;

public class InitSampleData {
	
	//applicationContext.xml 생성 후 코드 변경
	private String[] sNums;
	private String[] sIds;
	private String[] sPws;
	private String[] sNames;
	private int[] sAges;
	private char[] sGenders;
	private String[] sMajors;

	// getter, setter 메소드
	public String[] getsNums() {
		return sNums;
	}

	public void setsNums(String[] sNums) {
		this.sNums = sNums;
	}

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

	public String[] getsNames() {
		return sNames;
	}

	public void setsNames(String[] sNames) {
		this.sNames = sNames;
	}

	public int[] getsAges() {
		return sAges;
	}

	public void setsAges(int[] sAges) {
		this.sAges = sAges;
	}

	public char[] getsGenders() {
		return sGenders;
	}

	public void setsGenders(char[] sGenders) {
		this.sGenders = sGenders;
	}

	public String[] getsMajors() {
		return sMajors;
	}

	public void setsMajors(String[] sMajors) {
		this.sMajors = sMajors;
	}

}