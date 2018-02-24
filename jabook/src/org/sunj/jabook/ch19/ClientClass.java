package org.sunj.jabook.ch19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientClass {
	public static void main(String[] args) throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		if (conn != null) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM MyTest");
			rs.close();
			stmt.close();
			conn.close();
		}
	}
}