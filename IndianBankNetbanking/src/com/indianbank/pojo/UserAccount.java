package com.indianbank.pojo;

import java.sql.Date;

public class UserAccount {
	private long accountNo;
	private String accountHolderName;
	private String userName;
	private String password;
	private String mobileNo;
	private String emailId;
	private String dob;            //7   date of birth
	private String gender;
	private String address;
	private Date date;          //10 place date
	private String role;
	private float balance;
	private String forgotPasswordSec;
	//13 lines
	@Override
	public String toString() {
		return "UserAccount [accountHolderName=" + accountHolderName + ", accountNo=" + accountNo + ", address="
				+ address + ", balance=" + balance + ", date=" + date + ", dob=" + dob + ", emailId=" + emailId
				+ ", forgotPasswordSec=" + forgotPasswordSec + ", gender=" + gender + ", mobileNo=" + mobileNo
				+ ", password=" + password + ", role=" + role + ", userName=" + userName + "]";
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getForgotPasswordSec() {
		return forgotPasswordSec;
	}
	public void setForgotPasswordSec(String forgotPasswordSec) {
		this.forgotPasswordSec = forgotPasswordSec;
	}
	
	
}
