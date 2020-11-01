<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>All Deposits</title>
</head>
<body>
<div align="center">
<table>
<tr>
<td>Deposit ID</td>
<td>Account No</td>
<td>Deposit Date</td>
<td>Deposit Amount</td>
</tr>
<c:forEach var="deposit" items="${allDeposits}">
<tr>
<td>${deposit.depositID}</td>
<td>${deposit.member.accountNo}</td>
<td>${deposit.depositDate}</td>
<td>${deposit.depositAmount}</td>
</tr>
 </c:forEach>
</table>
<p><a href="deposit.jsp">Menu</a></p>
</div>
</body>
</html>