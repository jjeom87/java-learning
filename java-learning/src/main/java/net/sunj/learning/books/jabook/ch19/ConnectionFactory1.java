package net.sunj.learning.books.jabook.ch19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory1 {
	public static final int ODBC = 1;
	public static final int ORACLE = 2;
	public static final int JTDS = 3;

	public ConnectionFactory1() {}

	public Connection getConnection(int dbms) throws SQLException {
		Connection conn = null;

		if (dbms == ConnectionFactory1.ODBC) {
			try {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				conn = DriverManager.getConnection("jdbc:odbc:dbdsn", "id", "password");
			} catch (ClassNotFoundException cnfe) {
				System.out.println(cnfe);
			}
		} else if (dbms == ConnectionFactory1.ORACLE) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@ip_address:port:ORACLE", "id", "password");
			} catch (ClassNotFoundException cnfe) {
				System.out.println(cnfe);
			}
		} else if (dbms == ConnectionFactory1.JTDS) {
			try {
				Class.forName("net.sourceforge.jtds.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:jtds:sqlserver://dev-app.ebiz4u.co.kr:1433/ebiz4u", "ebiz4u", "ghkfWkr");
			} catch (ClassNotFoundException cnfe) {
				System.out.println(cnfe);
			}
		}
		return conn;
	}
}