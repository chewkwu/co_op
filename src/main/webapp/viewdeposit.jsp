<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>View Deposit</title>
</head>
<body>
<div align="center">
<h2>View Deposit Form</h2>
<form method="post" action="viewDeposit">
<table>
<tr>
<td>Deposit ID</td>
<td><input type="text" name="depositID"/></td>
</tr>
<tr>
<td><a href="deposit.jsp">Back</a></td>
<td><input type="submit" value="View Deposit"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>