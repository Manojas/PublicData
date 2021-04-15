<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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
<h1>Welcome Staff</h1>
<br>
<h2> Please Login here</h2>
<div class="div4">
<form action="StaffOk" method="get" name="StaffOK">
Enter Name:<input type="text"  name="staffName">
<br>
<br>
Enter Password:<input type="password" name="staffPassword">
<br>
<div class="div5">
<center><input type="submit" value="Login"  ></center>
</div>
</div>
</body>
</html>