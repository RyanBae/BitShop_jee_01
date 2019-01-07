package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
//	public String id, name, pass, ssn;
	/**
	 * CREATE
	 * */
	public void joinMember();
	
	/**
	 * READ
	 * */
	public ArrayList<MemberBean> findBuList();
	public ArrayList<MemberBean> findByName(String id);
	public MemberBean findById(String name);
	public int countMembers();
	public boolean existLogin(String id, String pass);
	/**
	 * UPDATE
	 * */
	public void updatePass(String id, String pass, String newpass);
	/**
	 * DELETE
	 * */
	public void deleteContent(String id, String pass);
}
