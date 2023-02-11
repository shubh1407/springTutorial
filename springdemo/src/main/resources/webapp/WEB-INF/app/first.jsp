<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Web Application</title>
<link rel="stylesheet" href="myown.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!-- Todo -> small mvc project 

1. todo name
2. due date
3. start date
4. description
5. Action -> delete / update

create
 -->
 
 
 <!-- School Management -> spring boot application  -> rest api

1. Admin  -> Add student , Add teacher, view student , view teacher, update and delete
2. Teacher  -> you login,  your classes , you can update your data 
3. Student  -> you login , you can view schedule , you can view your result 

create
 -->
</head>
<body>
	<div class="row">
	<div class="col-sm-2"></div>
	<div class="col-sm-4">
	<b style="font-size: 30px;color: red;margin: 10px"><marquee> Hello Welcome to my application</marquee></b>
		<form class="" action="create" method="post">
			 <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
</div>
<div class="col-sm-4"></div>
</div>
</body>
</html>