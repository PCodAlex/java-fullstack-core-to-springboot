package com.jdbc.cot.JDBCConnection;

import java.sql.*;//import packages
import java.util.Scanner;

public class DemoJdbc {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		String query="INSERT INTO students (first_name, last_name, email, phone, gender, date_of_birth, course, marks, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
		
		Scanner sc=new Scanner(System.in);
		
		Class.forName("org.postgresql.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/student_db","postgres","Fkp37Si@n");
		System.out.println("Connection Eastablished");
		
		PreparedStatement ps=con.prepareStatement(query);
		
		System.out.print("Enter first name: ");
		ps.setString(1, sc.nextLine());

		System.out.print("Enter last name: ");
		ps.setString(2, sc.nextLine());

		System.out.print("Enter email: ");
		ps.setString(3, sc.nextLine());

		System.out.print("Enter phone: ");
		ps.setString(4, sc.nextLine());

		System.out.print("Enter gender: ");
		ps.setString(5, sc.nextLine());

		System.out.print("Enter DOB (yyyy-mm-dd): ");
		ps.setDate(6, java.sql.Date.valueOf(sc.nextLine()));

		System.out.print("Enter course: ");
		ps.setString(7, sc.nextLine());

		System.out.print("Enter marks: ");
		ps.setInt(8, sc.nextInt());
		sc.nextLine(); // clear buffer

		System.out.print("Enter address: ");
		ps.setString(9, sc.nextLine());
		
		boolean status=ps.execute();
		
		System.out.println("******************************");
		if(!status) System.out.println("successfully data inserted...");
		else System.out.println("Insertion operation failed...");
		con.close();
		System.out.println("******************************");
		System.out.println("connection closed");
	}
}
