<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/style.css">
<!-- <style>  
body{  
  font-family: Calibri, Helvetica, sans-serif;  
 /* background-color: pink;  */
}  
.container {  
    padding: 50px;  
  background-color: lightblue;  
}  
  
input[type=text], input[type=password], textarea {  
  width: 100%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  background: #f1f1f1;  
}  
input[type=text]:focus, input[type=password]:focus {  
 /* background-color: orange; */ 
  outline: none;  
}  
 div {  
            padding: 10px 0;  
         }  
hr {  
  border: 1px solid #f1f1f1;  
  margin-bottom: 25px;  
}  
.registerbtn {  
  background-color: #4CAF50;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 100%;  
  opacity: 0.9;  
}  
.registerbtn:hover {  
  opacity: 1;  
}  
</style>  
 -->
</head>
<body>
	<form action="./RegisterServlet" method="post">
		<div class="container">
			<center>
				<h1>Signup Form</h1>
			</center>
			<hr>
			<label>Employee ID</label> <input type="text" name="empid"
				placeholder="EmpolyeeId" size="15" required /> <label>
				Employee Name </label> <input type="text" name="empname"
				placeholder="EmployeeName" size="15" required /> <label> Employ
				Salary </label> <input type="text" name="empsal" placeholder="EmploySalary"
				size="15" required /> <label> Employ Addres</label> <input
				type="text" name="empaddr" placeholder="EmployeeAddrs" size="15"
				required />

			<div>
				<div>
					<input type="submit" id="submit" name="submit" value="submit" />
				</div>
				<label> </label>
				</form>
				
				<p><a href="./getempolyes.jsp">Fetch Employ Data</a></p>
</body>
</html>


