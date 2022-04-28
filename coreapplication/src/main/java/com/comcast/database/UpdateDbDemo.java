package com.comcast.database;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDbDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.deregisterDriver(driver);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibank","comcast", "comcast");
			
			String query = "update customer set name=? where id=?";
			System.out.println("Enter the id for update: ");
			int cid = Integer.parseInt(sc.nextLine());
			System.out.println("Enter updated name: ");
			String uname = sc.nextLine();
			
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, uname);
			pstmt.setInt(2, cid);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " Rows affected");
			pstmt.close();
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
