package com.jenkov.tutorials.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseExample {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/test"; // database specific url.
		String user = "root";
		String password = "man83kumar";

		Connection connection = DriverManager.getConnection(url, user, password);
		Statement st = connection.createStatement();
		String sql = "select* from employee";
		ResultSet rs = st.executeQuery(sql);
		// int indexno=rs.findColumn("DOB");
		// System.out.println("date index no is"+indexno);
		while (rs.next()) {
			String empid = rs.getString(1);
			String name = rs.getString(2);
			String sex = rs.getString(3);
			String date = rs.getString(4);
			System.out.println(empid + " " + name + " " + sex + " " + date);
		}

		rs.close();
		st.close();

	}

}