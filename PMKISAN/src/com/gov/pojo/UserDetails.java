package com.gov.pojo;

public class UserDetails {
	private int userId;
	private String userName;
	private String fatherName;
	private String dateOfBirth;
	private int  age;
	private String mobileNo;
	private String bankAc;                                               //13 lines
	private String ifsc;
	private String landPassbook;
	private String village;
	private String mandal;
	private String district;
	private String state;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getBankAc() {
		return bankAc;
	}
	public void setBankAc(String bankAc) {
		this.bankAc = bankAc;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getLandPassbook() {
		return landPassbook;
	}
	public void setLandPassbook(String landPassbook) {
		this.landPassbook = landPassbook;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
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
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", fatherName=" + fatherName
				+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", mobileNo=" + mobileNo + ", bankAc=" + bankAc
				+ ", ifsc=" + ifsc + ", landPassbook=" + landPassbook + ", village=" + village + ", mandal=" + mandal
				+ ", district=" + district + ", state=" + state + "]";
	}
	
	
	//13 lines

	}
