package com.nvsp.service;

import com.nvsp.dao.VoterListDao;
import com.nvsp.pojo.VoterList;

public class VoterService {
	private VoterListDao voterListDao=new VoterListDao();
	public String addVoter(VoterList voterList) throws Exception {
		return voterListDao.addVoter(voterList);
	} 
	public VoterList login(String emailId ,String dateOfBirth) throws Exception {
	return voterListDao.login(dateOfBirth, emailId);
	}
	public VoterList fetchById (int voterId) throws Exception {
	return voterListDao.fetchById(voterId);
	}
	public String deleteById(int voterId) throws Exception {
		return voterListDao.deleteById(voterId);
		}
	public String updateById(VoterList voterList) throws Exception{
		return voterListDao.updateById(voterList);
	}
}
