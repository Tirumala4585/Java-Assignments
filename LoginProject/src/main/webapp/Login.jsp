<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="http://localhost:8083/Assignment1/LoginServlet" method="post">
   <table>
      <tr>
        <th><label>UserName</label>
        <th><input type="text" name="uname" placeholder="Enter your name"></th>
       </tr> 
       <tr>
         <th><label>Password</label>
        <th><input type="password" name="pname" placeholder="Enter your name"></th>
       </tr> 
       <tr>
         <th><input type="submit" value="Login"></th>
         <th><input type="reset" value="Reset"></th>
       </tr>
     </table>
     </form>  
</body>
</html>