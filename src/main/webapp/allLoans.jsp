<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>All Loans</title>
</head>
<body>
<div align="center">
<h2>All Loans</h2>
<table>
<tr>
<td>Loan ID</td>
<td>Member Account Number</td>
<td>Loan Amount</td>
<td>Loan Date</td>
<td>Loan Duration</td>
</tr>
<c:forEach var="loan" items="${allLoans}">
<tr>
<td>${loan.loanID}</td>
<td>${loan.member.accountNo}</td>
<td>${loan.loanAmount}</td>
<td>${loan.loanDate}</td>
<td>${loan.loanDuration}</td>
</tr>
</c:forEach>
</table>
<p><a href="loan.jsp">Menu</a></p>
</div>
</body>
</html>