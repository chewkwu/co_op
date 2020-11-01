<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>Update Member</title>
</head>
<body>
<div align="center">
<form method="post" action="updateMember">
<table>
<tr>
<td>Member Phone</td>
<td><input type="text" name="phone"/></td>
</tr>
<tr>
<td>Status</td>
<td>
<select name="status">
<option value="active">Active</option>
<option value="inactive">Inactive</option>
</select>
</td>
</tr>
<tr>
<td><a href="member.jsp">Back</a></td>
<td><input type="submit" value="Update Member"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>