package com.honda.service;

import com.honda.dao.EmployeeDao;
import com.honda.pojo.EmployeeDetails;

public class EmployeeService {
	private EmployeeDao employeeDao=new EmployeeDao();
	public String  registerEmployee(EmployeeDetails employeeDetails) throws Exception {
		return employeeDao.registerEmployee(employeeDetails);
	}
	public String   updateAddress( String address,int empId) throws Exception {
	return employeeDao.updateAddress(address, empId);
	}
	public String deleteById(int empId) throws Exception {
		return employeeDao.deleteById(empId);
	}
	
	}

