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

	<h1 style="text-align: center;">Show Flight</h1>
	<hr />
	<table border="1">
		<tr>
			<th>Airlines</th>
			<th>DepartureCity</th>
			<th>ArrivalCity</th>
			<th>Date of Departure</th>
			<th>Select</th>
		</tr>
		<c:forEach items="${flights}" var="f">
			<tr>
				<td>${f.operatingAirlines}</td>
				<td>${f.departureCity }</td>
				<td>${f.arrivalCity }</td>
				<td>${f.dateOfDeparture }</td>
				<td><a href="showCompleteReservartion?flightId=${f.id}">Select</a>
				</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>