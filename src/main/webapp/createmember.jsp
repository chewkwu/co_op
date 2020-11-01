<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>create_member</title>
</head>
<body>
<div align="center">
<h2>Create Member</h2>
<form method="post" action="createMember">
<table>
<tr>
<td>Account No</td>
<td><input type="text" name="accountNo"/></td>
</tr>
<tr>
<td>Employee No</td>
<td><input type="text" name="empNo"/></td>
</tr>
<tr>
<td>Surname</td>
<td><input type="text" name="surname"/></td>
</tr>
<tr>
<td>Other Names</td>
<td><input type="text" name="otherName"/></td>
</tr>
<tr>
<td>Date of Birth</td>
<td><input type="text" name="dob"/></td>
</tr>
<tr>
<td>Sex</td>
<td><input type="text" name="sex"/></td>
</tr>
<tr>
<td>Marital Status</td>
<td><input type="text" name="maritalStatus"/></td>
</tr>
<tr>
<td>Company Name</td>
<td><input type="text" name="companyName"/></td>
</tr>
<tr>
<td>Nationality</td>
<td><input type="text" name="nationality"/></td>
</tr>
<tr>
<td>State</td>
<td><input type="text" name="state"/></td>
</tr>
<tr>
<td>L.G.A</td>
<td><input type="text" name="lga"/></td>
</tr>
<tr>
<td>Address</td>
<td><input type="text" name="address"/></td>
</tr>
<tr>
<td>Next of Kin</td>
<td><input type="text" name="nextOfKin"/></td>
</tr>
<tr>
<td>Relationship of Next of Kin</td>
<td><input type="text" name="relOfKin"/></td>
</tr>
<tr>
<td>Phone</td>
<td><input type="text" name="phone"/></td>
</tr>
<tr>
<td>Next of Kin Phone</td>
<td><input type="text" name="nokPhone"/></td>
</tr>
<tr>
<td>Balance</td>
<td><input type="text" name="balance"/></td>
</tr>
<tr>
<td>Username</td>
<td><input type="text" name="username"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password"/></td>
</tr>
<tr>
<td><a href="member.jsp">Member Menu</a></td>
<td><input type="submit" name="Create Member"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>