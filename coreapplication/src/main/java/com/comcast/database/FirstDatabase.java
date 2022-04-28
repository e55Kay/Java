package com.comcast.database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstDatabase {

	public static void main(String[] args) {
		try {
			Driver myDriver = new com.mysql.cj.jdbc.Driver();
			
			DriverManager.registerDriver(myDriver);
			
			String URL = "jdbc:mysql://localhost:3306/ibank";
			String username = "comcast";
			String password = "comcast";
			
			Connection con =  DriverManager.getConnection(URL, username, password);
			
			if(con != null) {
				System.out.println("Successfully connected");
			}
			
			String query = "create table customer(id int primary key, name varchar(40))";
			Statement st = con.createStatement();
			st.execute(query);
			
			System.out.println("Table is created");
			st.close();
			con.close();
		} catch(SQLException e) {
			
		}

	}

}
