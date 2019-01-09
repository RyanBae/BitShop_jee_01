package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.AccountBean;

public class AccountDaoImpl implements AccountDao {

	private static AccountDaoImpl instance = new AccountDaoImpl();
	private AccountDaoImpl() {}
	public static AccountDaoImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;


	@Override
	public void insertAccountNum(AccountBean account) {
		try {
			Class.forName("jdbc:oracle:thin:@localhost:1521:xe");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle", "password");
			stmt = conn.createStatement();
			String sql = "";
			if(stmt.executeUpdate(sql)==1) {
				System.out.println("계좌생성 성공 !!!");
			}else {
				System.out.println("계좌생성 실패 ㅠㅠ");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String AccNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AccountBean> selectAccountByAll() {
		ArrayList<AccountBean> list = new ArrayList<>();
		try {
			Class.forName("jdbc:oracle:thin:@localhost:1521:xe");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"oracle", "password");
			stmt = conn.createStatement();
			String sql ="";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public AccountBean selectByAccountNum(String accountNum) {
		AccountBean accountBean = new AccountBean();
		try {
			Class.forName("jdbc:oracle:thin:@localhost:1521:xe");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql =  "";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return accountBean;
	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String selectDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void withdrawMoney(int money) {
		try {
			Class.forName("jdbc:oracle:thin:@localhost:1521:xe");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle", "password");
			stmt = conn.createStatement();
			String sql ="";
			int res = stmt.executeUpdate(sql);
			if(res==1) {
				System.out.println("성공!!");
			}else {
				System.out.println("실패!!");
			}	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void depositMoney(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}
	
}
