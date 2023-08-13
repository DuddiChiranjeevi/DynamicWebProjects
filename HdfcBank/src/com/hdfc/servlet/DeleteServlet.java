package com.hdfc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hdfc.service.UserService;
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private UserService userService=new UserService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get method called in delete servlet");
		String userId=req.getParameter("userid");
		System.out.println("userid:::::::;"+userId);
	String message=null;
		
		RequestDispatcher rd=null;
		try {
		message=userService.deleteById(Integer.parseInt(userId));
			req.setAttribute("message", message);
			
				rd=req.getRequestDispatcher("/menu.jsp");
			
			rd.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
