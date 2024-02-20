<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="http://localhost:8083/EmployeeProject/RegisterServlet" method="post">
   <table>
     <tr>
     <th><label>Employe Name</label></th>
     <th><input type="text" name="ename" required></th>
     </tr>
     <tr>
     <th><label>Date Of Joining</label></th>
     <th><input type="date" name="doj" required></th>
     </tr>
     <tr>
     <th><label>Basic Salary</label></th>
     <th><input type="text" name="basicsal" required></th>
     </tr>
     <tr>
     <th><input type="submit" value="submit"></th>
     </tr>
   </table>
  </form>
</body>
</html>