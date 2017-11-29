package net.sunj.learning.books.jabook.ch19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public ConnectionFactory() {}

	public Connection getConnection()
			throws SQLException {
		Connection conn = null;
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:jtds:sqlserver://dev-app.ebiz4u.co.kr:1433/ebiz4u", "ebiz4u", "ghkfWkr");
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		}
		return conn;
	}
}