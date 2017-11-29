package net.sunj.learning.utils.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlJDBC {

	public static void main(String[] args) {
		System.out.println("-------- jtds JDBC Connection Testing ------");

		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your jtds JDBC Driver?");
			e.printStackTrace();
			return;
		}

		System.out.println("jtds JDBC Driver Registered!");

		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/egov3", "root", "root");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");

			try {
				java.sql.Statement st = null;
				ResultSet rs = null;
				st = connection.createStatement();
				rs = st.executeQuery("SHOW TABLES");

				if (st.execute("SHOW TABLES")) {
					rs = st.getResultSet();
				}

				while (rs.next()) {
					String str = rs.getNString(1);
					System.out.println(str);
				}
			} catch (SQLException sqex) {
				System.out.println("SQLException: " + sqex.getMessage());
				System.out.println("SQLState: " + sqex.getSQLState());
			}
		} else {
			System.out.println("Failed to make connection!");
		}

	}

}
