package com.chubb.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebService(0)
public class MailLogin extends HttpServlet {
	public void service(ServletRequest request,ServletResponse response) throws IOException,ServletException {
		PrintWriter out=response.getWriter();
		out.print("pleasw enter your gmail and password");
		
	}

}
