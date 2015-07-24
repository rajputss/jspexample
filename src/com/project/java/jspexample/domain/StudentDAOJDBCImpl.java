package com.project.java.jspexample.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOJDBCImpl extends BaseDAO implements StudentDAO {

	@Override
	public List<Student> getAllStudents() throws DAOException {
		
		List<Student> students = new ArrayList<Student>();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from students");
			
			while (resultSet.next()) {
				String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String city = resultSet.getString("city");
				int id = resultSet.getInt("id");
				int age = resultSet.getInt("age");
				String phoneNumber = resultSet.getString("phone_number");
				String email = resultSet.getString("email");
				

				Student student = new Student();
				student.setAge(age);
				student.setCity(city);
				student.setEmail(email);
				student.setFirstName(firstName);
				student.setId(id);
				student.setLastName(lastName);
				student.setPhoneNumber(phoneNumber);

				students.add(student);
			}
		} catch (SQLException ex) {
			throw new DAOException(ex, "Error while selecting a record from database.");
		} finally {
			closeResources(connection, statement, resultSet);
		}
		return students;
}


	@Override
	public void create(Student student) {
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null; 

		try {
			connection = getConnection();

			statement = connection
					.prepareStatement("insert into students values(?, ?, ?, ?, ?, ?, ?)");

			statement.setString(1, student.getFirstName());
			statement.setString(2, student.getLastName());
			statement.setString(3, student.getPhoneNumber());
			statement.setString(4, student.getEmail());
			statement.setInt(5, student.getAge());
			statement.setString(6, student.getCity());
			statement.setInt(7, student.getId());

			statement.execute();
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DAOException(ex);
		} finally {
			closeResources(connection, statement, resultSet);
		}

	}

}

