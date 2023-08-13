
package com.sbi.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbi.pojo.UserAccount;
import com.sbi.service.UserService;

@WebServlet("/login")

public class SbiLogin extends HttpServlet {
	private UserService userService = new UserService();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post method called");
		String userName=req.getParameter("userName");
		String password = req.getParameter("password");
		System.out.println("userName:::"+userName);
		System.out.println("password::"+password);
		UserAccount userAccount = null;

		try {
			RequestDispatcher rd = null;
			userAccount = userService.login(userName, password);
			System.out.println(userAccount);
			if (userAccount != null) {
				rd = req.getRequestDispatcher("/WEB-INF/menu.jsp");
				req.setAttribute("pinNumber", userAccount.getPinNumber());
				req.setAttribute("userName", userAccount.getUserName());
			} else {
				req.setAttribute("loginerror", "invalid username or password please enter valid data");
				rd = req.getRequestDispatcher("login.jsp");
			}

			rd.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
