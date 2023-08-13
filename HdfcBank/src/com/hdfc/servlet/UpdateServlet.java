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
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
private UserService userService=new UserService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("update servlet called");
		String userId=req.getParameter("userid");
		String userName=req.getParameter("username");
		String password=req.getParameter("password");
		String mobileNo=req.getParameter("mobileno");
		String emailId=req.getParameter("emailid");
		String message=null;
		UserAccount userAccount=new UserAccount();
		try {
			RequestDispatcher rd=null;
			
		message=userService.updateById(userAccount);
			req.setAttribute("message", message);
			rd=req.getRequestDispatcher("/update.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
