package com.vodafone.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementInsert {

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
			
			String sql = "INSERT INTO employees(empno, ename, salary) VALUES (?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setInt(1, employeeNumber);
			pst.setString(2, employeeName);
			pst.setDouble(3, salary);
			
			int rowsInserted = pst.executeUpdate();
			
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
