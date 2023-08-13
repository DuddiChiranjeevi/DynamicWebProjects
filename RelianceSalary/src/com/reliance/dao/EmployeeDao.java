package com.reliance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.reliance.config.JdbcConfig;
import com.reliance.pojo.EmployeeAccount;

public class EmployeeDao {
	public String  createLogin(EmployeeAccount employeeAccount) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="insert into employee_salary values(?,?,?,?,?,?,?)";
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		pstm.setInt(1, employeeAccount.getEmpId());
		pstm.setString(2, employeeAccount.getUserName());
		pstm.setString(3, employeeAccount.getPassword());
		pstm.setString(4, employeeAccount.getEmpName());
		pstm.setString(5, employeeAccount.getAadharNo());
		pstm.setString(6, employeeAccount.getMobileNo());
		pstm.setDouble(7, employeeAccount.getSalary());

	int total=	pstm.executeUpdate();
		
		
		return total+"::employee  created";
	}

}
