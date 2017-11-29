package net.sunj.learning.books.jabook.ch19;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool1 {
	private static ConnectionPool1 cp = null;
	private ConnectionFactory1 cf = null;
	private Vector<Connection> pool = null;
	private int initCon = 0;
	private int maxCon = 0;
	private int users = 0;

	private ConnectionPool1(int initCon, int maxCon) throws SQLException {
		this.initCon = initCon;
		this.maxCon = maxCon;

		cf = new ConnectionFactory1();
		pool = new Vector<Connection>();

		for (int i = 0; i < this.initCon; i++) {
			pool.add(createConnection());
		}
	}

	public static synchronized ConnectionPool1 getInstance() throws SQLException {
		if (cp == null) {
			cp = new ConnectionPool1(4, 20);
		}
		return cp;
	}

	public synchronized Connection getConnection() throws SQLException {
		Connection conn = null;
		while ((conn = getPooledConnection()) == null) {
			try {
				wait();
			} catch (InterruptedException ie) {}
		}
		users++;
		return conn;
	}

	public synchronized void releaseConnection(Connection conn) {
		pool.add(conn);
		users--;
		notifyAll();
	}

	private Connection getPooledConnection() throws SQLException {
		Connection conn = null;
		int size = pool.size();
		if (size > 0) {
			conn = (Connection) (pool.elementAt(0));
			pool.removeElementAt(0);
		} else if (users < maxCon || maxCon == 0) {
			pool.add(createConnection());
		}
		return conn;
	}

	private Connection createConnection()
			throws SQLException {
		Connection conn = cf.getConnection(ConnectionFactory1.ODBC);
		System.out.println("== a connection was created");
		return conn;
	}
}