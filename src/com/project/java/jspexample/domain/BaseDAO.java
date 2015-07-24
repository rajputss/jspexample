package com.project.java.jspexample.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDAO {
	
	private static final String jdbcURL = "jdbc:mysql://127.0.0.1:3306/demo";
	private static final String username = "root";
	private static final String password = "root";
	
	// get connection
	
	protected Connection getConnection() throws DAOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(jdbcURL, username, password);
		} catch (ClassNotFoundException ex) {
			throw new DAOException(ex, "Class Not Found");
		} catch (SQLException ex) {
			throw new DAOException(ex);
		}
	}
	// Close all resources
	protected void closeResources (Connection connection, Statement statement, ResultSet resultSet) {
		
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
