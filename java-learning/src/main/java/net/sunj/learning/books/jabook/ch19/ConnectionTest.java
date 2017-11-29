package net.sunj.learning.books.jabook.ch19;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	public static void main(String[] args) {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://dev-app.ebiz4u.co.kr:1433/ebiz4u", "ebiz4u", "ghkfWkr");
			System.out.println("Connection클래스의 객체 con 생성");
			conn.close();
			System.out.println("데이터베이스와 연결을 끊음");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}