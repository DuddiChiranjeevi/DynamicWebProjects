package com.gov.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import com.gov.pojo.UserDetails;
import com.gov.service.UserService;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private UserService userService=new UserService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("method called in login servlet");
		String userName=req.getParameter("username");
		System.out.println("username"+userName);
		String mobileNo=req.getParameter("mobileno");
		RequestDispatcher rd=null;
		UserDetails userDetails=null;
		
		try {
	userDetails=userService.loginBy(userName, mobileNo);
	if(userDetails !=null) {
		System.out.println(userDetails);
		rd=req.getRequestDispatcher("/WEB-INF/getdata.jsp");
		req.setAttribute("userid", userDetails.getUserId());
		req.setAttribute("username", userDetails.getUserName());
		req.setAttribute("fathername", userDetails.getFatherName());
		req.setAttribute("dateofbirth", userDetails.getDateOfBirth());
		req.setAttribute("age", userDetails.getAge());
		req.setAttribute("mobileno", userDetails.getMobileNo());
		req.setAttribute("bankac", userDetails.getBankAc());
		req.setAttribute("ifsc", userDetails.getIfsc());
		req.setAttribute("landpassbook", userDetails.getLandPassbook());
		req.setAttribute("village", userDetails.getVillage());
		req.setAttribute("mandal", userDetails.getMandal());
		req.setAttribute("district", userDetails.getDistrict());
		req.setAttribute("state", userDetails.getState());

	}else {
		req.setAttribute("loginerror", "invalid login creditionals");
		rd=req.getRequestDispatcher("login.jsp");
	}
	rd.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
