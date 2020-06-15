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
  margin: 0;
}

.bg {
  /* The image used */
  background-image: url("./images/bg2.jpg");

  /* Full height */
  height: 100%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
</head>
<body class="bg">

<%@ include file="./Header.jsp" %>
<!-- <div  style="background-color:#d2d2ec;color:white;padding:20px;" > 


<marquee><h1 style="color:red;font-size:46px;"">Welcome to Home Page</h1></marquee> 
 </div> -->
 
 <marquee><italic><h1 style="color:red;font-size:46px;"">Welcome to Home Page</h1></italic></marquee> 
 
 
 
<%@ include file="./Footer.jsp" %>




</body>
</html>