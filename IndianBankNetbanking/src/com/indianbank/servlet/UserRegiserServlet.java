package com.indianbank.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indianbank.pojo.UserAccount;
import com.indianbank.service.UserAccountService;
@WebServlet("/register.htm")
public class UserRegiserServlet extends HttpServlet {
	private UserAccountService userAccountService=new UserAccountService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserAccount userAccount=new UserAccount();
		userAccount.setAccountHolderName(req.getParameter("accountholdername"));
		userAccount.setUserName(req.getParameter("username"));
		userAccount.setPassword(req.getParameter("password"));
		userAccount.setMobileNo(req.getParameter("mobileno"));
		userAccount.setEmailId(req.getParameter("emailid"));
		userAccount.setGender(req.getParameter("gender"));
		userAccount.setDob(req.getParameter("dob"));
		userAccount.setAddress(req.getParameter("address"));
		userAccount.setRole(req.getParameter("role"));
		userAccount.setForgotPasswordSec(req.getParameter("forgotpasswordsec"));
		System.out.println(userAccount);
		RequestDispatcher rd=null;
		String message=null;
		try {
	message=userAccountService.createAccount(userAccount);
	System.out.println(message);

	if(message != null && message.equalsIgnoreCase(" user created sucessfully")) {
		req.setAttribute("message", message);;

			rd=req.getRequestDispatcher("/login.jsp");
	}
;		} catch (Exception e) {
			System.out.println(e.getMessage());
			req.setAttribute("registererror", "user not created please try again"+e.getMessage());
		rd=req.getRequestDispatcher("/register.jsp");
		}
		rd.forward(req, resp);
	}

}
