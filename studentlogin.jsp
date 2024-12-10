<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Login</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
	<script src="https://kit.fontawesome.com/a81368914c.js"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
</head>
<body>
	<img class="wave" src="img/wave.png">
	<div class="container">
		<div class="img">
			<img src="img/bg.svg">
		</div>
		<div class="login-content">
		
			<form action="checkstudentlogin" method = "post">
				<img src="img/avatar.svg">
				<h2 class="title">Student Login</h2>
				<div class="input-div one">
				<div class="i">
						<i class="fas fa-user"></i>
				</div>
				<div class="div">
						<h5>Email</h5>
						<input name = "email" type="email" class="input" required>
				</div>
				</div>
				<div class="input-div pass">
				<div class="i"> 
						<i class="fas fa-lock"></i>
				</div>
				<div class="div">
						<h5>Password</h5>
						<input name = "pwd" type="password" class="input" required>
				</div>
				</div>
				<a href="#">Forgot Password?</a>
				<input type="submit" class="btn" value="Login">
				<input type="reset" class="btn1" value="Reset">
			</form>
			<a href = "/"><button class="button">Home</button></a>
		</div>
	</div>
	<script type="text/javascript" src="js/main.js"></script>
</body>
</html>
