<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Reservation System</title>
</head>
<body>
<H2>Hotel Reservation System</H2>
<form action="hotelStatus">
City: <select name="City" id="city">
  <option value="Bangolor">Bangolor</option>
  <option value="Chennai">Chennai</option>
  <option value="Hyderabad">Hyderabad</option>
  <option value="Delhi">Delhi</option>
</select> <br>
Hotel: <select name="Hotel" id="hotel">
  <option value="Novatel">Novatel</option>
  <option value="HotelGrand">HotelGrand</option>
  <option value="HotelTaj">HotelTaj</option>
</select> <br>
Date: <input type="date" id="date" name="Date"> <br>

<input type="submit" value="Check Availability">
</form>
</body>
</html>

