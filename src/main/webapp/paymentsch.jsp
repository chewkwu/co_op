<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>schedule_form</title>
</head>
<body>
<div align="center">
<h2>Payment Schedule Form</h2>
<form method="post" action="paymentSchedule">
<table>
<tr>
<td>Loan ID</td>
<td><input type="text" name="loanID"/></td>
</tr>
<tr>
<td><a href="loan.jsp">Back</a></td>
<td><input type="submit" value="View Schedule"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>