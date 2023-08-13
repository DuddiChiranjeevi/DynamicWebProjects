package com.sbi.pojo;

public class UserAccount {
	private int userId;
	private String userName;
	private String password;
	private String name;
	private String aadharNo;
	private String address;
	private String mobileNo;
	private String emailId;
	private int pinNumber;

	@Override
	public String toString() {
		return "UserAccount [userId=" + userId + ", userName=" + userName + ", password=" + password + ", name=" + name
				+ ", aadharNo=" + aadharNo + ", address=" + address + ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ ", pinNumber=" + pinNumber + "]";
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

}
