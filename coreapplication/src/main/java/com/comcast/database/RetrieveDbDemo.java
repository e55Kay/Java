package com.comcast.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

public class RetrieveDbDemo {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con = DbConnection.getDbConnection();
		String query = "select * from employee where id = ?";
		PreparedStatement pstmt = con.prepareStatement(query);
		
		System.out.println("Enter employee id:");
		pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
		ResultSet rs = pstmt.executeQuery();
		System.out.println("Employee Details:");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getNString("designation"));
			System.out.println(rs.getNString("email"));
			System.out.println(rs.getDate(5));
			System.out.println("-----------------");
		}
		
		rs.close();
		pstmt.close();
		con.close();
		sc.close();

	}

}
