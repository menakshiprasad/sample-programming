package com.jenkov.tutorials.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseExample2 {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		final String url = "jdbc:mysql://localhost:3306/test"; // database specific url.
		final String user = "root";
		final String password = "man83kumar";
		final Connection connection = DriverManager.getConnection(url, user, password);

		final Statement st = connection.createStatement();

		final String sql = "update employee set name='Menakshi' where empid='1234'";
		int rowsaffected = st.executeUpdate(sql);
		System.out.println("after updatation rows affected" + rowsaffected);
		final String sql1 = "select * from employee";
		final ResultSet rs = st.executeQuery(sql1);
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
