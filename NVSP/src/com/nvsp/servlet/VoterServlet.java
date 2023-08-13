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
@WebServlet("/addvoter")
public class VoterServlet extends HttpServlet {
	private VoterService voterService= new VoterService();
//private VoterList voterList=new VoterList();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("do post method called ");
		String voertid=req.getParameter("voterid");
		String votername=req.getParameter("votername");
		String fathername=req.getParameter("fathername");
		String dob=req.getParameter("dob");
		String age=req.getParameter("age");
		String aadharno=req.getParameter("aadharno");
		String emailid=req.getParameter("emailid");
		String cast=req.getParameter("cast");
		String constituency=req.getParameter("constituency");
		String mandal=req.getParameter("mandal");
		String district=req.getParameter("district");
		String state=req.getParameter("state");
		VoterList voterList=new VoterList();
		voterList.setVoterId(Integer.parseInt(voertid));
		voterList.setVoterName(votername);
		voterList.setFatherName(fathername);
		voterList.setDateOfBirth(dob);
	//	System.out.println(dob);
		voterList.setAge(Integer.parseInt(age));
		voterList.setAadharNo(aadharno);
		voterList.setEmailId(emailid);
		voterList.setCast(cast);
		voterList.setConstituency(constituency);
		voterList.setMandal(mandal);
		voterList.setDistrict(district);
		voterList.setState(state);
		//System.out.println(voterList);

		RequestDispatcher rd=null;

		try {
			voterService.addVoter(voterList);
		
			rd=req.getRequestDispatcher("/WEB-INF/voterDetails.jsp");
			rd.forward(req, resp);
		} catch ( Exception e) {
		
			e.printStackTrace();
		}

	}
	

}
