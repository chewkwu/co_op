<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>member_menu</title>
</head>
<body>
<div align="center">
<h2>Member Menu</h2>
<p><a href="createmember.jsp"><img alt="Create Member" src="Create member.png"></a></p>
<p><a href="findmember.jsp"><img alt="Find Member" src="find member.png"></a></p>
<p><a href="updatemember.jsp"><img alt="Update Member" src="Update member.png"></a></p>
<p><a href="removemember.jsp"><img alt="Remove Member" src="Remove member.png"></a></p>
<form method="post" action="allMembers">
<input type="submit" id="allMembtn"/>
</form>
<p><a href="adminmenu.jsp"><img alt="Back" src="Back.png"></a></p>
</div>
</body>
</html>