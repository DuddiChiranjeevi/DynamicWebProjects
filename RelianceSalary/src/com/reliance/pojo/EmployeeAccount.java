package com.reliance.pojo;

public class EmployeeAccount {
private int empId;
private String userName;
private String password;
private String empName;
private String aadharNo;
private String mobileNo;
private double salary;

@Override
public String toString() {
	return "EmployeeAccount [empId=" + empId + ", userName=" + userName + ", password=" + password + ", empName="
			+ empName + ", aadharNo=" + aadharNo + ", mobileNo=" + mobileNo + ", salary=" + salary + "]";
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
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
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getAadharNo() {
	return aadharNo;
}
public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


}
