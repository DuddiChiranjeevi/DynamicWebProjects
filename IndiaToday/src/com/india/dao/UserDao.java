package com.india.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.india.config.JdbcConfig;
import com.india.pojo.UserDetails;

public class UserDao {
	public String createLogin( UserDetails userDetails) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="insert into signin_user values (?,?,?,?,?,?)";
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		pstm.setInt(1, userDetails.getUserId());
		pstm.setString(2, userDetails.getUserName());
		pstm.setString(3, userDetails.getPassword());
		pstm.setString(4, userDetails.getAadharNo());
		pstm.setString(5, userDetails.getMobileNo());
		pstm.setString(6, userDetails.getEmailId());
		pstm.executeUpdate();
		

		return " user login sucessfully";
	}
public String deleteById(int  userId) throws Exception {
	
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="delete  from signin_user where user_id=? ";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	
pstm.setInt(1, userId);
	pstm.executeUpdate();
	return" one row deleted";
}
public UserDetails fetchById(int userId) throws Exception {
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="select * from signin_user where user_id=? ";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	pstm.setInt(1, userId);
ResultSet rs=pstm.executeQuery();
UserDetails userDetails=new UserDetails();
while(rs.next()) {
	

	userDetails.setUserId(rs.getInt(1));
	userDetails.setUserName(rs.getString(2));
	userDetails.setPassword(rs.getString(3));
	userDetails.setAadharNo(rs.getString(4));
	userDetails.setMobileNo(rs.getString(5));
	userDetails.setEmailId(rs.getString(6));
	

}
return userDetails;

}
public UserDetails fetchByMobileNo(String mobileNo) throws Exception {
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="select * from signin_user where mobile_no=? ";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	pstm.setString(1, mobileNo);
ResultSet rs=pstm.executeQuery();
UserDetails userDetails=new UserDetails();
while(rs.next()) {
	userDetails.setUserId(rs.getInt(1));
	userDetails.setUserName(rs.getString(2));
	userDetails.setPassword(rs.getString(3));
	userDetails.setAadharNo(rs.getString(4));
	userDetails.setMobileNo(rs.getString(5));
	userDetails.setEmailId(rs.getString(6));
}
return userDetails;

}
public String updateData(UserDetails userDetails) throws Exception {
	Connection con=JdbcConfig.getStatement();
	String sqlQuerry="update signin_user set mobile_no=? where user_id=? ";
	PreparedStatement pstm=con.prepareStatement(sqlQuerry);
	pstm.setInt(1, userDetails.getUserId());
	pstm.setString(2, userDetails.getMobileNo());
	pstm.executeUpdate();
	return "data updated sucessfully";
}
}
