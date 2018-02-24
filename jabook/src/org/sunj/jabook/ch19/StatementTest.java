package org.sunj.jabook.ch19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:jtds:sqlserver://dev-app.ebiz4u.co.kr:1433/ebiz4u", "ebiz4u", "ghkfWkr");
			stmt = conn.createStatement();
			System.out.println("Statement객체 stmt 생성");
			stmt.close();
			System.out.println("생성한 객체 stmt를 닫음");
			conn.close();
			System.out.println("데이터베이스와 연결을 끊음");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}