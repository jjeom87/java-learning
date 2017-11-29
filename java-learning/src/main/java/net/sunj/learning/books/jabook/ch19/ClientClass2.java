package net.sunj.learning.books.jabook.ch19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientClass2 {
	public static void main(String[] args)
			throws SQLException {

		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();

		if (conn != null) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM MyTest");
			rs.close();
			stmt.close();
			pool.releaseConnection(conn);
		}
	}
}