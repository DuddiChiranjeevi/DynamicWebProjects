package com.chubb.pojo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import com.chubb.config.JDBCConfig;
import com.chubb.pojo.UserAccount;

public class AccountDao {
	public  String createAccount( UserAccount userAccount) throws Exception {
		java.util.Date utilDate=new java.util.Date();
		
		Date date=new Date(Long.valueOf(utilDate.getTime()));
		String sqlQuerry="insert into user_account values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection con=JDBCConfig.getStatement();
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		pstm.setDouble(1, userAccount.getAccountNo());
		pstm.setString(2, userAccount.getUserName());
		pstm.setString(3, userAccount.getPassword());
		pstm.setString(4, userAccount.getMobileNo());
		pstm.setString(5, userAccount.getEmailAddress());
		pstm.setString(6, userAccount.getPanNo());
		pstm.setString(7, userAccount.getAddress());
		pstm.setDouble(8, userAccount.getPincode());
		pstm.setInt(9, userAccount.getPinNo());
		pstm.setFloat(10, userAccount.getBalance());
		pstm.setDate(11, date);
		pstm.executeUpdate();

		return "Account created sucessfully";
	}
	public UserAccount fetchByAccountNo(Double accountNo) throws Exception {
		Connection con=JDBCConfig.getStatement();
		String sqlQuerry=" select * from user_account";
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		pstm.setDouble(1, accountNo);
		ResultSet rs=pstm.executeQuery();
		UserAccount userAccount=new  UserAccount();
		while(rs.next()) {
			userAccount.setAccountNo(rs.getDouble(1));
			userAccount.setUserName(rs.getString(2));
			userAccount.setPassword(rs.getString(3));
			userAccount.setMobileNo(rs.getString(4));
			userAccount.setEmailAddress(rs.getString(5));
			userAccount.setPanNo(rs.getString(6));
			userAccount.setAddress(rs.getString(7));
			userAccount.setPincode(rs.getDouble(8));
			userAccount.setPinNo(rs.getInt(10));
			userAccount.setBalance(rs.getFloat(11));

		}
		return userAccount;
	}

}
