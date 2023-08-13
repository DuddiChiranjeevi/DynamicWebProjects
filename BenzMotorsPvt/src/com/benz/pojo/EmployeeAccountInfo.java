package com.benz.pojo;

import java.sql.Date;

public class EmployeeAccountInfo {
private long empId;
private  String empName;
private String userName;
private String password;
private String mobileNo;
private String emailId;
private String aadhaarNo;
private Date dateOfBirth;
private int age;
private String gender;
private long accountNo;
private String panNo;
private Date dateOfJoining;
private float Salary;
private float bonus;
private Date date;
//16 lines
public long getEmpId() {
	return empId;
}
public void setEmpId(long empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
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
public String getAadhaarNo() {
	return aadhaarNo;
}
public void setAadhaarNo(String aadhaarNo) {
	this.aadhaarNo = aadhaarNo;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public String getPanNo() {
	return panNo;
}
public void setPanNo(String panNo) {
	this.panNo = panNo;
}
public Date getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(Date dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
public float getSalary() {
	return Salary;
}
public void setSalary(float salary) {
	Salary = salary;
}
public float getBonus() {
	return bonus;
}
public void setBonus(float bonus) {
	this.bonus = bonus;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "EmployeeAccountInfo [empId=" + empId + ", empName=" + empName + ", userName=" + userName + ", password="
			+ password + ", mobileNo=" + mobileNo + ", emailId=" + emailId + ", aadhaarNo=" + aadhaarNo
			+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", gender=" + gender + ", accountNo=" + accountNo
			+ ", panNo=" + panNo + ", dateOfJoining=" + dateOfJoining + ", Salary=" + Salary + ", bonus=" + bonus
			+ ", date=" + date + "]";
}

}
