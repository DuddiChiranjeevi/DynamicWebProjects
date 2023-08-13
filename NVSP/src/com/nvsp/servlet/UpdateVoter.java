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
@WebServlet("/update")
public class UpdateVoter extends HttpServlet {
	private VoterService voterService=new VoterService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post method called in update servlet");
		String voertid=req.getParameter("voterid");
		String votername=req.getParameter("votername");
		
		VoterList voterList=new VoterList();
		voterList.setVoterId(Integer.parseInt(voertid));
		voterList.setVoterName(votername);
		
		System.out.println(voterList);
		RequestDispatcher rd=null;
		try {
			voterService.updateById(voterList);
			
			rd=req.getRequestDispatcher("/Web-INF/update.jsp");
			
			rd.forward(req, resp);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	

}
