<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>View All Loans</title>
</head>
<body>
<div align="center">
<h2>View Member Loan</h2>
<form method="post" action="viewLoansByMember">
<table>
<tr>
<td>Account No</td>
<td><input type="text" name="accountNo"/></td>
</tr>
<tr>
<td><a href="membermenu.jsp">Back</a></td>
<td><input type="submit" value="View Member Loan"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>