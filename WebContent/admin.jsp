<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>

<style>
.div4{
background-color:bisque;
border:4px solid black;
padding:20px 30px 20px 30px;
}
.body
{
background-color:silver;
}
</style>
</head>
<body class="body">
<h1>Welcome Admin</h1>
<h2> Please Login here</h2>
<div class="div4">
<form class="AdminLogin" method ="get" action="AdminLogin">
Enter Name:<input type="text" name="adminName">
<br>
<br>
Enter Password:<input type="password" name="adminPassword">
<br>
<div class="div5">
<center><input type="submit" value="Login" >
<input type="button" value="Back" onclick="index.html"></center>
</div>
</form>
</div>
</body>
</html>