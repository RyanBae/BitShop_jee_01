package service;

import java.util.ArrayList;

public interface AdminService {
	//private String adminNum, name, pass, auth;
	/**
	 * CREATE
	 * */
	public void createAdmins(String adminNum, String name, String pass, String auth);
	
	/**
	 * READ
	 * */
	public ArrayList[] list();
	public ArrayList[] findByName(String name);
	public ArrayList[] findByAdminNum(String adminNum);
	public boolean existLogin(String adminNum, String pass);
	public String adminsCount();
	/**
	 * UPDATE
	 * */
	public void updatePass(String adminNum, String pass, String newpass);
	/**
	 * DELETE
	 * */
	public void deleteMember(String adminNum, String pass);
	
}
