<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>Create User</title>
</head>
<body>
<div align="center">
<h2>Create User</h2>
<form method="post" action="createUser">
<table>
<tr>
<td>Username</td>
<td><input type="text" name="username"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password"/></td>
</tr>
<tr>
<td>Role</td>
<td><select name="role">
<option value="user">User</option>
<option value="admin">Admin</option>
</select></td>
</tr>
<tr>
<td><a href="usermenu.jsp">Back</a></td>
<td><input type="submit" value="Create User"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>