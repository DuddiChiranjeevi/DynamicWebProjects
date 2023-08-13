package com.gov.service;

import com.gov.dao.UserDao;
import com.gov.pojo.UserDetails;

public class UserService {
private UserDao userDao=new UserDao();
public String createUser(UserDetails userDetails) throws Exception {
	return userDao.createUser(userDetails);
} 
public UserDetails loginBy(String userName,String mobileNo) throws Exception{
	return userDao.loginBy(userName, mobileNo);
}
}
