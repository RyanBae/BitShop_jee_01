package service;

import java.util.ArrayList;

import dao.MemberDaoImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {}
	public static MemberServiceImpl getInstance() {return instance;}

	
	
	@Override
	public void joinMember(MemberBean member) {
		System.out.println("맴버서비스 조인에 진입");
		System.out.println("===컨트롤러에서넘어온 회원정보===");
		System.out.println("ID :"+member.getId());
		System.out.println("NAME :"+member.getName());
		System.out.println("PASS :"+member.getPass());
		System.out.println("SSN :"+member.getSsn());
		
		MemberDaoImpl.getInstance().insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> findByList() {
		ArrayList<MemberBean> list =  new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findByName(String name) {
		ArrayList<MemberBean> list =  new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		
		return member;
	}

	@Override
	public int countMembers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existLogin(String id, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePass(String id, String pass, String newpass) {
	}

	@Override
	public void deleteContent(String id, String pass) {
	}



}
