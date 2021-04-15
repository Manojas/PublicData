<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css" media="all">
.btn-primary{
					align:center;
					padding: 10px 20px;
                    font-size: 15px;
					border-radius: 10px;
					
		}
		.btn-default{
					align:center;
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
  background-color:silver;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
		</style>
		
</head>
<body style="background-color: white">
	<div class="sidenav">
	<form action="ClassRoom.html">
			<p align="center">
			<button type="submit" class="btn btn-default btn-sm"><span class="glyphicon glyphicon"></span> Back </button>
            </p> 
  </form>
  <a href="ViewStudent">veiw Students</a>
  <a href="AddStudent.jsp">Add Student</a>
  <a href="DeleteStudent.jsp">Delete Student</a>
   <a href="ViewStaff">veiw Staff</a>
  <a href="AddStaff.jsp">Add Staff</a>
  <a href="DeleteStaff.jsp">Delete Staff</a>
  <form action="index.html">
			<p align="center">
              <button type="submit" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-log-out"></span> LOG OUT </button>
            </p> 
  </form>
</div>

<div class="main">
  <div align="center"><br>
  <h3><b> STUDENT DETAILS</b></h3>
  <br>
  </div>
  </div>
	<div>			
			<br>		
	</div>
</body>
</html>
