<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <script src="js/jquery.min.js"></script>
 <script>
 

 $(document).ready(function (){

	 // alert("hey Jquery..");
		 $('#id').on("input keyup", function(){
              // alert("hai");
			var id=$('#id').val();	
			
			    $.post("EmployIdExistServlet",{id:id},
			    
			    function(res){
			    	
			    	//alert("**********"+res);
			     $("#idError").text(res);
			     if(res!=""){
			    	 $("#id").val("");
			     }
			     
			    	
			    }); 
			
		/* $.ajax({
		    type: 'POST',
		    url: 'EmployIdExistServlet',
		    data: {id:id,name:name,sal:sal,addr:addr},
		    success: function (result) {
		        //alert('Sucees Jquey Cal');
		    }
			
			
		}); */
		    
		 

		});
 });
 
 
 </script>
 
</head>
<body>

<pre>
<form>
Id:<input type="text" id="id" name="id" ><span id="idError" style="color:red;"></span>
name:<input type="text" id="name" name="name"/>
sal:<input type="text" id="sal" name="sal"/>
addr:<input type="text" id="addr" name="addr"/>
<input type="submit" value="submit"/>
</form>
</pre>



</body>
</html>