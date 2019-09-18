<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login.jsp">
<table>
<tr><td>Account No</td>
<td><input type="text" name="userid" /></td></tr>
<tr><td>First Name</td>
<td><input type="text" name="fname" /></td></tr>
<tr><td>Middle Name</td>
<td><input type="text" name="midname" /></td></tr>
<tr><td>Last Name</td>
<td><input type="text" name="lname" /></td></tr>
<tr><td>Gender</td>
<td><input type="radio" name="gen" value="male"/>Male</td>
<td><input type="radio" name="gen" value="female"/>Female</td></tr>
<tr><td>Email Id</td>
<td><input type="email" name="emailid" /></td></tr>
<tr><td>Mobile No</td>
<td><input type="number" name="mobile" /></td></tr>
<tr><td>Password</td>
<td><input type="password" name="pass" /></td></tr>
<tr><td>Address</td>
<td><input type="text" name="add" /></td></tr>
<tr>
<td><input type="submit" value="sign up" /></td></tr>
</table>
</form>
</body>
</html>