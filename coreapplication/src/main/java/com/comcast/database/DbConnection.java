package com.comcast.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	private static final String URL = "jdbc:mysql://localhost:3306/ibank";
	private static final String USERNAME = "comcast";
	private static final String PASSWORD = "comcast";
	private static Connection con;

	public static Connection getDbConnection() throws SQLException {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		return con;

	}

}
