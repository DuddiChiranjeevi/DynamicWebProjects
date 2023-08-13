	package com.honda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.honda.config.JdbcConfig;
import com.honda.pojo.EmployeeDetails;

public class EmployeeDao {
	public String  registerEmployee(EmployeeDetails employeeDetails) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="insert into employee_account values(?,?,?,?,?,?,?)";
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		
		pstm.setInt(1, employeeDetails.getEmpId());
		pstm.setString(2, employeeDetails.getEmpName());
		pstm.setString(3, employeeDetails.getAadhaarNo());
		pstm.setInt(5, employeeDetails.getAge());
		pstm.setString(4, employeeDetails.getAddress());
		pstm.setString(6, employeeDetails.getMobileNo());
		pstm.setString(7, employeeDetails.getEmailId());
		 int total=pstm.executeUpdate();
		 return total+":Employees added sucessfully";

	}
	
	public String   updateAddress(String address,int empId) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="update employee_account set emailId=? where emp-id=? ";
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		pstm.setInt(1, empId);
		
	 int total=pstm.executeUpdate();
	return total+"data updated sucessfully";	
		
		
	}
	public String deleteById(int empId) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="delete from employee_account where emp_id =?";
		PreparedStatement pstm=con.prepareStatement(sqlQuerry);
		pstm.setInt(1, empId);
int total=		pstm.executeUpdate();
	
	
	return total+ "deleted row sucessfully";
	}

}
