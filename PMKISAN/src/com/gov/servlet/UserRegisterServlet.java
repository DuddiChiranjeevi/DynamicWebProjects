package com.gov.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gov.pojo.UserDetails;
import com.gov.service.UserService;
@WebServlet("/register")
public class UserRegisterServlet  extends HttpServlet{
	private UserService userService=new UserService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userid=req.getParameter("userid");
		String username=req.getParameter("username");
		String fathername=req.getParameter("fathername");
		String dateofbirth=req.getParameter("dateofbirth");
		String age=req.getParameter("age");
		String mobileno=req.getParameter("mobileno");
		String bankac=req.getParameter("bankac");
		String ifsc=req.getParameter("ifsc");
		String landpassbook=req.getParameter("landpassbook");
		String village=req.getParameter("village");
		String mandal=req.getParameter("mandal");
		String district=req.getParameter("district");
		String state=req.getParameter("state");
		UserDetails userDetails=new UserDetails();
		userDetails.setUserId(Integer.parseInt(userid));
		userDetails.setUserName(username);
		userDetails.setFatherName(fathername);
		userDetails.setDateOfBirth(dateofbirth);
		userDetails.setAge(Integer.parseInt(age));
		userDetails.setMobileNo(mobileno);
		userDetails.setBankAc(bankac);
		userDetails.setIfsc(ifsc);
		userDetails.setLandPassbook(landpassbook);
		userDetails.setVillage(village);
		userDetails.setMandal(mandal);
		userDetails.setDistrict(district);
		userDetails.setState(state);
		

		RequestDispatcher rd=null;

		try {
			userService.createUser(userDetails);
			System.out.println(userDetails);
			rd=req.getRequestDispatcher("/WEB-INF/userregister.jsp");
			rd.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
