package com.comcast.database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class InsertDbDemo {

	public static void main(String[] args) {
		try {
			Connection con = DbConnection.getDbConnection();
			String query  = "insert into customer values (103, 'Marun')";
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
