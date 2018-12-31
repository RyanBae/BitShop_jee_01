package service;

import java.util.ArrayList;

public interface AccountService {
	//private String id, name, pass, ssn;
	/**
	 * CREATE
	 * */
	public void createMembers(String id, String name, String pass, String ssn);
	
	/**
	 * READ
	 * */
	public ArrayList[] list();
	public ArrayList[] findByName(String name);
	public ArrayList findById(String id);
	public boolean existLogin(String id, String pass);
	public String memberCount();
	/**
	 * UPDATE
	 * */
	public void updatePass(String id, String pass, String newpass);
	/**
	 * DELETE
	 * */
	public void deleteMember(String id, String pass);
	
}
