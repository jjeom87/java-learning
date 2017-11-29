package net.sunj.learning.books.jabook.ch19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://dev-app.ebiz4u.co.kr:1433/ebiz4u", "ebiz4u", "ghkfWkr");
		Statement stmt = conn.createStatement();
		String sql = "Create table MyTest(name varchar(20), age int) ";
		stmt.executeUpdate(sql);
		System.out.println(" MyTest 테이블 생성 OK!");
		PreparedStatement pstmt = conn.prepareStatement("Insert into MyTest values (?,?)");
		pstmt.setString(1, "Jabook");
		pstmt.setInt(2, 2);
		pstmt.execute();
		System.out.println(" MyTest 테이블에 데이터 삽입 OK!");
		stmt = conn.createStatement();
		sql = "Select * from MyTest ";
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println(" MyTest 테이블에서 ResultSet 가져오기 OK!");
		while (rs.next()) {
			System.out.println("name : " + "\t" + rs.getString(1));
			System.out.println("age : " + "\t" + rs.getInt(2));
		}

		rs.close();
		pstmt.close();
		stmt.close();
		conn.close();
	}
}