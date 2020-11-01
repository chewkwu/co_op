<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>Create Loan</title>
</head>
<body>
<div align="center">
<h2>New Loan form</h2>
<form method="post" action="createLoan">
<table>
<tr>
<td>Account Number</td>
<td><input type="text" name="accountNo"/></td>
</tr>
<tr>
<td>Loan Amount</td>
<td><input type="text" name="amount"/></td>
</tr>
<tr>
<td>Loan Duration</td>
<td><input type="text" name="duration"/></td>
</tr>
<tr>
<td><a href="loan.jsp">Back</a></td>
<td><input type="submit" value="Create Loan"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>