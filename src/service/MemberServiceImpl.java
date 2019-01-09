package service;

import java.util.ArrayList;

import dao.MemberDaoImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {
		dao = MemberDaoImpl.getInstance();
	}
	public static MemberServiceImpl getInstance() {return instance;}

	MemberDaoImpl dao;
	
	@Override
	public void createMember(MemberBean member) {
		System.out.println("맴버서비스 조인에 진입");
		System.out.println("===컨트롤러에서넘어온 회원정보===");
		System.out.println("ID :"+member.getId());
		System.out.println("NAME :"+member.getName());
		System.out.println("PASS :"+member.getPass());
		System.out.println("SSN :"+member.getSsn());
		
		dao.insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> findAllMembers() {
		ArrayList<MemberBean> list =  new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list =  new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findMemberById(String id) {
		MemberBean member = dao.selectMemberById(id);
		
		return member;
	}

	@Override
	public int countMembers() {
		
		return 0;
	}

	@Override
	public boolean existMember(String id, String pass) {
	
		return false;
	}

	@Override
	public void changePass(MemberBean member) {
	}

	@Override
	public void removeContent(String id) {
	}



}
