<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Form</title>
</head>
<body>
<H2>Reservation Form</H2>
<form action="saveCustomer" modelAttribute=customer>
Guest Name: <input type="text" name="name"> <br>
Gender: <select name="gender" id="gender">
  <option value="male">M</option>
  <option value="female">F</option>
</select> <br>
Age: <input type="text" name="age"><br>
Email id: <input type="text" name="email"><br>
Mobile Number: <input type="text" name="mobile_num"><br>

<input type="submit" value="Reserve">

</form>
</body>
</html>
