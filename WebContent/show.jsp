<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
body {
  /*background-image:url(./images/bg3.jpg); */
 /*  background-repeat:no-repeat; */
 background-color: #a1aeb3;  
  /* Full height */
  height: 100%;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  }
</style>
</head>
<body>

<table border="2" align="center" valign="center">
<tr><th>Employ ID</th><th>Employ Name</th><th>Employ Salary</th><th>Employ Addrees</th><tr>
    <c:forEach var="employee" items="${employobj}">
    
        <tr>
          <td><c:out value="${employee.empId}"/></td>
          <td><c:out value="${employee.empName}"/></td>
          <td><c:out value="${employee.empSalary}"/></td>
          <td><c:out value="${employee.empAdrrs}"/></td>
       </tr>
    </c:forEach>
</table> 


</body>
</html>

