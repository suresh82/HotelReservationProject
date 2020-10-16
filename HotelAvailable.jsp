<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="custReservation">

<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">RoomType</th>
      <th scope="col">Price</th>
      <th scope="col">GST</th>
      <th scope="col">Total</th>
    </tr>
  </thead>
  <tbody>
    <tr>
    <td>${RoomType}</td>
    <td>${Price}</td>
    <td>${GST}</td>
    <td>${TotalPrice}</td>
    </tr>
  </tbody>
</table>

<input type="submit" name="confirm" value="Confirm">
<input type="submit" name="back" value="Back">
</form>
</body>
</html>
