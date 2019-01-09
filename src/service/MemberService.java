package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
//	public String id, name, pass, ssn;
	/**
	 * CREATE
	 * */
	public void createMember(MemberBean member);
		
	
	/**
	 * READ
	 * */
	public ArrayList<MemberBean> findAllMembers();
	public ArrayList<MemberBean> findMembersByName(String name);
	public MemberBean findMemberById(String id);
	public int countMembers();
	public boolean existMember(String id, String pass);
	/**
	 * UPDATE
	 * */
	public void changePass(MemberBean member);
	/**
	 * DELETE
	 * */
	public void removeContent(String id);
}
