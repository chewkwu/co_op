<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>All Members</title>
</head>
<body>
<div align="center">
<table>
<tr>
<td>Account Number</td>
<td>Employee Number</td>
<td>Surname</td>
<td>Other Names</td>
<td>Date of Birth</td>
<td>Sex</td>
<td>Marital Status</td>
<td>Company Name</td>
<td>Nationality</td>
<td>State</td>
<td>L.G.A</td>
<td>Address</td>
<td>Next of Kin</td>
<td>Relationship of Next of Kin</td>
<td>Next of Kin Phone</td>
<td>Start Date</td>
<td>Exit Date</td>
<td>Member Phone</td>
<td>Member Status</td>
<td>Member Balance</td>
</tr>
<c:forEach var="member" items="${members}">
<tr>
<td>${member.accountNo}</td>
<td>${member.empNo}</td>
<td>${member.surname}</td>
<td>${member.otherNames}</td>
<td>${member.dob}</td>
<td>${member.sex}</td>
<td>${member.maritalStatus}</td>
<td>${member.companyName}</td>
<td>${member.nationality}</td>
<td>${member.state}</td>
<td>${member.lga}</td>
<td>${member.address}</td>
<td>${member.nextOfKin}</td>
<td>${member.relationshipOfNextOfKin}</td>
<td>${member.nextOfKinPhone}</td>
<td>${member.startDate}</td>
<td>${member.exitDate}</td>
<td>${member.memberPhone}</td>
<td>${member.memberStatus}</td>
<td>${member.memberBalance}</td>
</tr>
</c:forEach>
</table>
<p><a href="member.jsp">Menu</a></p>
</div>
</body>
</html>