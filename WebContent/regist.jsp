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
	<form action="/EmployeeSystem/register" method="post">
	 
		<h3>Registration</h3>
		UserID:
		<input name="userid" class="form-control"/>
		User name:
		<input name="username" class="form-control"/>
		Password:
		<input name="password" type="password" class="form-control"/>
		Department:
		<br>
		<select name="department" class="form-control">
			<option value="1">1. Financial Department</option>
			<option value="2">2. Technology Department</option>
			<option value="3">3. Sales Department</option>
			<option value="4">4. Logistics Department</option>
		</select>
		Registration Type: 
		<select name="type" id="type" class="form-control">
			<option value="employee">EMPLOYEE</option>
			<option value="manager">MANAGER</option>
		</select>
		<h3>Other Information:</h3>
		Gender:
		<select name="gender" class="form-control">
			<option value="male">MALE</option>
			<option value="female">FEMALE</option>
			<option value="other">OTHER</option>
		</select>
		Date of Birth(MMDDYYYY):
		<input name="dob" class="form-control"/>
		Age:
		<input name="age" class="form-control"/>
		Education background:
		<select name="edu" class="form-control">
			<option value="high school">High School</option>
			<option value="undergraduate">Undergraduate</option>
			<option value="graduate">Graduate</option>
			<option value="doctor">Doctor</option>	
			<option value="professor">Professor</option>		
		</select>
		Entry date(MMDDYYYY):
		<input name="entry" class="form-control"/>
		Telephone:
		<input name="tele" class="form-control"/>
		Address:
		<input name="address" class="form-control"/>
		Email:
		<input name="email" class="form-control"/>
		<br>
		<br>
		<button class="btn btn-primary btn-block" name="submit" value="submit">Submit</button>
		
	</form>
</div>
</body>
</html>