<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
    background-color: #333;
   color: white;
   text-align: center;
    display:flex;
       justify-content:space-evenly;
}

a {color:#ead8e5; /*new colour*/
  text-decoration: none;
}
</style>

</head>
<body>
<div class="footer">

		<p>
			<a href="./Success.jsp">success</a>
		</p>
		<p>
			<a href="./getempolyes.jsp">Fetch Employ Data</a>
		</p>
		<p>
			<a href="./Update.jsp">Update</a>
		</p>
		<p>
			<a href="./delete.jsp">Delete</a>
		</p>
		<p>
			<a href="./AjaxData.jsp">JQryAjax</a>
		</p>
		<p>
			<a href="./EmployIdExist.jsp">IdExist</a>
		</p>
		
		<p>
			<a href="./RegiFormValidation.jsp">JFormValidation</a>
		</p>



		<!--  display:flex
       justify-content:space-evenly -->
</div>


</body>
</html>