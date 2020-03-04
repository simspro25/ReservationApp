<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>

	<h1 style="text-align: center;">User Reg.Form</h1>
	<hr />
	${message}
	<hr />

	<form  action="saveUser" method="post">>
		<pre>
	Name:<input type="text" name="firstname" />
	Name:<input type="text" name="lastname" />
	Email:<input type="email" name="email" />
	Password:<input type="password" name="password" />
<br>
<input type="submit" name="s" value="Save" />
</pre>
	</form>


</body>
</html>