package net.sunj.learning.books.jabook.ch19;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {
	private static ConnectionPool cp = null;
	private ConnectionFactory1 cf = null;
	private Vector<Connection> pool = null;

	private ConnectionPool() {
		cf = new ConnectionFactory1();
		pool = new Vector<Connection>();
	}

	public static synchronized ConnectionPool getInstance() {
		if (cp == null) {
			cp = new ConnectionPool();
		}
		return cp;
	}

	public synchronized Connection getConnection() throws SQLException {
		Connection conn = null;
		int size = pool.size();
		if (size > 0) {
			conn = (Connection) (pool.elementAt(0));
			pool.removeElementAt(0);
		} else {
			conn = cf.getConnection(ConnectionFactory1.JTDS);
		}
		return conn;
	}

	public synchronized void releaseConnection(Connection conn) {
		pool.add(conn);
	}
}