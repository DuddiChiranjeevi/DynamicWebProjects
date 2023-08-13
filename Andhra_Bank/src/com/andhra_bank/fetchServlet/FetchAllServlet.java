package com.andhra_bank.fetchServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andhra_bank.pojo.UserDetails;
import com.andhra_bank.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet("/fetch")
public class FetchAllServlet  extends HttpServlet{
	private UserService userService=new UserService();
	ObjectMapper mapper=new ObjectMapper();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String pinNumber=req.getParameter("pinNumber");

try {
	List<UserDetails> response= userService.fetchAll(Integer.parseInt(pinNumber));
	String jsonString=mapper.writeValueAsString(response);
	PrintWriter out=resp.getWriter();
	out.print(jsonString);
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

	
	
	}
	
	
	


