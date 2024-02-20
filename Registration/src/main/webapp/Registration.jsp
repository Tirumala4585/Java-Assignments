<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="http://localhost:8083/Registration/Registration" method="post">
  <table>
     <tr>
       <th><label>User Name</label>
       <th><input type="text" name="uname" required></th>
      </tr>
      <tr>
        <th><label>First Name</label></th>
        <th><input type="text" name="fname" required></th>
      </tr>
      <tr>
        <th><label>Last Name</label></th>
        <th><input type="text" name="lname" required></th>
     </tr>
      <tr>
        <th><label>Phno</label></th>
        <th><input type="text" name="phno" required></th>
     </tr>
     <tr>
        <th><label>Email</label></th>
        <th><input type="email" name="email" required></th>
     </tr>
     <tr>
       <th><input type="submit" value="Submit" required></th>
     </tr> 
     </table>
     </form>     
</body>
</html>