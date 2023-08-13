package com.hdfc.service;

import com.hdfc.dao.UserDao;
import com.hdfc.pojo.UserAccount;

public class UserService {
	private UserDao userDao=new UserDao();
	public String createAccount(UserAccount userAccount) throws Exception {
		return userDao.createAccount(userAccount);
	}
	public UserAccount userLogin(String username,String password) throws Exception {
		return userDao.userLogin(username, password);
	}
	
	public String deleteById(int userId) throws Exception {
		return userDao.deleteById(userId);
	}
	public String updateById(UserAccount userAccount) throws Exception {
		return userDao.updateById(userAccount);
	}
}
