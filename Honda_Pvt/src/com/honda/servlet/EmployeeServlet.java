package com.honda.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.honda.pojo.EmployeeDetails;
import com.honda.service.EmployeeService;

import sun.rmi.server.InactiveGroupException;
@WebServlet("/register")
public class EmployeeServlet  extends HttpServlet{
	private EmployeeService employeeService=new EmployeeService();
	ObjectMapper mapper=new ObjectMapper();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StringBuffer jb=new  StringBuffer();
		String line=null;
		try {
		BufferedReader reader=req.getReader();
		while((line=reader.readLine()) !=null)
			   jb.append(line.trim());
			
		} catch (Exception e) { e.printStackTrace();  }   
		System.out.println(jb.toString());
		
			EmployeeDetails employeeDetails=mapper.readValue(jb.toString(), EmployeeDetails.class);
			
			try {
			String 	response = employeeService.registerEmployee(employeeDetails);
			PrintWriter  out=resp.getWriter();
			out.print(response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empId=req.getParameter("empId");
		String address=req.getParameter("emailId");
		try {
			String response=employeeService.updateAddress(address, Integer.parseInt(empId));
			String jsonString=mapper.writeValueAsString(response);
			PrintWriter out=resp.getWriter();
			out.print(jsonString);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empId=req.getParameter("empId");
		try {
		String  response=employeeService.deleteById(Integer.parseInt(empId));
			String jsonString=mapper.writeValueAsString(response);
			PrintWriter out=resp.getWriter();
			out.print(jsonString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String empid=req.getParameter("empid");
	String empname=req.getParameter("empname");
	EmployeeDetails employeeDetails=new EmployeeDetails();
	try {
	RequestDispatcher rd=null;
if(employeeDetails!=null) {
	rd=req.getRequestDispatcher("/WEB-INF/menu.jsp");

}
	
	}catch (Exception e) {
		e.printStackTrace();
		}
	}
	
			
		
	}
	


