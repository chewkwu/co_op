<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>All Users</title>
</head>
<body>
<div align="center">
<h2>All Users</h2>
<table>
<tr>
<td>User ID</td>
<td>Username</td>
<td>Password</td>
<td>User Role</td>
</tr>
<c:forEach var="user" items="${users}">
<tr>
<td>${user.userID}</td>
<td>${user.username}</td>
<td>${user.password}</td>
<td>${user.role}</td>
</tr>
</c:forEach>
</table>
<p><a href="usermenu.jsp">Menu</a></p>
</div>
</body>
</html>