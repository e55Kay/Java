package com.comcast.database;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDbDemo {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con = DbConnection.getDbConnection();
		String query = "delete from customer where id = ?";
		PreparedStatement pstmt = con.prepareStatement(query);
		
		System.out.println("Enter the customer id: ");
		int custId = Integer.parseInt(sc.nextLine());
		pstmt.setInt(1, custId);
		int rCount = pstmt.executeUpdate();
		System.out.println(rCount + " Rows affected");
		pstmt.close();
		con.close();
		sc.close();
	}

}
