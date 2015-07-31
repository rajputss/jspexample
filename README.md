# JSP Example

#### ABOUT
This is a very basic Java application using Java Servlet Pages. It uses servlet to forward any requests from client requesting list of students to a listStudent.jsp page. I have used MySQL Workbench for data. Below is a db script I have used to create  a very basic student table for this project.

#### DBScript
create table students (
  id int unsigned auto_increment not null,
  first_name varchar(32) not null,
  last_name varchar(32) not null,
  city varchar(32) not null,
  age int not null,
  phone_number varchar(32),
  email varchar(32),
  primary key (id)
);

