<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<form method="get" action="register" class="register-form"
							id="register-form">

<table >
<tr>
<th <a class="nav-link py-3 px-0 px-lg-3 rounded" href="Profile"><%= session.getAttribute("username") %></a>>
Name
</th>
<th>
Email
<a class="nav-link py-3 px-0 px-lg-3 rounded" href="Profile"><%= session.getAttribute("email") %></a>
</th>
<th>
Mobile Number
<a class="nav-link py-3 px-0 px-lg-3 rounded" href="Profile"><%= session.getAttribute("mobile") %></a>
</th>
</tr>
</table>
</form>
</body>
</html>