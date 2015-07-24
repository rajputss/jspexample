package com.project.java.jspexample.domain;

import java.util.List;

public interface StudentDAO {
	
	List<Student> getAllStudents() throws DAOException;
	void create (Student student);

}
