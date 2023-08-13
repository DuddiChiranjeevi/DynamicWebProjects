package com.gov.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gov.config.JdbcConfig;
import com.gov.pojo.UserDetails;

public class UserDao {
	public String createUser(UserDetails userDetails) throws Exception{
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="insert into user_register values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		pstm.setInt(1, userDetails.getUserId());
		pstm.setString(2, userDetails.getUserName());
		pstm.setString(3, userDetails.getFatherName());
		pstm.setString(4, userDetails.getDateOfBirth());
		pstm.setInt(5, userDetails.getAge());
		pstm.setString(6, userDetails.getMobileNo());
		pstm.setString(7, userDetails.getBankAc());
		pstm.setString(8, userDetails.getIfsc());
		pstm.setString(9, userDetails.getLandPassbook());
		pstm.setString(10, userDetails.getVillage());
		pstm.setString(11, userDetails.getMandal());
		pstm.setString(12, userDetails.getDistrict());
		pstm.setString(13, userDetails.getState());
		pstm.executeUpdate();
		
		return "user sucessfully created";
		
	}
	public UserDetails loginBy(String userName,String mobileNo) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="select * from user_register where user_name=? and mobile_no=? ";
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		pstm.setString(1, userName);
		pstm.setString(2, mobileNo);
		ResultSet rs=pstm.executeQuery();
		UserDetails userDetails=null;
		while(rs.next()) {
			userDetails =new UserDetails();
			userDetails.setUserId(rs.getInt(1));
			userDetails.setUserName(rs.getString(2));
			userDetails.setFatherName(rs.getString(3));
			userDetails.setDateOfBirth(rs.getString(4));
			userDetails.setAge(rs.getInt(5));
			userDetails.setMobileNo(rs.getString(6));
			userDetails.setBankAc(rs.getString(7));
			userDetails.setIfsc(rs.getString(8));
			userDetails.setLandPassbook(rs.getString(9));
			userDetails.setVillage(rs.getString(10));
			userDetails.setMandal(rs.getString(11));
			userDetails.setDistrict(rs.getString(12));
			userDetails.setState(rs.getString(13));
		}
	
		return userDetails;
		
	}

}
