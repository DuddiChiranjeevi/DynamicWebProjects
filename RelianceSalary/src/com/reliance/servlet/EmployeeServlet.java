package com.reliance.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reliance.dao.EmployeeDao;
import com.reliance.pojo.EmployeeAccount;
import com.reliance.service.EmployeeService;
@WebServlet("/login")
public class EmployeeServlet  extends HttpServlet{
	private EmployeeService employeeService=new EmployeeService();
private EmployeeDao employeeDao=new EmployeeDao();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post mthod called");
		String empId=req.getParameter("empId");
		String userName=req.getParameter("userName");
		String password=req.getParameter("password");
		String empName=req.getParameter("empName");
		String aadharNo=req.getParameter("aadharNo");
		String  mobileNo=req.getParameter("mobileNo");
		String salary=req.getParameter("salary");
		EmployeeAccount employeeAccount=null;
		employeeAccount.setEmpId(Integer.parseInt(empId));
		employeeAccount.setUserName(userName);
		employeeAccount.setPassword(password);
		employeeAccount.setEmpName(empName);
		employeeAccount.setAadharNo(aadharNo);
		employeeAccount.setMobileNo(mobileNo);
		employeeAccount.setSalary(Double.parseDouble(salary));
			System.out.println(employeeAccount);
		
		
	try {
		employeeDao.createLogin(employeeAccount);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
req.setAttribute(empId, employeeAccount.getEmpId());
req.setAttribute(userName, employeeAccount.getUserName());
req.setAttribute(password, employeeAccount.getPassword());
req.setAttribute(empName, employeeAccount.getEmpName());
req.setAttribute(aadharNo, employeeAccount.getAadharNo());
req.setAttribute(mobileNo, employeeAccount.getMobileNo());
req.setAttribute(salary, employeeAccount.getSalary());
RequestDispatcher rd=req.getRequestDispatcher("WEB_INF/employeeDetails.jsp");
rd.forward(req, resp);

	}
	
	
	}
	
	


