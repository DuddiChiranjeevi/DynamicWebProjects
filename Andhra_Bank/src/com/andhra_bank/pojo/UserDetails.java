package com.andhra_bank.pojo;

public class UserDetails {
	private double accountNo;
	private String userName;
	private String aadhaarNo;
	private String emailId;
	private String panNo;
	private String address;
	private String mobileNo;
	private int pinNumber;
	private float balance;
	
	@Override
	public String toString() {
		return "UserDetails [accountNo=" + accountNo + ", userName=" + userName + ", aadhaarNo=" + aadhaarNo
				+ ", emailId=" + emailId + ", panNo=" + panNo + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", pinNumber=" + pinNumber + ", balance=" + balance + "]";
	}
	public double getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
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
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	

}
