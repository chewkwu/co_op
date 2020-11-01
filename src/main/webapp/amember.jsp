<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>member</title>
</head>
<body>
<div>
<h2>Member Details</h2>
<table>
<tr>
<td>Account Number</td>
<td>${member.accountNo}</td>
</tr>
<tr>
<td>Employee Number</td>
<td>${member.empNo}</td>
</tr>
<tr>
<td>Surname</td>
<td>${member.surname}</td>
</tr>
<tr>
<td>Other Names</td>
<td>${member.otherNames}</td>
</tr>
<tr>
<td>Date of Birth</td>
<td>${member.dob}</td>
</tr>
<tr>
<td>Sex</td>
<td>${member.sex}</td>
</tr>
<tr>
<td>Marital Status</td>
<td>${member.maritalStatus}</td>
</tr>
<tr>
<td>Company Name</td>
<td>${member.companyName}</td>
</tr>
<tr>
<td>Nationality</td>
<td>${member.nationality}</td>
</tr>
<tr>
<td>State</td>
<td>${member.state}</td>
</tr>
<tr>
<td>L.G.A</td>
<td>${member.lga}</td>
</tr>
<tr>
<td>Address</td>
<td>${member.address}</td>
</tr>
<tr>
<td>Next of Kin</td>
<td>${member.nextOfKin}</td>
</tr>
<tr>
<td>Relationship of Next of kin</td>
<td>${member.relationshipOfNextOfKin}</td>
</tr>
<tr>
<td>Phone</td>
<td>${member.memberPhone}</td>
</tr>
<tr>
<td>Next of Kin Phone</td>
<td>${member.nextOfKinPhone}</td>
</tr>
<tr>
<td>Start Date</td>
<td>${member.startDate}</td>
</tr>
<tr>
<td>Exit Date</td>
<td>${member.exitDate}</td>
</tr>
<tr>
<td>Member Status</td>
<td>${member.memberStatus}</td>
</tr>
<tr>
<td>Member Balance</td>
<td>${member.memberBalance}</td>
</tr>
</table>
<p><a href="member.jsp">Menu</a></p>
</div>
</body>
</html>