package com.sbi.servlet;

import java.io.BufferedReader;
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

@WebServlet("/account")
public class UserServlet extends HttpServlet {
	private UserService userService = new UserService();
	ObjectMapper mapper = new ObjectMapper();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		StringBuffer sb = new StringBuffer();
		String line = null;
		BufferedReader reader = req.getReader();
		while ((line = reader.readLine()) != null)
			sb.append(line.trim());
		UserAccount userAccount = mapper.readValue(sb.toString(), UserAccount.class);
		try {
			System.out.println(sb.toString());
			String response = userService.createAccount(userAccount);
			PrintWriter out = resp.getWriter();
			out.print(response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" delete method called");
		String mobileNo = req.getParameter("mobileNo");

		try {

			String response = userService.deleteAccountById(mobileNo);
			PrintWriter out = resp.getWriter();
			out.print(response);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get method called ");
		String type = req.getParameter("type");
		System.out.println(type+":::input type");
		String jsonData = null;
		try {
			System.out.println("enter into lopp");
			UserAccount response = userService.fetchByAll(type);
			jsonData = mapper.writeValueAsString(response);
			PrintWriter out = resp.getWriter();
			out.print(jsonData);
			System.out.println(jsonData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StringBuffer sb = new StringBuffer();
		String line = null;
		BufferedReader reader = req.getReader();
		while ((line = reader.readLine()) != null)
			sb.append(line.trim());
		UserAccount userAccount = mapper.readValue(sb.toString(), UserAccount.class);
		try {
			System.out.println(sb.toString());
			String response = userService.updateAccountBy(userAccount);
			PrintWriter out = resp.getWriter();
			out.print(response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
