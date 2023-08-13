package com.hdfc.pojo;

public class UserAccount {
private int userId;
private String userName;
private String password;
private String mobileNo;
private String emailId;


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

@Override
public String toString() {
	return "UserAccount [userId=" + userId + ", userName=" + userName + ", password=" + password + ", mobileNo="
			+ mobileNo + ", emailId=" + emailId + "]";
}

}