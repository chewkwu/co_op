<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>Balance</title>
</head>
<body>
<div align="center">
<table>
<tr>
<td>Account No</td>
<td>${member.accountNo}</td>
</tr>
<tr>
<td>Employee No</td>
<td>${member.empNo}</td>
</tr>
<tr>
<td>Surname</td>
<td>${member.surname}</td>
</tr>
<tr>
<td>Other Names</td>
<td>${member.otherName}</td>
</tr>
<tr>
<td>Member Balance</td>
<td>${member.memberBalance}</td>
</tr>
</table>
<p><a href="membermenu.jsp">Menu</a></p>
</div>
</body>
</html>