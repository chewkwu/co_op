<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="frame.css" />
<title>Loan Menu</title>
</head>
<body>
<div align="center">
<p><a href="createloan.jsp"><img alt="Create Loan" src="Create a loan.png"></a></p>
<p><a href="viewloan.jsp"><img alt="View Loan" src="View a Loan.png"></a></p>
<p><a href="paymentsch.jsp"><img alt="View loan Repayment Schedule" src="View Loan repayment schedule.png"></a></p>
<p><a href="allmemberloans.jsp"><img alt="All member loans" src="All member loans.png"></a></p>
<p><a href="pay.jsp"><img alt="Make Payment" src="Make Payment.png"></a></p>
<form method="post" action="allLoans">
<p><input type="submit" id="allLoansbtn"/></p>
</form>
<p><a href="adminmenu.jsp"><img alt="Back" src="Back.png"></a></p>
</div>
</body>
</html>