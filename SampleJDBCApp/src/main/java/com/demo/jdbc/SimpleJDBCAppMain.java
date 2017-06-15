package com.demo.jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class SimpleJDBCAppMain {

	private static Properties properties = null;
	private static String DRIVAR_CLASS_NAME = "drivaerClassName";
	private static String URL = "url";
	private static String USER_NAME = "userName";
	private static String PASSWORD = "password";
	private static String PROP_FILE_NAME = "db.properties";

	public static void main(String[] args) {
		Connection connection = null ;
		Statement statement = null ;
		ResultSet resultSet = null ;
		try {
			Class.forName(getProperty(DRIVAR_CLASS_NAME));
			connection = DriverManager.getConnection(getProperty(URL), getProperty(USER_NAME), getProperty(PASSWORD));
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from emp");
			// System.out.println("Implementation class name "+ connection.getClass().getName());
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
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static String getProperty(String key) {
		if (properties == null) {
			properties = new Properties();
		}
		InputStream inputStream = null;
		try {
			inputStream = SimpleJDBCAppMain.class.getClassLoader().getResourceAsStream(PROP_FILE_NAME);
			if (inputStream != null) {
				properties.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '"+ PROP_FILE_NAME + "' not found in the classpath");
			}
		} catch (Exception e) {
			System.err.println("Exception: " + e);
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return properties.getProperty(key);
	}
}
