<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>Registered Successfully</h1>
  <form action="http://localhost:8083/EmployeeProject/Login.jsp" method="post">
    <h3>Employee Id:</h3> <%=request.getAttribute("empid")%>
    <input type="submit" value="Login">
  </form>   
</body>
</html>