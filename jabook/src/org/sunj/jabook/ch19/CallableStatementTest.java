package org.sunj.jabook.ch19;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementTest {
	public static void main(String[] args) {

		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://dev-app.ebiz4u.co.kr:1433/ebiz4u", "ebiz4u", "ghkfWkr");

			CallableStatement cs = conn.prepareCall("{call myStoredProcedure(?,?,?)}");

			cs.setInt(1, 2);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.registerOutParameter(3, java.sql.Types.INTEGER);
			cs.execute();

			System.out.println("*name : " + cs.getString(2) + "*age : " + cs.getInt(3));
			cs.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}