<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="http://localhost:8080/ArithmeticProject/ArithmeticServlet" method="post">
    <table>
    <tr>
    <th>First Number:<input type="text" name="n1" required></tr>
    <tr>
    <th>Second Number:<input type="text" name="n2" required></th>
    </tr>
    <tr>
    <th>Operator:<input type="text" name="oper" required></th>
    </tr>
    <tr>
    <th><input type="submit" value="Calculate"></th>
    </tr>
    </table>  
  </form>    
</body>
</html>