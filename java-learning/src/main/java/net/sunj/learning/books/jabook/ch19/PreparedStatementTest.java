package net.sunj.learning.books.jabook.ch19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementTest {
	public static void main(String[] args) {

		try {

			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://dev-app.ebiz4u.co.kr:1433/ebiz4u", "ebiz4u", "ghkfWkr");
			String sql = "insert MyTest values (?, ?)";

			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, "홍길동");
			pstmt.setInt(2, 20);

			pstmt.executeUpdate();

			pstmt.setString(1, "성춘향");
			pstmt.setInt(2, 16);

			pstmt.executeUpdate();

			pstmt.setString(1, "이몽룡");
			pstmt.setInt(2, 17);

			pstmt.executeUpdate();

			pstmt.setString(1, "심  청");
			pstmt.setInt(2, 15);

			pstmt.executeUpdate();

			pstmt.setString(1, "심학규");
			pstmt.setInt(2, 55);

			pstmt.executeUpdate();

			pstmt.close();

			conn.close();

			System.out.println("데이터 업데이트 완료!!");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}