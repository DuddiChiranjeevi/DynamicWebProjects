package com.india.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.india.pojo.UserDetails;
import com.india.service.UserService;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
@WebServlet("/insert")
public class InsertDataServlet extends HttpServlet{
private UserService userService=new UserService();
ObjectMapper mapper=new ObjectMapper();
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	StringBuffer sb=new  StringBuffer();
	String line=null;
	BufferedReader reader=req.getReader();
	while((line=reader.readLine())!=null)
		sb.append(line.trim());
	
	UserDetails userDetails=mapper.readValue(sb.toString(), UserDetails.class);
	try {
		System.out.println(sb.toString());
	String response=userService.createLogin(userDetails);
		PrintWriter out=resp.getWriter();
		out.print(response);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Override
protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("delete method called");
String userId=req.getParameter("userId");
String userName=req.getParameter("userName");
System.out.println(userName);
try {
	String response=userService.deleteById(Integer.parseInt(userId));
	PrintWriter out=resp.getWriter();
	out.print(response);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
					
}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("get method called");
String userId=req.getParameter("userId");
System.out.println(userId);
String jsonData=null;
try {
	UserDetails response=userService.fetchById(Integer.parseInt(userId));
	jsonData=mapper.writeValueAsString(response);
	PrintWriter out= resp.getWriter();
	System.out.println(jsonData);
	out.print(jsonData);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
@Override
protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	StringBuffer sb=new  StringBuffer();
	String line=null;
	BufferedReader reader=req.getReader();
	while((line=reader.readLine())!=null)
		sb.append(line.trim());
	
	UserDetails userDetails=mapper.readValue(sb.toString(), UserDetails.class);
	System.out.println(userDetails);
	try {
		System.out.println(sb.toString());
	String response=userService.createLogin(userDetails);
		PrintWriter out=resp.getWriter();
		out.print(response);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
