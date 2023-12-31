package com.indianbank.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/logout.htm")
public class LogoutServlet  extends HttpServlet{
	
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("get method called in lgout servlet");
	       
	        
	        System.out.println("Session before invalidate: "+ req.getSession(false));
	  
	        req.getSession(false).invalidate();
	  
	        System.out.println("Session after invalidate: "+ req.getSession(false));
	  
	       RequestDispatcher rd=req.getRequestDispatcher("/welcome.jsp");
	       req.setAttribute("logoutmsg","you have logout successfully!!!");
	       rd.forward(req, resp);
	    }

}
