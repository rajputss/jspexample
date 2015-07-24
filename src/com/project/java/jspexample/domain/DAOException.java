package com.project.java.jspexample.domain;

import java.sql.SQLException;

public class DAOException extends RuntimeException{

	public DAOException(Exception ex, String errorMessage) {
		super(errorMessage, ex);
	}
	
	public DAOException(String errorMessage, Exception ex) {
		super(errorMessage, ex);
	}
	
	public DAOException(String errorMessage) {
		super(errorMessage);
	}
	
	public DAOException(SQLException ex) {
		super(ex);
	}

}
