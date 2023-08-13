package com.indianbank.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indianbank.service.UserAccountService;
@WebServlet("/forgotpassword.htm")
public class ForgotPasswordServlet extends HttpServlet {
private UserAccountService userAccountService=new UserAccountService();

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String mobileNo=req.getParameter("mobileno");
	System.out.println("mobileNo"+mobileNo);
	String forgotPasswordSec=req.getParameter("forgotpassque");
	System.out.println(forgotPasswordSec);
	boolean flag=false;
try {
	RequestDispatcher rd=null;
	flag=userAccountService.forgotPassword(mobileNo, forgotPasswordSec);
	//System.out.println(flag);
	if(flag ==true) {
	
req.setAttribute("mobileno", mobileNo);
		rd=req.getRequestDispatcher("/WEB-INF/changepassword.jsp");
	}else {
		req.setAttribute("error", "invalid mobile no  or password security quesition");
		rd=req.getRequestDispatcher("/forgotpassword.jsp");
	}
	rd.forward(req, resp);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("error message "+e.getMessage());
}

}

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String password=req.getParameter("newpassword");
	String mobileNo=req.getParameter("mobileno");
	System.out.println("mobileno"+mobileNo);
	String message=null;
	try {
		RequestDispatcher rd=null;
		message=userAccountService.updatePassword(password, mobileNo);
		if(message.equalsIgnoreCase("password updated sucessfully")) {
			rd=req.getRequestDispatcher("login.jsp");
		}else {
			req.setAttribute("updateerror", "something went wrong..!!! Please try again");
			rd=req.getRequestDispatcher("/forgotpassword.jsp");
		}
		rd.forward(req, resp);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
