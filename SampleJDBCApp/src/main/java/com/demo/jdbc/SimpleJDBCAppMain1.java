package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJDBCAppMain1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "apple");
		System.out.println("Implementation class name " + connection.getClass().getName());
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from emp");
		
		while (resultSet.next()) {
			System.out.print("Emp No: " + resultSet.getObject(1));
			System.out.print(", Emp Name: " + resultSet.getObject(2));
			System.out.print(", Emp job: " + resultSet.getObject(3));
			System.out.print(", Emp Mgr: " + resultSet.getObject(4));
			System.out.print(", Emp DOJ: " + resultSet.getObject(5));
			System.out.print(", Emp Sal: " + resultSet.getObject(6));
			System.out.print(", Emp Comm: " + resultSet.getObject(7));
			System.out.println(", Emp Dept No: " + resultSet.getObject(8));
			System.out.println();
		}
		
	}
}
