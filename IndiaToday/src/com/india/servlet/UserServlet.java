package com.india.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.india.dao.UserDao;
import com.india.pojo.UserDetails;
import com.india.service.UserService;


@WebServlet("/login")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private UserDao userDao=new UserDao();
       
 private UserService userService=new UserService();
	ObjectMapper mapper=new ObjectMapper();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  userId=request.getParameter("userId");
		String userName=request.getParameter("userName");
		String pasword=request.getParameter("pasword");
		String aadharNo=request.getParameter("aadharNo");
		String mobileNo=request.getParameter("mobileNo");
		String emailId=request.getParameter("emailId");
		UserDetails userDetails=new UserDetails();
		userDetails.setUserId(Integer.parseInt(userId));
		userDetails.setUserName(userName);
		userDetails.setPassword(pasword);
		userDetails.setAadharNo(aadharNo);
		userDetails.setMobileNo(mobileNo);
		userDetails.setEmailId(emailId);
try {
	userService.createLogin(userDetails);
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
RequestDispatcher rd=request.getRequestDispatcher("WEB_INF/userDetails.jsp");
			}
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				System.out.println("get in login method called");
			String mobileNo=req.getParameter("mobileNo");
			System.out.println(mobileNo);
			String jsonData=null;
			try {
				UserDetails response=userService.fetchByMobileNo(mobileNo);
				jsonData=mapper.writeValueAsString(response);
				PrintWriter out= resp.getWriter();
				System.out.println(jsonData);
				out.print(jsonData);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
			}

