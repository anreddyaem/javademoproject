<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body, html {
  height: 100%;
}

body {
  background-image:url(./images/bg2.jpg); 
 /*  background-repeat:no-repeat; */
 
  /* Full height */
  height: 100%;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  }

* {
  box-sizing: border-box;
}

.bg-img {
  /* The image used */
/*  background-image:url(./images/bg2.jpg);  */

  /* Control the height of the image */
  min-height: 380px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

/* Add styles to the form container */
.container {
  position: absolute;
  right: 0;
  margin: 20px;
  max-width: 300px;
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
  input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit button */
.btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
</style>

</head>
<body>

<div class="bg-img">
  <form action="./RegisterServlet" method="post" class="container">
    <h1>Registration</h1>

    <label for="email"><b>Employee ID</b></label>
    <input type="text" placeholder="EmpolyeeId" name="empid" required>

    <label for="psw"><b>Employee Name</b></label>
    <input type="text" placeholder="EmployeeName" name="empname" required>
    
     <label for="psw"><b> Employ Salary</b></label>
    <input type="text" placeholder="EmploySalary" name="empsal" required>
    
    <label for="psw"><b>Employ Addres</b></label>
    <input type="text" placeholder="EmployeeAddrs" name="empaddr" required>

    <button type="submit" class="btn">SignUp</button>
  </form>
  
</div>


</body>
</html>