package com.comcast.database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertDbDemo {

	public static void main(String[] args) {
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.deregisterDriver(driver);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibank","comcast", "comcast");
			String query  = "insert into customer values (101, 'Rahul')";
			Statement st = con.createStatement();
			int rowCount = st.executeUpdate(query);
			System.out.println(rowCount + " Rows affected.");
			st.close();
			con.close();
		} catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
