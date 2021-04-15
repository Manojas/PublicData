<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="Com.Mindtree.Model.Staff"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Staff</title>
<style type="text/css" media="all">
.table {
	border: 3px solid black;
	margin-left: auto;
	margin-right: auto;
}

.th {
	padding: 0px 50px 0px 50px;
}

.show {
	float: right;
}

.btn-primary {
	align: center;
	padding: 10px 20px;
	font-size: 15px;
	border-radius: 10px;
}

.btn-default {
	align: center;
	padding: 15px 30px;
	font-size: 20px;
	border-radius: 15px;
}

body {
	font-family: "Lato", sans-serif;
}

.sidenav {
	height: 100%;
	width: 220px;
	position: fixed;
	z-index: 1;
	top: 0;
	left: 0;
	background-color: bisque;
	overflow-x: hidden;
	padding-top: 20px;
}

.sidenav a {
	padding: 6px 8px 6px 16px;
	text-decoration: none;
	font-size: 25px;
	color: #818181;
	display: block;
}

.sidenav a:hover {
	color: #f1f1f1;
}

.main {
	margin-left: 220px;
	font-size: 28px;
	padding: 0px 10px;
	background-color: silver;
}

@media screen and (max-height: 450px) {
	.sidenav {
		padding-top: 15px;
	}
	.sidenav a {
		font-size: 18px;
	}
}
</style>

</head>
<body style="background-color: white">
	<div class="sidenav">
		<form action="ClassRoom.html">
			<p align="center">
				<button type="submit" class="btn btn-default btn-sm">
					<span class="glyphicon glyphicon"></span> Back
				</button>
			</p>
		</form>
		<a href="ViewStudent">veiw Students</a>
		 <a href="AddStudent">Add
			Student</a>
			 <a href="DeleteStudent">Delete Student</a>
			   <a href="ViewStaff">veiw Staff</a>
  <a href="AddStaff.jsp">Add Staff</a>
  <a href="DeleteStaff.jsp">Delete Staff</a>
		<form action="index.html">
			<p align="center">
				<button type="submit" class="btn btn-default btn-sm">
					<span class="glyphicon glyphicon-log-out"></span> LOG OUT
				</button>
			</p>
		</form>
	</div>

	<div class="main">
		<div align="center">
			<br>
			<h3>
				<b> STUDENT DETAILS</b>
			</h3>
			<br>
		</div>

	</div>
	<div class="show">

		<table class="table">

			<tr>
				<th>Staff UserName</th>
				<th>Staff Name</th>
				<th>Staff Age</th>
				<th>Staff Address</th>
				<th>Staff City</th>
				<th>Staff Email</th>
			</tr>

			<%
				Staff[] st = (Staff[]) request.getAttribute("result");
				for (int i = 0; i < st.length; i++) {

					Staff staff = st[i];

					if (staff != null) {
			%>
			<tr>
				<td><%=staff.getStaffUserName()%></td>
				<td><%=staff.getStaffName()%></td>
				<td><%=staff.getAge()%></td>
				<td><%=staff.getAddress()%></td>
				<td><%=staff.getCity()%></td>
				<td><%=staff.getStaffMail()%></td>
			</tr>
			<%
				}
			%>
			<%
				}
			%>
		</table>
		<br>
	</div>
</body>
</html>