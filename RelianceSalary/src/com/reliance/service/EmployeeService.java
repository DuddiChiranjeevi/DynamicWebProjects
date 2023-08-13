package com.reliance.service;

import com.reliance.dao.EmployeeDao;
import com.reliance.pojo.EmployeeAccount;

public class EmployeeService {
	private EmployeeDao employeeDao=new EmployeeDao();
	public String createLogin(EmployeeAccount employeeAccount) throws Exception {
		return employeeDao.createLogin(employeeAccount);
		
	}

}
