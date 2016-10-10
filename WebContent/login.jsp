<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="edu.neu.cs5200.eims.dao.*, edu.neu.cs5200.eims.models.*, java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet"/>
</head>
<body>
<div class="container">
	<form action="/EmployeeSystem/login" method="post">
	 
		<h1>Login</h1>
		UserID:
		<input name="userid" class="form-control"/>
		User name:
		<input name="username" class="form-control"/>
		Password:
		<input name="password" type="password" class="form-control"/>

		<select name="type" id="type">
			<option value="employee">EMPLOYEE</option>
			<option value="manager">MANAGER</option>
		</select>
		<br>
		<br>
		<button class="btn btn-primary btn-block" name="action" value="register">Register</button>
		<button class="btn btn-primary btn-block" name="action" value="login">Login</button>
		
	</form>
</div>

</body>

<%
	//Check if has msg
	if (request.getParameter("msg") != null)
	{
		int msg = Integer.parseInt(request.getParameter("msg"));
		switch(msg){
		case 1:
			//alert an error
			out.print("<script>alert('Username or password wrong! Please login again......')</script>");
			break;
		}
	}
%>
</html>