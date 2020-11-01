<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>Make Payment</title>
</head>
<body>
<div align="center">
<form method="post" action="makePayment">
<table>
<tr>
<td>Loan Schedule ID</td>
<td><input type="text" name="scheduleID"/></td>
</tr>
<tr>
<td>Payment Amount</td>
<td><input type="text" name="amount"/></td>
</tr>
<tr>
<td><a href="loan.jsp">Back</a></td>
<td><input type="submit" value="Make Payment"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>