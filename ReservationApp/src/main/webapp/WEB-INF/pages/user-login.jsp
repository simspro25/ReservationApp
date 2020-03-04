<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>

	<h1 style="text-align: center;">User Login</h1>
	<hr />
	${message}
	<hr />

	<form  action="userLogin" method="post">>
		<pre>
	Email:<input type="email" name="email" />
	Password:<input type="password" name="password" />
<br>
<input type="submit" name="s" value="Login" />
</pre>
	</form>


</body>
</html>