<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>  -->
 <script src="js/jquery.min.js"></script>
<script>
$(document).ready(function (){

	$('#btn').click(function(){

		var id=$('#id').val();
		var name=$('#name').val();
		var sal=$('#sal').val();
		var addr=$('#addr').val();
		
		if(id==null || id==""){
			alert("Please Enter Valid ID");
			return false;
			
		}
if(name==null || name==""){
	alert("Please Enter name");	
	return false;
		}
if(sal==null || sal==""){
	alert("Please Enter sal");	
	return false;
}
if(addr==null || addr==""){
	alert("Please Enter addres");
	return false;
}
		
	$.ajax({
	    type: 'POST',
	    url: 'AjaxServlet',
	    data: {id:id,name:name,sal:sal,addr:addr},
	    success: function (result) {
	        //alert('Sucees Jquey Cal');
	    }
		
		
	});
	    
	  });

	});



</script>
</head>
<body>

<pre>
<form action="" method="">
Id:<input type="text" id="id" name="id"/>
name:<input type="text" id="name" name="name"/>
sal:<input type="text" id="sal" name="sak"/>
address:<input type="text" id="addr" name="addr"/>
<input type="submit" id="btn" name="btn" value="JqueryCal"/>
</pre>
<form>


</body>
</html>