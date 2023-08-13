package com.cubb.service;

import com.chubb.pojo.UserAccount;
import com.chubb.pojo.dao.AccountDao;

public class AccountService {
	private AccountDao accountDao=new AccountDao();
	public String createAccount(UserAccount userAccount)  throws Exception{
	
		return  accountDao.createAccount(userAccount) ;
	}

	public UserAccount fetchByAccountNo(double accountNo) throws Exception {
		
		return accountDao.fetchByAccountNo(accountNo);
	}
}
