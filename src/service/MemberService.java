package service;

import java.util.ArrayList;

public interface MemberService {
//	public String id, name, pass, ssn;
	/**
	 * CREATE
	 * */
	public void createMembers(String id, String name, String pass, String ssn);
	
	/**
	 * READ
	 * */
	public ArrayList[] list();
	public ArrayList[] findById(String id);
	public ArrayList[] findByName(String name);
	public boolean existLogin(String id, String pass);
	public String membersCount();
	/**
	 * UPDATE
	 * */
	public void updatePass(String id, String pass, String newpass);
	/**
	 * DELETE
	 * */
	public void deleteContent(String id, String pass);
}
