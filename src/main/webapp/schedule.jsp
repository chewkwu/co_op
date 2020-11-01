<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>schedule</title>
</head>
<body>
<div align="center">
<h2>Loan Payment Schedule</h2>
<table>
<tr>
<td>Loan Schedule ID</td>
<td>Loan ID</td>
<td>Schedule Amount</td>
<td>Schedule Date</td>
</tr>
<c:forEach var="sch" items="${schedule}">
<tr>
<td>${sch.loanScheduleID}</td>
<td>${sch.loan.loanID}</td>
<td>${sch.scheduleAmount}</td>
<td>${sch.scheduleDate}</td>
</tr>
</c:forEach>
</table>
<p><a href="loan.jsp">Menu</a></p>
</div>
</body>
</html>