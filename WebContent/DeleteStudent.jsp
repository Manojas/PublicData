<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeleteStudent</title>

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
<h1>Delete Student</h1>
<h2> Please Enter the student name to delete</h2>
<div class="div4">
<form class="DeleteStudent" action="DeleteStudent">
Enter Name:<input type="text" name="studentName">
<br>

<div class="div5">
<center><input type="submit" value="Delete" ></center>
</div>
</form>
</div>
</body>
</html>