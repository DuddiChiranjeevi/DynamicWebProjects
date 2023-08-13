package com.hdfc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hdfc.config.JdbcConfig;
import com.hdfc.pojo.UserAccount;

public class UserDao {
public String createAccount(UserAccount userAccount) throws Exception {
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="insert into register_user values(?,?,?,?,?,?)";
	String result="login created sucessfully";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	java.util.Date utilDate=new java.util.Date();
	
	Date date=new Date(Long.valueOf(utilDate.getTime()));
	try{
		System.out.println(userAccount.toString());
	pstm.setInt(1, userAccount.getUserId());
	pstm.setString(2, userAccount.getUserName());
	pstm.setString(3, userAccount.getPassword());
	pstm.setString(4, userAccount.getMobileNo());
	pstm.setString(5, userAccount.getEmailId());
	pstm.setDate(6, date);
    pstm.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
		 result="user not created";
	}
	return result;
	
}
public UserAccount userLogin(String username,String password) throws Exception {
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="select * from register_user where user_name=? and password=?" ;
	
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	pstm.setString(1, username);
	pstm.setString(2, password);
	ResultSet rs=pstm.executeQuery();
	UserAccount userAccount=null;
	while(rs.next()) {
		userAccount=new UserAccount();
		userAccount.setUserId(rs.getInt(1));
		userAccount.setUserName(rs.getString(2));
		userAccount.setPassword(rs.getString(3));
		userAccount.setMobileNo(rs.getString(4));
		userAccount.setEmailId(rs.getString(5));
	}
	return userAccount;
}
public String deleteById(int userId) throws Exception{
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="delete from register_user where user_id=?" ;
	
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	pstm.setInt(1, userId);
	int number=pstm.executeUpdate();
	if(number>0)
	return "row sucessfully deleted";
	else
		return "no rows deleted because invalid id";
}
public String updateById(UserAccount userAccount) throws Exception{
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="update register_user set user_name=?,password=?,mobile_no=?,email_id=? where user_id=?" ;
	
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	
	pstm.setInt(1, userAccount.getUserId());
	pstm.setString(2, userAccount.getUserName());
	pstm.setString(3, userAccount.getPassword());
	pstm.setString(4, userAccount.getMobileNo());
	pstm.setString(5, userAccount.getEmailId());
	int number=pstm.executeUpdate();
	if(number>0)
	return "row sucessfully updated";
	else
		return "no rows updated because invalid id";
}
}
