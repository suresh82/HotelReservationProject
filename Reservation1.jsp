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
Guest Name: <input type="text" name="name" required> <br>
Gender: <select name="gender" id="gender">
  <option value="male">M</option>
  <option value="female">F</option>
</select> <br>
Age: <input type="number" name="age" size="6" min="18" max="120"required><br>
Email id: <input type="text" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" required placeholder="Enter a valid email address, like example@gmail.com"><br>
Mobile Number: <input type="tel" name="mobile_num" pattern="[789][0-9]{9}" required><br>

<input type="submit" value="Reserve">

</form>
</body>
</html>
