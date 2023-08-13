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

@WebServlet("/getdata")
public class FetchById  extends HttpServlet{
	private  VoterService voterService=new VoterService();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String voterId=req.getParameter("voterid");
		RequestDispatcher rd=null;
VoterList voterList=null;

		try {
			
		voterList=voterService.fetchById(Integer.parseInt(voterId));
			if (voterList !=null) {
				System.out.println(voterList);
				rd=req.getRequestDispatcher("/WEB-INF/getdata.jsp"); 
				req.setAttribute("voterid", voterList.getVoterId());
				req.setAttribute("votername", voterList.getVoterName());
				req.setAttribute("fathername", voterList.getFatherName());
				req.setAttribute("dateofbirth", voterList.getDateOfBirth());
				req.setAttribute("age", voterList.getAge());
				req.setAttribute("aadharno", voterList.getAadharNo());
				req.setAttribute("emailid", voterList.getEmailId());
				req.setAttribute("cast", voterList.getCast());
				req.setAttribute("constituency", voterList.getConstituency());
				req.setAttribute("mandal", voterList.getMandal());
				req.setAttribute("district", voterList.getDistrict());
				req.setAttribute("state", voterList.getState());

			}else {
				req.setAttribute("error", "no  record found with this id");
				req.getRequestDispatcher("login.jsp");
				
				
				
			}
			rd.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	


}
