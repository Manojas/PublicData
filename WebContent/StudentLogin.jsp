<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome </title>
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
<script>
$document.ready(function(){
$("submit").click(function()
{
	alert("Welcome"+$("#text1").val());
});
});
</script>

</head>
<body class="body">
<h1>Welcome Student</h1>
<br>
<h2>Please Login here</h2>
<form action="StudentOk" method="get" name="StudentOK">
<div class="div4">
Enter Name:<input type="text"  id="text1" name="studentName">
<br>
<br>
Enter Password:<input type="password" name="studentPassword">
<br>
<div class="div5">
<center><input type="submit" value="Login" id="Sometext" ></center>
</div>
</div>
</form>
</body>
</html>