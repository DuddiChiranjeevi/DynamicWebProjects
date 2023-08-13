package com.chubb.pojo;

public class UserAccount {
	private double accountNo;
	private String userName;
	private String password;
	private String mobileNo;
	private String emailAddress;
	private String panNo;
	private String address;
	private double pincode;
	private int pinNo;
	private float balance;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserAccount [accountNo=" + accountNo + ", userName=" + userName + ", password=" + password
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + ", panNo=" + panNo + ", address="
				+ address + ", pincode=" + pincode + ", pinNo=" + pinNo + ", balance=" + balance + "]";
	}
	/**
	 * @return the accountNo
	 */
	public double getAccountNo() {
		return accountNo;
	}
	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the panNo
	 */
	public String getPanNo() {
		return panNo;
	}
	/**
	 * @param panNo the panNo to set
	 */
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the pinNumber
	 */
	public double getPincode() {
		return pincode;
	}
	/**
	 * @param pinNumber the pinNumber to set
	 */
	public void setPincode(double pincode) {
		this.pincode = pincode;
	}
	/**
	 * @return the pinNo
	 */
	public int getPinNo() {
		return pinNo;
	}
	/**
	 * @param pinNo the pinNo to set
	 */
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	/**
	 * @return the balance
	 */
	public float getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(float balance) {
		this.balance = balance;
	}
	

}
