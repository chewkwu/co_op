<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>Deposit Form</title>
</head>
<body>
<div align="center">
<h2>Deposit Form</h2>
<form method="post" action="makeDeposit">
<table>
<tr>
<td>Account Number</td>
<td><input type="text" name="accountNo"/></td>
</tr>
<tr>
<td>Deposit Amount</td>
<td><input type="text" name="amount"/></td>
</tr>
<tr>
<td><a href="deposit.jsp">Back</a></td>
<td><input type="submit" name="Make Deposit"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>