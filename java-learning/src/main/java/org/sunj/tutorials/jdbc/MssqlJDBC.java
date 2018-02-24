package org.sunj.tutorials.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MssqlJDBC {

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
			connection = DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433/TobySpring3", "tobyspring3", "a123456A");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}

	}

}
