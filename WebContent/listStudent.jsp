<%@page import="com.project.java.jspexample.domain.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.project.java.jspexample.domain.StudentDAOJDBCImpl"%>
<%@page import="com.project.java.jspexample.domain.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border="1" bordercolor="blue">
		<tr>
			<th>id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>City</th>
			<th>Age</th>
			<th>Phone Number</th>
			<th>Email</th>
		</tr>
<%
	StudentDAO dao = new StudentDAOJDBCImpl();
	List<Student> students = dao.getAllStudents();


	for(Student current : students)
	{
		out.print("<TR>");
		out.print("<TD>" + current.getId() + "</TD>");
		out.print("<TD>" + current.getFirstName() + "</TD>");
		out.print("<TD>" + current.getLastName() + "</TD>");
		out.print("<TD>" + current.getCity() + "</TD>");
		out.print("<TD>" + current.getAge() + "</TD>");
		out.print("<TD>" + current.getPhoneNumber() + "</TD>");
		out.print("<TD>" + current.getEmail() + "</TD>");
		out.print("</TR>");
	}
	
%>
</table>

</body>
</html>