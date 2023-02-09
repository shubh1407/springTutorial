<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script src="https://momentjs.com/downloads/moment.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.43/js/bootstrap-datetimepicker.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.43/css/bootstrap-datetimepicker.min.css">
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
		<p style="font-size: 20px; color: #4fa7e7">Your Todos are -</p>
		<table class="table table-bordered" style="font-size: 18px;">
			<thead class="thead-dark" style="background-color: #000000d6; color: white">
				<tr>
					<th scope="col">Description</th>
					<th scope="col">Target Date</th>
					<th scope="col">Is Done</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
			<!-- for(todo : listTodos){
				
			} -->
				<c:forEach var="todo"  items="${listTodos}">
					<tr>
						<td>${todo.desc}</td>
						<td><fmt:formatDate value="${todo.targetDate}"
								pattern="dd/MM/yyyy" /></td>
						<td>${todo.done}</td>
						<td>
							<a href="updateTodo?id=${todo.id}" class="btn btn-success">Update</a>&nbsp;&nbsp;
							<a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>
	<div class="container">
		<p style="font-size: 15px;color: blue;"><a href="addTodo">Add a Todo</a></p>
	</div>
</body>
</html>