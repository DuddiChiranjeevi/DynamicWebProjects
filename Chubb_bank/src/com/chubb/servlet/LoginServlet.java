package com.chubb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chubb.pojo.UserAccount;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	private UserAccount userAccount=new UserAccount();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("emailId"));
	System.out.println(req.getAttribute("password"));
		RequestDispatcher rd=req.getRequestDispatcher("WEB-INF/home.jsp");
		rd.forward(req, resp);
resp.sendRedirect("login.jsp");
	}
	

}
