<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Passenger info </title>
</head>
<body>
<h1 style="text-align: center;">Passenger Info</h1>
	<hr />
	${message}
	<hr />
	<table>
	 <tr>
	 <th>Flight info</th>
	 </tr>
	     <tr>
		  <td>${f.Airlines}</td>
		 </tr>
		 <tr>
		    <td>${f.Departure:}</td>
		  </tr>
		  <tr>
		    <td>${f.Arrival:}</td>
		    </tr>
	</table>
	
	
	<form  action="savePassenger" method="post">>
		<pre>
	Name:<input type="text" name="firstname" />
	Name:<input type="text" name="lastname" />
	Name:<input type="text" name="middlename" />
	Email:<input type="email" name="email" />
	Phone:<input type="text" name="phone" />
<br>
<input type="submit" name="s" value="Save" />
</pre>
	</form>
	
	<form  action="saveCardDetais" method="post">>
		<pre>
	Name:<input type="text" name="nameonthecard" />
	Phone:<input type="tel" name="phone" />
	Pin:<input type="password" name="pin" />
<br>
<input type="submit" name="s" value="Save" />
</pre>
	</form>

</body>
</html>