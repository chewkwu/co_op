<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="frame.css" />
<title>A Deposit</title>
</head>
<body>
<div align="center">
<h2>Deposit Details</h2>
<table>
<tr>
<td>Deposit ID</td>
<td>${deposit.depositID}</td>
</tr>
<tr>
<td>Account Number</td>
<td>${deposit.member.accountNo}</td>
</tr>
<tr>
<td>Deposit Amount</td>
<td>${deposit.depositAmount}</td>
</tr>
<tr>
<td>Deposit Date</td>
<td>${deposit.depositDate}</td>
</tr>
</table>
<p><a href="deposit.jsp">Menu</a></p>
</div>
</body>
</html>