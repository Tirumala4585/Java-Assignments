<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  Employee Name:<% request.getAttribute("name");%>
  Employee Id:<% request.getAttribute("emp_id");%>
  Basic Salary:<% request.getAttribute("basicSalary");%>
  HRA:        <% request.getAttribute("hra");%>
  DA:         <% request.getAttribute("da");%>
  GS:         <% request.getAttribute("gs");%>
  PF:		  <% request.getAttribute("pf");%>
  NS:		  <% request.getAttribute("ns");%>
</body>
</html>