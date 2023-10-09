package com.vodafone.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatemenUpdate {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vodafonedb", "root", "root");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter empno: ");
			int employeeNumber = scan.nextInt();

			System.out.println("Enter new salary: ");
			double newSalary = scan.nextDouble();
			
			String sql = "UPDATE employees SET salary = " + newSalary + " WHERE empno = " + employeeNumber;
			Statement st = con.createStatement();
			int rowsUpdated = st.executeUpdate(sql);
			if (rowsUpdated == 1)
				System.out.println("employee salary updated");
			else
				System.out.println("updation error");
			
		} catch (ClassNotFoundException e) {
			System.out.println("driver class not found");
		} catch (SQLException e) {
			System.out.println("could not connect");
		}

	}

}
