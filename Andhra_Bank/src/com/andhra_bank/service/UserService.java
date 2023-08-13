package com.andhra_bank.service;

import java.sql.SQLException;
import java.util.List;

import com.andhra_bank.dao.UserDao;
import com.andhra_bank.pojo.UserDetails;

public class UserService {
	private UserDao userDao=new UserDao();
	 	public String  createAccount(UserDetails userDetails) throws Exception {
		return userDao.createAccount(userDetails);
	}
	 	public UserDetails fetchByAccountNo(double accountNo) throws Exception {
	 		return userDao.fetchByAccountNo(accountNo);
	 	}
	 	public String deleteByAccountNo(double accountNo) throws Exception {
	 		return userDao.deleteByAccountNo(accountNo);
	 	}
	 	public List<UserDetails> fetchAll(int pinNumber) throws Exception{
	 		return userDao.fetchAll(pinNumber);
	 	}
	 	public UserDetails fetchByAll(double accountNo,String userName,String MobileNo, int pinNumber) throws Exception, SQLException {
	 		return userDao.fetchByAll(accountNo, userName, MobileNo, pinNumber);
	 	}
}
