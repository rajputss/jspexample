 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to my page</h1>
	
	<%
		Date todaysDate = new Date();
		System.out.println("Today's date  = " + todaysDate);
		
		String firstName = request.getParameter("fn");
		String lastName = request.getParameter("ln");
		
		out.println("Hi " + lastName + " , " + firstName);
	%>
	
	<%
		out.print("Today's date  = " + todaysDate);
	%>
</body>
</html>