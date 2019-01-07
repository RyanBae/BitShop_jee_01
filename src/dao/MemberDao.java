package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDao {

	public void createMember();
	
	public ArrayList<MemberBean> selectMembers();
	public ArrayList<MemberBean> selectByName();
	public MemberBean selectById();
	public int countMembers();
	public boolean existLogin(String id, String pass);

	public void updatePass(String id, String pass, String newpass);

	public void deleteContent(String id, String pass);
}
