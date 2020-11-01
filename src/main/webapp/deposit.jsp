<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>Deposit Menu</title>
</head>
<body>
<div align="center">
<h2>Deposits Menu</h2>
<p><a href="makedeposit.jsp"><img alt="Make Deposit" src="Make deposit.png"></a></p>
<p><a href="viewdeposit.jsp"><img alt="View a Deposit" src="View a deposit.png"></a></p>
<p><a href="membersdeposit.jsp"><img alt="Member's Deposits" src="Member Deposits.png"></a></p>
<form method="post" action="allDeposits">
<p><input type="submit" id="depbtn"/></p>
</form>
<p><a href="adminmenu.jsp"><img alt="Back" src="Back.png"></a></p>
</div>
</body>
</html>