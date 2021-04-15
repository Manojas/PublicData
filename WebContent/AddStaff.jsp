<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Staff</title>
<style type="text/css">
.div1 {
	background-color: rgb(92, 92, 94);
	border: 3px solid black;
	margin: auto;
	height: 60%;
	weight: 20%;
	padding:10px 250px 10px 550;
}

.div2 {
	color: bisque;
	background-image: url('classroom2.jpg');

}

#h2 {
	color: black;
}

@media screen and(max-width:600px) {
	.col-25, .col75, input[type=student] {
		width: 100;
		margin-top: 0
	}
}
</style>
<script src= "studentscript.js" ></script>
</head>
<body>
</head>
	<h2>
		<center> Add Staff</center>
	</h2>
<body class="div2">

	<form id="studentform" action="AddStaff" method="get" name="registration">
	
		<div class="div1">
		
			<div class="col-25">
				<label>Name:</label> <input type="text" name="name" required><br>

			</div>
			<br>
			<div class="col-75">
				<label>Age:</label> <input type="number" name="age" required><br>
			</div>
			<br>
			<div class="col-25">
				<label>Address:</label> <input type="text" name="address" required>
				<label>City:</label> <input type="text" name="city"><label>Pin
					Code:</label> <input type="number" name="pincode"><br> <br>
				<label>Country:</label> <input type="text" name="country"><br>
			</div>
			<br>
			<div class="col-75">
				<label>Email Address: </label> <input type="text" name="email"
					required>

			</div>
			<br>
			<div class="col-25">
				<label>User Name: </label> <input type="text" name="username"
					required>

			</div>
			<br>
			<div class="col-75">
				<label>Password: </label> <input type="password" name="password"
					required>

			</div>
			<br>
			<div>
			<center class="div1"><input type ="submit" name="Register" onclick="validatestudent()"></center>
			</div>
		</div>
	</form>
	</div>
</body>