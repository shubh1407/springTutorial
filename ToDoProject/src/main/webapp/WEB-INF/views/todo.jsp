<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://momentjs.com/downloads/moment.js"></script>

<link href='https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css' rel='stylesheet' type='text/css'>
<script src='https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js' type='text/javascript'></script>


<script type="text/javascript">
$('#targetDate').datepicker({
    format: 'mm/dd/yyyy'
});

</script>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="home">ToDo Notes</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="home">Home</a></li>
				<li><a href="list-todos">ToDos</a></li>
				<li><a href="logout">LogOut</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">

		<div class="row">
			<div id="1" class="col-sm-4"></div>
			<div class="col-sm-5" style="font-size: 30px; color: Red">Add/Update
				ToDo</div>
			<div class="col-sm-3"></div>
		</div>
		<div class="row" style="padding-top: 20px;">
			<div class="col-sm-3"></div>
			<div class="col-sm-6">
				<form:form method="post" modelAttribute="toDoInfo">
					<fieldset class="form-group">
						<form:label path="desc">Description</form:label>
						<form:input path="desc" type="text" class="form-control"
							required="required" />
					</fieldset>
					<fieldset class="form-group">
						<form:label path="targetDate">Target Date</form:label>
						<form:input path="targetDate" type="text" class="form-control"
							required="required" data-provide="datepicker" />
					</fieldset>
					<fieldset class="form-group">
						<form:label path="done">Is Done</form:label>
						<form:select path="done" class="form-control">
							<form:option value="false">False</form:option>
							<form:option value="true">True</form:option>
						</form:select>
					</fieldset>
					<button type="submit" class="btn btn-success">Save</button>
				</form:form>
			</div>
			<div class="col-sm-3"></div>
		</div>
	</div>
</body>
</html>