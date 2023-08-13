package com.nvsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nvsp.config.JdbcConfig;
import com.nvsp.pojo.VoterList;

public class VoterListDao {
	public String addVoter(VoterList voterList) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="insert into voter_list values(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement  pstm=con.prepareStatement(sqlQuerry);
		pstm.setInt(1, voterList.getVoterId());
		pstm.setString(2, voterList.getVoterName());
		pstm.setString(3, voterList.getFatherName());
		pstm.setString(4, voterList.getDateOfBirth());
		pstm.setInt(5, voterList.getAge());
		pstm.setString(6, voterList.getAadharNo());
		pstm.setString(7, voterList.getEmailId());
		pstm.setString(8, voterList.getCast());
		pstm.setString(9, voterList.getConstituency());
		pstm.setString(10, voterList.getMandal());
		pstm.setString(11, voterList.getDistrict());
		pstm.setString(12, voterList.getState());
pstm.executeUpdate();

	
return "voter added sucessfully";
}
	public VoterList login(String emailId ,String dateOfBirth) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="select * from voter_list where dob=? and email_id=? ";
		PreparedStatement  pstm=con.prepareStatement(sqlQuerry);
		pstm.setString(1, emailId);
		pstm.setString(2, dateOfBirth);
	ResultSet rs=pstm.executeQuery();
	VoterList voterList=null;
	while(rs.next()) {
		
		voterList=new VoterList();
		voterList.setVoterId(rs.getInt(1));
		voterList.setVoterName(rs.getString(2));
		
		voterList.setFatherName(rs.getString(3));
		voterList.setDateOfBirth(rs.getString(4));
		voterList.setAge(rs.getInt(5));
		voterList.setAadharNo(rs.getString(6));
		voterList.setEmailId(rs.getString(7));
		voterList.setCast(rs.getString(8));
		voterList.setConstituency(rs.getString(9));
		voterList.setMandal(rs.getString(10));
		voterList.setDistrict(rs.getString(11));
		voterList.setState(rs.getString(12));
		
	}
	return voterList;
	
	}
	public VoterList fetchById (int voterId) throws Exception {
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="select * from voter_list where  voter_id=? ";
		PreparedStatement  pstm=con.prepareStatement(sqlQuerry);
		pstm.setInt(1, voterId);
	ResultSet rs=pstm.executeQuery();
	VoterList voterList=null;
	while(rs.next()) {
		voterList=new VoterList();
		voterList.setVoterId(rs.getInt(1));
		voterList.setVoterName(rs.getString(2));
		
		voterList.setFatherName(rs.getString(3));
		voterList.setDateOfBirth(rs.getString(4));
		voterList.setAge(rs.getInt(5));
		voterList.setAadharNo(rs.getString(6));
		voterList.setEmailId(rs.getString(7));
		voterList.setCast(rs.getString(8));
		voterList.setConstituency(rs.getString(9));
		voterList.setMandal(rs.getString(10));
		voterList.setDistrict(rs.getString(11));
		voterList.setState(rs.getString(12));
	
	}
	return voterList;
	}
	public String deleteById(int voterId) throws Exception{
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="delete from  voter_list where  voter_id=? ";
		PreparedStatement  pstm=con.prepareStatement(sqlQuerry);
		pstm.setInt(1, voterId);
		int number=pstm.executeUpdate();
		if(number >0)
	return "row sucessfully deleted";
		else
			return "no rows deleted because invalid id";
	}
	public String updateById(VoterList voterList) throws Exception{
		Connection con=JdbcConfig.getStatement();
		String sqlQuerry="update voter_list set voter_name=? where  voter_id=? ";
		PreparedStatement  pstm=con.prepareStatement(sqlQuerry);
	
		pstm.setInt(1, voterList.getVoterId());
		pstm.setString(2, voterList.getVoterName());
		pstm.executeUpdate();
		
		
		return"voter updated";
	}
}