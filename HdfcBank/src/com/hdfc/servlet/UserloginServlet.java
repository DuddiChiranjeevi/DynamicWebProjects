package com.hdfc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hdfc.pojo.UserAccount;
import com.hdfc.service.UserService;
@WebServlet("/login")
public class UserloginServlet  extends HttpServlet{
private UserService userService=new UserService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post method called in userloginservlet");
	String username=req.getParameter("username");
	System.out.println("username::"+username);
	String password=req.getParameter("password");
	System.out.println("password"+password);
	UserAccount userAccount=null;

	try {

		RequestDispatcher rd=null;

		userAccount=userService.userLogin(username, password);
		System.out.println(userAccount);
		if(userAccount !=null) {
		rd=req.getRequestDispatcher("/WEB-INF/menu.jsp");
		req.setAttribute("username",userAccount.getUserName());
		req.setAttribute("mobileno", userAccount.getMobileNo());
		req.setAttribute("userid", userAccount.getUserId());
		}else {
			req.setAttribute("loginerror", "please enter valid username and password");
			rd=req.getRequestDispatcher("login.jsp");
		}
rd.forward(req, resp);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	

}
