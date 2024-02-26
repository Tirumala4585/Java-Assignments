<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="http://localhost:8080/AddAccount/AddAccount" method="post"> 
     <table>
       <tr>
         <th>User Name:<input type="text" name="user_name" required></th>
       </tr>
       <tr>
         <th>Account No:<input type="text" name="account_type" required></th>
       </tr>
       <tr>
         <th>IFSC code:<input type="text" name="ifsc_code" required></th>
      </tr>
      <tr>
         <th>Bank Name:<input type="text" name="bank_name" required></th>
      </tr>
      <tr>
        <th>Account Type:<input type="text" name="account_type" required></th>
     </tr>
     <tr>
       <th>Starting Balance:<input type="text" name="starting_bal"></th>
    </tr> 
    <tr>
         <th><input type="submit" value="submit"></th>
       </tr>
    </table>
    </form>          
</body>
</html>