<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<fm:form action="login" method="post" modelAttribute="user">
		<fm:label path="userName">userName</fm:label>
			<fm:input path="userName" type="text" class="form-control"
				required="required" />
		<fm:label path="password">password</fm:label>
			<fm:input path="password" type="text" class="form-control"
				required="required" />
		<button type="submit">Submit</button>
	</fm:form>
</body>
</html>