package com.sbi.service;

import com.sbi.dao.UserDao;
import com.sbi.pojo.UserAccount;

public class UserService {
	private UserDao userDao = new UserDao();

	public String createAccount(UserAccount userAccount) throws Exception {
		return userDao.createAccount(userAccount);
	}

	public String deleteAccountById(String mobileNo) throws Exception {
		return userDao.deleteAccountById(mobileNo);
	}

	public UserAccount fetchByAll(String input) throws Exception {
		return userDao.fetchByAll(input);
	}

	public String updateAccountBy(UserAccount userAccount) throws Exception {

		return userDao.updateAccountBy(userAccount);
	}

	public UserAccount fetchByMobileNo(String mobileNo) throws Exception {
		return userDao.fetchByMobileNo(mobileNo);
	}
	public UserAccount fetchById(int userId) throws Exception {
		return userDao.fetchById(userId);
	}

	public UserAccount login(String userName, String password) throws Exception {
		return userDao.login(userName, password);
	}
}
