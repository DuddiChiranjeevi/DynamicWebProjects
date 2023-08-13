package com.indianbank.service;

import com.indianbank.dao.UserAccountDao;
import com.indianbank.pojo.UserAccount;

public class UserAccountService {
	private UserAccountDao userAccountDao=new UserAccountDao();
	public String createAccount(UserAccount userAccount) throws Exception {
		return userAccountDao.createAccount(userAccount);
	}
	
		public UserAccount login(String userName,String password) throws Exception {
			return userAccountDao.login(userName, password);
		}
		
		public boolean forgotPassword(String mobileNo,String forgotPasswordSec) throws Exception {
			return userAccountDao.forgotPassword(mobileNo, forgotPasswordSec);
		}
		public String updatePassword(String password,String mobileNo) throws Exception {
		return userAccountDao.updatePassword(password, mobileNo);
		}
		
}



