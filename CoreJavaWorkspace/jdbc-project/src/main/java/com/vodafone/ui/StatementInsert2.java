package com.vodafone.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementInsert2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vodafonedb", "root", "root");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter empno: ");
			int employeeNumber = scan.nextInt();
			System.out.println("Enter ename: ");
			String employeeName = scan.next();
			System.out.println("Enter salary: ");
			double salary = scan.nextDouble();
			
			String sql = "INSERT INTO employees(empno, ename, salary) VALUES (" + employeeNumber + ",'" + employeeName + "'," + salary + ")";
			Statement st = con.createStatement();
			int rowsInserted = st.executeUpdate(sql);
			if (rowsInserted == 1)
				System.out.println("employee added");
			else
				System.out.println("insertion error");
			
		} catch (ClassNotFoundException e) {
			System.out.println("driver class not found");
		} catch (SQLException e) {
			System.out.println("could not connect");
		}

	}

}
