package com.indianbank.dao;

import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import com.indianbank.config.JdbcConfig;
import com.indianbank.pojo.UserAccount;
import com.indianbank.utility.RandomUtility;

public class UserAccountDao {
	public String createAccount(UserAccount userAccount) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="insert into  indian_bank_user values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		java.util.Date utilDate=new java.util.Date();
		Date date=new Date(Long.valueOf(utilDate.getTime()));

		pstm.setLong(1, RandomUtility. generateRandom(10));
		pstm.setString(2, userAccount.getAccountHolderName());
		pstm.setString(3, userAccount.getUserName());
		pstm.setString(4, userAccount.getPassword());
		pstm.setString(5, userAccount.getMobileNo());
		pstm.setString(6, userAccount.getEmailId());
		pstm.setString(7, userAccount.getDob());
		pstm.setString(8, userAccount.getGender());
		pstm.setString(9, userAccount.getAddress());
		pstm.setDate(10, date);
		pstm.setString(11, userAccount.getRole());
		pstm.setFloat(12, 0.0f);
		pstm.setString(13, userAccount.getForgotPasswordSec());
		pstm.executeUpdate();
		return " user created sucessfully";
	}
public UserAccount login(String userName,String password) throws Exception {
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="select * from   indian_bank_user where user_name=? and password=?";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	pstm.setString(1, userName);
	
	pstm.setString(2, password);
	ResultSet  rs=	pstm.executeQuery();
	UserAccount userAccount=null;
	while(rs.next()) {
		userAccount=new UserAccount();

		userAccount.setAccountNo(rs.getLong(1));
		userAccount.setAccountHolderName(rs.getString(2));
		userAccount.setUserName(rs.getString(3));
		userAccount.setPassword(rs.getString(4));
		userAccount.setMobileNo(rs.getString(5));
		userAccount.setEmailId(rs.getString(6));
		userAccount.setDob(rs.getString(7));
		userAccount.setGender(rs.getString(8));
		userAccount.setAddress(rs.getString(9));
		userAccount.setDate(rs.getDate(10));
		userAccount.setRole(rs.getString(11));
		userAccount.setBalance(rs.getFloat(12));
		userAccount.setForgotPasswordSec(rs.getString(13));
	
}

	return userAccount;
}
public boolean forgotPassword(String mobileNo,String forgotPasswordSec) throws Exception {
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="select * from indian_bank_user where mobile_no=? and forgot_password_sec=? ";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	pstm.setString(1, mobileNo);
	pstm.setString(2, forgotPasswordSec);
ResultSet rs=pstm.executeQuery();
boolean flag=false;
while(rs.next()) {
	flag=true;
}
	return flag;
}
public String updatePassword(String password ,String mobileNo) throws Exception {
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="update indian_bank_user set password=? where mobile_no=? ";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	pstm.setString(1, password);
	pstm.setString(2, mobileNo);
	int number=pstm.executeUpdate();
	String response=null;
	if(number>0) {
		response="password updated sucessfully";
	}else {
		response="password not updated please try again......";
	}
	return response;
}

}

