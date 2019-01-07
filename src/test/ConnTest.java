package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {	//DB에서 일어난 일들 코딩  {}
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle", "password");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM member");
			String name = null;
			while(rs.next()) {
				name = rs.getString("name");
			}
			System.out.println("회원 이름은 :::"+name);
			//DB에서 일어난 일들 코딩 
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
