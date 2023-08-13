package com.chubb.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chubb.pojo.UserAccount;
import com.cubb.service.AccountService;
import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet("/account")

public class AccountServlet  extends HttpServlet{

	
		private AccountService accountService=new AccountService();
		ObjectMapper mapper=new ObjectMapper();
		protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
			StringBuffer jb = new StringBuffer();
			 String line = null;
			System.out.println("do post method called");
			try {
				  BufferedReader reader = request.getReader();
				  while ((line = reader.readLine()) != null)
				   jb.append(line.trim());
				 } catch (Exception e) { /*report an error*/ }

				 try {
					 System.out.println(jb.toString());
					 
					
					 UserAccount userAccount=mapper.readValue(jb.toString(), UserAccount.class);
					 System.out.println(userAccount);
					 //call db to store user account info
					 String response=accountService.createAccount(userAccount);
					 PrintWriter out=resp.getWriter();
					 out.print(response);
				 } catch (Exception e) {
				  // crash and burn
				  throw new IOException(e.getMessage());
				 }
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String accountNo=req.getParameter("accountNo");
	try {
		UserAccount response=accountService.fetchByAccountNo(Double.parseDouble(accountNo));
		String jsonString=mapper.writeValueAsString(response);
		PrintWriter out=resp.getWriter();
		out.print(jsonString);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
							
		}

		
	}
	


