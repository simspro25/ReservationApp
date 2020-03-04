<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>

	<h1 style="text-align: center;">Search Flight</h1>
	<hr />
<form action="find-flight" method="post">
<fieldset> 
<input name="departureCity" required placeholder="DepartureCity"/>
<input name="arrivalCity" required placeholder="ArrivalCity"/>

<input type="text" name="departureDate" placeholder="MM-dd-yyyy"/>
<br>
<input type="submit" name="s" value="Search" />
</fieldset>
</form>
</body>
</html>