package com.nvsp.pojo;

public class VoterList {
	private int voterId;
	private String voterName;
	private String fatherName;
	private String dateOfBirth;
	private int age;
	private String aadharNo;
	private String emailId;
	private String cast;
	private String constituency;
	private String mandal;
	private String district;
	private String state;
	
	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getVoterName() {
		return voterName;
	}

	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "VoterList [voterId=" + voterId + ", voterName=" + voterName + ", fatherName=" + fatherName
				+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", aadharNo=" + aadharNo + ", emailId=" + emailId
				+ ", cast=" + cast + ", constituency=" + constituency + ", mandal=" + mandal + ", district=" + district
				+ ", state=" + state + "]";
	}
	
		
}