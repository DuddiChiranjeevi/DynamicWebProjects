package com.andhra_bank.fetchAllServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andhra_bank.pojo.UserDetails;
import com.andhra_bank.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet("/fetchAll")
public class FetchByAny extends HttpServlet {
	private UserService userService=new UserService();
	ObjectMapper mapper=new ObjectMapper();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do get method called");
		String accountNo=req.getParameter("accountNo");
		String userName=req.getParameter("userName");
		String mobileNo=req.getParameter("mobileNo");
		String pinNumber=req.getParameter("pinNumber");
		try {
			UserDetails response=userService.fetchByAll(Double.parseDouble(accountNo), userName, mobileNo, (Integer.parseInt(pinNumber)));
String jsonString=mapper.writeValueAsString(response);
PrintWriter out=resp.getWriter();
out.print(jsonString);

		
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
