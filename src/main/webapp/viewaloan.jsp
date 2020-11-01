<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>View Loan Form</title>
</head>
<body>
<div align="center">
<h2>View a Loan</h2>
<form method="post" action="viewALoan">
<table>
<tr>
<td>Loan ID</td>
<td><input type="text" name="loanID"/></td>
</tr>
<tr>
<td><a href="membermenu.jsp">Back</a></td>
<td><input type="submit" value="View Loan"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>