package com.india.service;

import com.india.dao.UserDao;
import com.india.pojo.UserDetails;

public class UserService {
private UserDao userDao=new UserDao();
public String createLogin( UserDetails userDetails) throws Exception {
	return userDao.createLogin(userDetails);	
}
public String deleteById(int  userId) throws Exception {
	return userDao.deleteById(userId);	
}
public UserDetails fetchById(int userId) throws Exception {
	return userDao.fetchById(userId);
}
public UserDetails fetchByMobileNo(String mobileNo) throws Exception {
	return userDao.fetchByMobileNo(mobileNo);
}
public String updateData(UserDetails userDetails) throws Exception {
	return userDao.updateData(userDetails);
}
}
