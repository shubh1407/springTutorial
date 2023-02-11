<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Web Application</title>
</head>
<body>
	Hello Welcome to my application
	
	<form action="create" method="post">
		<label>First Name : </label> <input type="text" name="firstName" /><br />
		<label>Last Name : </label><input type="text" name="lastName" /><br />
		<label>Roll No : </label><input type="text" name="rollNo" /><br />
		<label>Contact No : </label><input type="text" name="contactNo" /><br />
		<button type="submit">submit</button>
	</form>
	
	<form action="delete" method="delete">
		
		<label>Roll No : </label><input type="text" name="rollNo" /><br />
		<button type="submit">submit</button>
	</form>
</body>
</html>