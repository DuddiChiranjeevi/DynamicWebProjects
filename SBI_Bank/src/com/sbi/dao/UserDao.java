
package com.sbi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sbi.config.JdbcConfig;
import com.sbi.pojo.UserAccount;

public class UserDao {
	public String createAccount(UserAccount userAccount) throws Exception {
		String sqlQuerry = " insert into sbi_account values(?,?,?,?,?,?,?,?,?)";
		Connection con = JdbcConfig.getStatement();
		PreparedStatement pstm = con.prepareStatement(sqlQuerry);

		pstm.setInt(1, userAccount.getUserId());
		pstm.setString(2, userAccount.getUserName());
		pstm.setString(3, userAccount.getPassword());
		pstm.setString(4, userAccount.getName());
		pstm.setString(5, userAccount.getAadharNo());
		pstm.setString(6, userAccount.getAddress());
		pstm.setString(7, userAccount.getMobileNo());
		pstm.setString(8, userAccount.getEmailId());
		pstm.setInt(9, userAccount.getPinNumber());

		pstm.executeUpdate();

		return "user added";
	}

	public String deleteAccountById(String mobileNo) throws Exception {

		String sqlQuerry = " delete from sbi_account where mobile_no=?";
		Connection con = JdbcConfig.getStatement();
		PreparedStatement pstm = con.prepareStatement(sqlQuerry);
		pstm.setString(1, mobileNo);
		pstm.executeUpdate();
		return " acccount delete ";

	}

	public UserAccount fetchByAll(String input) throws Exception {
		String sqlQuerry = "select *  from sbi_account where user_id=? or mobile_no=? or email_id=?";
		Connection con = JdbcConfig.getStatement();
		PreparedStatement pstm = con.prepareStatement(sqlQuerry);
		pstm.setString(1, input);
		pstm.setString(2, input);
		
		pstm.setString(3, input);
		ResultSet rs = pstm.executeQuery();
		UserAccount userAccount = new UserAccount();
		while (rs.next()) {
			userAccount.setUserId(rs.getInt(1));
			userAccount.setUserName(rs.getString(2));
			userAccount.setName(rs.getString(3));
			userAccount.setPassword(rs.getString(4));
			userAccount.setAadharNo(rs.getString(5));
			userAccount.setAddress(rs.getString(6));
			userAccount.setMobileNo(rs.getString(7));
			userAccount.setEmailId(rs.getString(8));
			userAccount.setPinNumber(rs.getInt(9));

		}

		return userAccount;
	}

	public String updateAccountBy(UserAccount userAccount) throws Exception {
		String sqlQuerry = "update sbi_account set mobile_no=? where user_id=?";
		Connection con = JdbcConfig.getStatement();
		PreparedStatement pstm = con.prepareStatement(sqlQuerry);
		pstm.setString(1, userAccount.getMobileNo());
		pstm.setInt(2, userAccount.getUserId());
		pstm.executeUpdate();
		return "row updated ";

	}

	public UserAccount fetchByMobileNo(String   mobileNo) throws Exception {

		String sqlQuerry = "select * from sbi_account where mobile_No=?";
		Connection con = JdbcConfig.getStatement();
		PreparedStatement pstm = con.prepareStatement(sqlQuerry);
		pstm.setString(1, mobileNo);
		ResultSet rs = pstm.executeQuery();
		UserAccount userAccount = new UserAccount();
		while (rs.next()) {

			userAccount.setUserId(rs.getInt(1));
			userAccount.setUserName(rs.getString(2));
			userAccount.setName(rs.getString(3));
			userAccount.setPassword(rs.getString(4));
			userAccount.setAadharNo(rs.getString(5));
			userAccount.setAddress(rs.getString(6));
			userAccount.setMobileNo(rs.getString(7));
			userAccount.setEmailId(rs.getString(8));
			userAccount.setPinNumber(rs.getInt(9));

		}
		return userAccount;
	}

	public UserAccount login(String userName, String password) throws Exception {
		String sqlQuerry = "select * from sbi_account where user_name=? and password=?";
		Connection con = JdbcConfig.getStatement();
		PreparedStatement pstm = con.prepareStatement(sqlQuerry);
		pstm.setString(1, userName);
		pstm.setString(2, password);
		ResultSet rs = pstm.executeQuery();
		UserAccount userAccount = null;
		while (rs.next()) {
			 userAccount = new UserAccount();

			userAccount.setUserId(rs.getInt(1));
			userAccount.setUserName(rs.getString(2));
			userAccount.setName(rs.getString(3));
			userAccount.setPassword(rs.getString(4));
			userAccount.setAadharNo(rs.getString(5));
			userAccount.setAddress(rs.getString(6));
			userAccount.setMobileNo(rs.getString(7));
			userAccount.setEmailId(rs.getString(8));
			userAccount.setPinNumber(rs.getInt(9));

		}
		return userAccount;

	}
public UserAccount fetchById(int userId) throws Exception {
	String sqlQuerry = "select * from sbi_account where user_id=?";
	Connection con = JdbcConfig.getStatement();
	PreparedStatement pstm = con.prepareStatement(sqlQuerry);
	pstm.setInt(1, userId);
	ResultSet rs=pstm.executeQuery();
	UserAccount userAccount=new UserAccount();
	while(rs.next()) {
		userAccount.setUserId(rs.getInt(1));
		userAccount.setUserName(rs.getString(2));
		userAccount.setName(rs.getString(3));
		userAccount.setPassword(rs.getString(4));
		userAccount.setAadharNo(rs.getString(5));
		userAccount.setAddress(rs.getString(6));
		userAccount.setMobileNo(rs.getString(7));
		userAccount.setEmailId(rs.getString(8));
		userAccount.setPinNumber(rs.getInt(9));

	}
	return userAccount;
}
}
