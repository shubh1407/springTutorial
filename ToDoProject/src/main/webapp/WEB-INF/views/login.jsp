<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>First Web Application</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!---*** End: JQuery 3.3.1 version. ***--->
<!---*** Start: Bootstrap 3.3.7 version files. ***--->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!---*** End: Bootstrap 3.3.7 version files. ***--->

<script src="https://momentjs.com/downloads/moment.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.43/js/bootstrap-datetimepicker.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.43/css/bootstrap-datetimepicker.min.css">
	
	<style type="text/css">
		
		input {
			border-radius: 10px;
		}

	</style>
</head>
<body>
	<div  style="background-color: black;height: 50px">
		<p style="color: white;font-size: 30px" align="center"><b>Hello My ToDo application</b></p>
	</div>
	<div class="container" style="padding-top: 40px;height:700px;">
		<div class="row">
			<div id="1" class="col-sm-4"></div>
			<div class="col-sm-5" style="font-size: 30px;color: Red">Login Form</div>
			<div class="col-sm-3"></div>
		</div>
		<div class="row" style="padding-top: 20px;">
			<div class="col-sm-3"></div>
			<div class="col-sm-6">
			<form:form action="login" method="post" modelAttribute="user">
				<div class="form-group">
					<form:label path="userName">User Name</form:label>
					<form:input path="userName" required="required" />
				</div>
				<div class="form-group">
					<form:label path="password">Password</form:label>
					<form:input path="password" type="password" required="required" style="margin-left: 7px;"/>
				</div>
				<form:button name="submit" class="btn btn-success" style="margin-left: 100px;">Submit</form:button>
					<p style="color: red; margin-left: 31px;">${message}</p>
			</form:form>
			</div>
			<div class="col-sm-3"></div>
		</div>
	</div>



</body>

</html>