package com.benz.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLData;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.rmi.CORBA.UtilDelegate;

import com.benz.config.JdbcConfig;
import com.benz.pojo.EmployeeAccountInfo;
import com.benz.utility.RandomUtility;

import sun.util.resources.cldr.or.CalendarData_or_IN;

public class EmployeeDao {
	public String createAccount(EmployeeAccountInfo employeeAccountInfo) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="insert into benz_employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		java.util.Date utilDate=new java.util.Date();
		Date date=new Date(Long.valueOf(utilDate.getTime()));
		pstm.setLong(1, RandomUtility.generateRandom(5));
		pstm.setString(2, employeeAccountInfo.getEmpName());
		pstm.setString(3, employeeAccountInfo.getUserName());
		pstm.setString(4, employeeAccountInfo.getPassword());
		pstm.setString(5, employeeAccountInfo.getMobileNo());
		pstm.setString(6, employeeAccountInfo.getEmailId());
		pstm.setString(7, employeeAccountInfo.getAadhaarNo());
		pstm.setString(8, employeeAccountInfo.getPanNo());
		pstm.setDate(9, employeeAccountInfo.getDateOfBirth());
		pstm.setInt(10, employeeAccountInfo.getAge());
		pstm.setString(11, employeeAccountInfo.getGender());
		pstm.setLong(12, employeeAccountInfo.getAccountNo());
		pstm.setDate(13, employeeAccountInfo.getDateOfJoining());
		pstm.setFloat(14, 0.0f);
		pstm.setFloat(15, 0.0f);
		pstm.setDate(16, date);
		pstm.executeUpdate();
		return "user created sucessfully";
	}
public String  deleteById(long empId) throws Exception {
	
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="delete benz_employee where empid=? ";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	pstm.setLong(1, empId);
	int number=pstm.executeUpdate();
	String response=null;
	if(number>0) {
		response="user deleated";
		}else {
			response="no record match with thid id enter valid one!!!";
		}
	
	return response;
}
public EmployeeAccountInfo login(String userName,String password) throws Exception {
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="select * from benz_employee where user_name=? and password=? ";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	pstm.setString(1, userName);
	pstm.setString(2, password);
	ResultSet  rs=pstm.executeQuery();
	EmployeeAccountInfo employeeAccountInfo=null;
	while (rs.next()) {
		employeeAccountInfo.setEmpId(rs.getLong(1));
		
	}
		
		return employeeAccountInfo;
	}
}

