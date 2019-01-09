package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.AccountBean;
import domain.MemberBean;
import factory.DatabaseFactory;
import pool.Constant;

public class MemberDaoImpl implements MemberDao {
	private static MemberDaoImpl instance = new MemberDaoImpl();
	private MemberDaoImpl() {}
	public static MemberDaoImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	
	@Override
	public void insertMember(MemberBean member) {
		try {
			String sql = String.format("INSERT INTO member(id, name, pass, ssn)\n"
					+ "VALUES('%s', '%s', '%s', '%s')",
					member.getId(), member.getName(), member.getPass(), member.getSsn());
			System.out.println("SQL :::"+sql);

			if(DatabaseFactory.createDatabase("oracle")
					.getConnection().createStatement()
					.executeUpdate(sql)==1) {
				
				System.out.println("회원가입 성공!!!");
			}else {
				System.out.println("회원가입 실패ㅠㅠ");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			
		
	}

	@Override
	public ArrayList<MemberBean> selectAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oralce", "password");
			stmt = conn.createStatement();
			String sql = "";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public ArrayList<MemberBean> selectMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle", "password");
			stmt = conn.createStatement();
			String sql = "";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {}
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean member = new MemberBean();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"oracle", "password");
			stmt = conn.createStatement();
			
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
			while(rs.next()) { //검색된 결과가 존재하면 true 리턴
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return member;
	}

	@Override
	public int countMembers() {
		int count = 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle", "password");
			stmt = conn.createStatement();
			String sql = "";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {}
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return count;
	}

	@Override
	public void updatePass(MemberBean member) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle", "password");
			stmt = conn.createStatement();
			String sql = "";
			if(stmt.executeUpdate(sql)==1) {
				System.out.println("업데이트 성공!!");
			}else {
				System.out.println("업데이트 실패 ㅠㅠ");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteContent(String id) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle", "password");
			stmt = conn.createStatement();
			String sql = "";
			if(stmt.executeUpdate(sql)==1) {
				System.out.println("삭제 성공!!!");
			}else {
				System.out.println("삭제 실패ㅠㅠ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
