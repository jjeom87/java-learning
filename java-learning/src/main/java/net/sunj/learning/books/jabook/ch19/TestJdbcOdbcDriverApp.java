package net.sunj.learning.books.jabook.ch19;

public class TestJdbcOdbcDriverApp {
	public static void main(String[] args) {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
