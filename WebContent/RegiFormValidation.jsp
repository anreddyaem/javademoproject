<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>

function validate(){
	
	//alert("validate fuction called");
	
	 var empId=document.forms['myform']['id'].value;
	var empName=document.forms['myform']['name'].value; 
	
/* var empId=	document.getElementById('id').value;
var empName=document.getElementById('name').value; */
	
	alert('***********'+empId);
	
	if(empId==null || empId==""){
		
		alert("Please Enter Id");
		return false;
	}
	
if(empName==null || empName==""){
		
		alert("Please Enter Name");
		return false;
	}
	
	
}



</script>


</head>
<body>
<pre>
<form action="" method="" name="myform">

EmployId:<input type="text" id="id" name="name"/>
EmployName:<input type="text" id="name" name="name"/>

<input type="submit" value="submit" onclick="validate()"/>


</form>
</pre>
</body>
</html>