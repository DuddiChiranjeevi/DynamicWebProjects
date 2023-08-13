package com.andhra_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.andhra_bank.config.JdbcConfig;
import com.andhra_bank.pojo.UserDetails;

public class UserDao {
	public String createAccount(UserDetails userDetails) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="insert into user_account values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		pstm.setDouble(1, userDetails.getAccountNo());
		pstm.setString(2, userDetails.getUserName());
		pstm.setString(3, userDetails.getAadhaarNo());
		pstm.setString(4, userDetails.getEmailId());
		pstm.setString(5, userDetails.getPanNo());
		pstm.setString(6, userDetails.getAddress());
		pstm.setString(7, userDetails.getMobileNo());
		pstm.setInt(8, userDetails.getPinNumber());
		pstm.setFloat(9, userDetails.getBalance());
	 int total=	pstm.executeUpdate();


		
		return total +" user sucseefully added";
		
	}

	public UserDetails fetchByAccountNo(double accountNo) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="select * from user_account where account_no=?";
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		pstm.setDouble(1, accountNo);
		ResultSet rs=pstm.executeQuery();
		UserDetails userDetails=new UserDetails();
		while(rs.next()) {
			userDetails.setAccountNo(rs.getDouble(1));
			userDetails.setUserName(rs.getString(2));
			userDetails.setAadhaarNo(rs.getString(3));
			userDetails.setEmailId(rs.getString(4));
			userDetails.setPanNo(rs.getString(5));
			userDetails.setAddress(rs.getString(6));
			userDetails.setMobileNo(rs.getString(7));
			userDetails.setPinNumber(rs.getInt(8));
			userDetails.setBalance(rs.getFloat(9));



		}
		return userDetails ;
	}
public String deleteByAccountNo(double accountNo) throws Exception{
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="delete from user_account where account_no=?";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	pstm.setDouble(1, accountNo);
	int total=pstm.executeUpdate();

	return"row delete ::"+total;
}
public List<UserDetails> fetchAll(int pinNumber) throws Exception {
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="select * from user_account ";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	
	ResultSet rs=pstm.executeQuery();
	List<UserDetails>userList= new ArrayList<UserDetails>();
	while(rs.next()) {
	UserDetails userDetails=new UserDetails();
	userDetails.setAccountNo(rs.getDouble(1));
	userDetails.setUserName(rs.getString(2));
	userDetails.setAadhaarNo(rs.getString(3));
	userDetails.setEmailId(rs.getString(4));
	userDetails.setPanNo(rs.getString(5));
	userDetails.setAddress(rs.getString(6));
	userDetails.setMobileNo(rs.getString(7));
	userDetails.setPinNumber(rs.getInt(8));
	userDetails.setBalance(rs.getFloat(9));
	userList.add(userDetails);
	}
return userList;
}
public UserDetails fetchByAll(double accountNo,String userName,String MobileNo, int pinNumber) throws Exception, SQLException {
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="select * from user_account where account_no=? or user_name=? or mobile_no=? or pin_number=?";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	pstm.setDouble(1, accountNo);
	pstm.setString(1, userName);
	pstm.setString(1, MobileNo);
	pstm.setInt(1, pinNumber);
	ResultSet rs=pstm.executeQuery();
	UserDetails userDetails=new UserDetails();
	while(rs.next()) {
	
		userDetails.setAccountNo(rs.getDouble(1));
		userDetails.setUserName(rs.getString(2));
		userDetails.setAadhaarNo(rs.getString(3));
		userDetails.setEmailId(rs.getString(4));
		userDetails.setPanNo(rs.getString(5));
		userDetails.setAddress(rs.getString(6));
		userDetails.setMobileNo(rs.getString(7));
		userDetails.setPinNumber(rs.getInt(8));
		userDetails.setBalance(rs.getFloat(9));		
	}
	return userDetails;
}
}
