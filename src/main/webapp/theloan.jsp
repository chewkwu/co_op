<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>A Loan</title>
</head>
<body>
<div align="center">
<h2>Loan Details</h2>
<table>
<tr>
<td>Loan ID</td>
<td>${loan.loanID}</td>
</tr>
<tr>
<td>Account Number</td>
<td>${loan.member.accountNo}</td>
</tr>
<tr>
<td>Loan Amount</td>
<td>${loan.loanAmount}</td>
</tr>
<tr>
<td>Loan Date</td>
<td>${loan.loanDate}</td>
</tr>
<tr>
<td>Loan Duration</td>
<td>${loan.loanDuration}</td>
</tr>
</table>
<p><a href="loan.jsp">Menu</a></p>
</div>
</body>
</html>