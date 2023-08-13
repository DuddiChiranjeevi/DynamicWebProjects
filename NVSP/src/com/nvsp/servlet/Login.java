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
@WebServlet("/login")
public class Login extends HttpServlet {
	private VoterService voterService=new VoterService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("method called");
		String emailId=req.getParameter("emailid");
		System.out.println(emailId);
		String dateOfBirth=req.getParameter("dateofbirth");
		System.out.println(dateOfBirth);
		
		VoterList voterList=null;
		try {

			RequestDispatcher rd=null;
			voterList=voterService.login(emailId, dateOfBirth);
			System.out.println(voterList);

			if(voterList !=null) {
				rd=req.getRequestDispatcher("/WEB-INF/fetchdata.jsp");
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
}else{
			req.setAttribute("loginerror", "please enter corret mailid and date of birth");
			rd=req.getRequestDispatcher("login.jsp");
		}
		
			rd.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
