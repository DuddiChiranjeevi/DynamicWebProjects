package com.benz.service;

import com.benz.dao.EmployeeDao;
import com.benz.pojo.EmployeeAccountInfo;

public class EmployeeService {
private EmployeeDao employeeDao=new EmployeeDao();
public String createAccount (EmployeeAccountInfo employeeAccountInfo) throws Exception {
	return employeeDao.createAccount(employeeAccountInfo );
}
}
