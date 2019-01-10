package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.MemberDao;
import dao.MemberDaoImpl;
import domain.MemberBean;
import factory.DatabaseFactory;

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
		return dao.selectMemberById(id);
	}

	@Override
	public int countMembers() {
		
		return 0;
	}

	@Override
	public boolean existMember(String id, String pass) {
		MemberBean member = dao.selectMemberById(id);
		boolean exist = false;	
		System.out.println("exist id:::" +member.getId());
			System.out.println("exist name:::" +member.getName());
			System.out.println("exist pass:::" +member.getPass());
			System.out.println("exist ssn:::" +member.getSsn());
			
			if(!(id.equals(member.getId()) && pass.equals(member.getPass()))) {
				System.out.println("DB에 id ::"+member.getId()+" / 파라미터 id ::"+id);
				System.out.println("DB에 pass ::"+member.getPass()+" / 파라미터 pass ::"+pass);
				System.out.println("exist ::true == 비교 값이 '다름'");
				
				exist = true;
			} else {
				System.out.println("DB에 id ::"+member.getId()+" / 파라미터 id ::"+id);
				System.out.println("DB에 pass ::"+member.getPass()+" / 파라미터 pass ::"+pass);
				System.out.println("exist ::false == 비교 값이 '같음'!");
				exist = false;
			}
			
		return exist;
	}

	@Override
	public void changePass(MemberBean member) {
	}

	@Override
	public void removeContent(String id) {
	}



}
