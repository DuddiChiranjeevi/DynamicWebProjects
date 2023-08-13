package com.nvsp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nvsp.pojo.VoterList;
import com.nvsp.service.VoterService;

@WebServlet("/delete")
public class DeleteById  extends HttpServlet{
private VoterService voterService=new VoterService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get method called to delete record");
		String voterId=req.getParameter("voterid");
		String message =null;

		try {
			RequestDispatcher rd=null;

				message=voterService.deleteById(Integer.parseInt(voterId));
				req.setAttribute("message",message);
				rd=req.getRequestDispatcher("/delete.jsp"); 
			rd.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
	

}
