package com.sbi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sbi.pojo.UserAccount;
import com.sbi.service.UserService;
@WebServlet("/getdetails")
public class FetchById extends HttpServlet {
private UserService userService =new UserService();
ObjectMapper mapper=new ObjectMapper();
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String userId=req.getParameter("userId");
String jsonData=null;
try {
	UserAccount response=userService.fetchById(Integer.parseInt(userId));
	jsonData=mapper.writeValueAsString(response);
	System.out.println(jsonData);
	PrintWriter out=resp.getWriter();
	out.print(jsonData);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

}
