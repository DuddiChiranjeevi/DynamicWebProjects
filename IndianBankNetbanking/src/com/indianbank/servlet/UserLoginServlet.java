package com.indianbank.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.indianbank.pojo.UserAccount;
import com.indianbank.service.UserAccountService;
@WebServlet("/login.htm")
public class UserLoginServlet extends HttpServlet {
	private UserAccountService userAccountService=new UserAccountService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName=req.getParameter("username") ;
		System.out.println("username"+userName);
		String password=req.getParameter("password");
		System.out.println("password"+password);
		UserAccount userAccount=null;

	try {
		RequestDispatcher rd=null;

		 userAccount =userAccountService.login(userName, password);

	if(userAccount !=null) {
		req.getSession().setAttribute("userAccount",userAccount);
		req.setAttribute("username", userName);
		rd=req.getRequestDispatcher("WEB-INF/home.jsp");
	}else {
		req.setAttribute("loginerror", "invalid login creaditionals");
		rd=req.getRequestDispatcher("/login.jsp");
	  }
	rd.forward(req, resp);

	} catch (Exception e) {
		System.out.println("error:"+e.getMessage());
	}

		

	}
	

}
