package com.andhra_bank.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andhra_bank.pojo.UserDetails;
import com.andhra_bank.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet("/account")
public class UserServlet extends HttpServlet {
	private UserService userService=new UserService();
ObjectMapper mapper=new ObjectMapper();
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	StringBuffer jb= new StringBuffer();
	 String line = null;
		try {
			  BufferedReader reader = req.getReader();
			  while ((line = reader.readLine()) != null)
			   jb.append(line.trim());
			 } catch (Exception e) { /*report an error*/ }

			 try {
				 System.out.println(jb.toString());
				 
				
				UserDetails userDetails=mapper.readValue(jb.toString(), UserDetails.class);
				String response= userService.createAccount(userDetails);
				 //call db to store user account info
				
				 PrintWriter out=resp.getWriter();
				 out.print(response);
			 } catch (Exception e) {
			  // crash and burn
			  throw new IOException(e.getMessage());
			 }
}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("delete method called");
	String accountNo=req.getParameter("accountNo");
	
	try {
		
		UserDetails response= userService.fetchByAccountNo(Double.parseDouble(accountNo));
		String jsonString=mapper.writeValueAsString(response);
		PrintWriter out=resp.getWriter();
		out.print(jsonString);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
@Override
protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String accountNo=req.getParameter("accountNo");
	try {
		String response=userService.deleteByAccountNo(Double.parseDouble(accountNo));
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
}

