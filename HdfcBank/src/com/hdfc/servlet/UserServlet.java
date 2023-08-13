package com.hdfc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hdfc.dao.UserDao;
import com.hdfc.pojo.UserAccount;
import com.hdfc.service.UserService;
@WebServlet("/register")
public class UserServlet extends HttpServlet {
	private UserService userService=new UserService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId=req.getParameter("userid");
		String userName=req.getParameter("username");
		String password=req.getParameter("password");
		String mobileNo=req.getParameter("mobileno");
		String emailId=req.getParameter("emailid");
		String date=req.getParameter("date");
		UserAccount userAccount=new UserAccount();
		System.out.println(userId);
		userAccount.setUserId(Integer.parseInt(userId));
		userAccount.setUserName(userName);
		userAccount.setPassword(password);
		userAccount.setMobileNo(mobileNo);
		userAccount.setEmailId(emailId);
		try {
		String result=	userService.createAccount(userAccount);
		System.out.println(result);
		//PrintWriter out=resp.getWriter();
		//out.print(result);
RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/userDetails.jsp");
rd.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//resp.sendRedirect("/WEB-INF/userDetails.jsp");
	}
	
}
