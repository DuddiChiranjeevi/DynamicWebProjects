package com.benz.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.benz.pojo.EmployeeAccountInfo;
import com.benz.service.EmployeeService;
@WebServlet("/register.htm")
public class RegisterServlet  extends HttpServlet{
private EmployeeService employeeService=new EmployeeService();

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("method called in register servlet");
EmployeeAccountInfo employeeAccountInfo=new EmployeeAccountInfo();
employeeAccountInfo.setEmpName(req.getParameter("empname"));
employeeAccountInfo.setUserName(req.getParameter("username"));
employeeAccountInfo.setPassword(req.getParameter("password"));
System.out.println("password"+employeeAccountInfo.getPassword());
employeeAccountInfo.setMobileNo(req.getParameter("mobileno"));
employeeAccountInfo.setEmailId(req.getParameter("emailid"));
employeeAccountInfo.setDateOfBirth(java.sql.Date.valueOf(req.getParameter("dateofbirth")));
employeeAccountInfo.setAadhaarNo(req.getParameter("aadhaarno"));
employeeAccountInfo.setDateOfJoining(java.sql.Date.valueOf(req.getParameter("dateofjoining")));
employeeAccountInfo.setAge(Integer.parseInt(req.getParameter("age")));
employeeAccountInfo.setGender(req.getParameter("gender"));
employeeAccountInfo.setAccountNo(Long.parseLong((req.getParameter("accountno"))));
employeeAccountInfo.setPanNo(req.getParameter("panno"));
System.out.println(employeeAccountInfo);
String response=null;
RequestDispatcher rd=null;

try {
	response=employeeService.createAccount(employeeAccountInfo);
if ( response!=null &&response.equalsIgnoreCase("user created sucessfully")) {
	System.out.println( "response::"+response);

	req.setAttribute("sucess", "emloyee registered");
		rd=req.getRequestDispatcher("/WEB-INF/menu.jsp");
	}
		
} catch (Exception e) {
	req.setAttribute("registererror", "login not created due to:"+e.getMessage());
	rd=req.getRequestDispatcher("/register.jsp");
	
	System.out.println(e.getMessage());

	rd.forward(req, resp);
}








}
}
