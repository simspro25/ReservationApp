<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>

	<h1 style="text-align: center;">Show Reservation</h1>

<hr/>
<h1>Flight Details</h1>
<ul>
<li>Airline: ${flight.operatingAirlines }</li>
<li>Departure city: ${flight.departureCity }</li>
<li>Arrival city: ${flight.arrivalCity }</li>
<li>Date of Departure: ${flight.dateOfDeparture }</li>
</ul>

<div>


<h1>Passenger Form</h1>
<pre>
<form action="completeReservation" method="post">
<lable for="firstName">FirstName</lable><input name="firstName" placeholder="FirstName"/>

<lable for="lastName">LastName</lable><input name="lastName" placeholder="LastName"/>

<lable for="email">Email</lable><input name="email" placeholder="EmailId"/>

<lable for="phone">Phone</lable><input name="phone" placeholder="Phone"/>
<br/>
<input type="hidden" name="flightId" value="${flight.id }"/>
<input type="submit" name='s' value="CompleteReservation"/>
</form>
</pre>
</div>



</body>
</html>