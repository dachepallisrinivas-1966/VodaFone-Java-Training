package com.vodafone.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatemenDelete {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		Scanner scan = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vodafonedb", "root", "root");
			
			scan = new Scanner(System.in);
			System.out.println("Enter empno: ");
			int employeeNumber = scan.nextInt();

			String sql = "DELETE FROM employees WHERE empno = " + employeeNumber;
			
			st = con.createStatement();
			int rowsDeleted = st.executeUpdate(sql);
			
			if (rowsDeleted == 1)
				System.out.println("employee deleted");
			else
				System.out.println("deletion error");
			
		} catch (ClassNotFoundException e) {
			System.out.println("driver class not found");
		} catch (SQLException e) {
			System.out.println("could not connect");
		} finally {
			try {
				scan.close();
				st.close();
				con.close();
			}catch(SQLException excep) {
				System.out.println("could not close resource");
			}
		}

	}

}
