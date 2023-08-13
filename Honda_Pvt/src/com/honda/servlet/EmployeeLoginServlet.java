package com.honda.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.honda.pojo.EmployeeDetails;
import com.honda.service.EmployeeService;
@WebServlet("/login")
public class EmployeeLoginServlet  extends HttpServlet {
private EmployeeService employeeService=new EmployeeService();

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String empid=req.getParameter("empid");
String empname=req.getParameter("empname");
String aadhaarno=req.getParameter("aadhaarno");
String address=req.getParameter("address");
String age=req.getParameter("age");
String mobileno=req.getParameter("mobileno");
String emailid=req.getParameter("emailid");
EmployeeDetails employeeDetails=new EmployeeDetails();
employeeDetails.setEmpId(Integer.parseInt(empid));
employeeDetails.setEmpName(empname);
employeeDetails.setAadhaarNo(aadhaarno);
employeeDetails.setAddress(address);
employeeDetails.setAge(Integer.parseInt(age));
employeeDetails.setMobileNo(mobileno);
employeeDetails.setEmailId(emailid);
RequestDispatcher rd=null;

try {
String result=employeeService.registerEmployee(employeeDetails);
 rd=req.getRequestDispatcher("/WEB-INF/employeedetails.jsp");
 rd.forward(req, resp);
} catch (Exception e) {
	rd=req.getRequestDispatcher("/WEB-INF/error.jsp");
	 rd.forward(req, resp);

	e.printStackTrace();
}

}

}
