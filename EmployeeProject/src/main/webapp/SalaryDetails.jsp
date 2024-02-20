<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h5>Name:</h5><%request.getAttribute("name");  %>
   <h5>Basic Salary:</h5><%request.getAttribute("salary");  %>
   <h5>HRA:</h5><%request.getAttribute("hra");  %>
   <h5>DA:</h5><%request.getAttribute("da");  %>
   <h5>GS:</h5><%request.getAttribute("gs");  %>
   <h5>pf:</h5><%request.getAttribute("PF");  %>
   <h5>NS:</h5><%request.getAttribute("ns");  %>
</body>
</html>



