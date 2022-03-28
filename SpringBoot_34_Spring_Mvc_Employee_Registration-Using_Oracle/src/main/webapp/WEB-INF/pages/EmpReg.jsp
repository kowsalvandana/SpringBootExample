<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMPLOYEE REGISTER</title>
</head>
<body>
<h3>WELCOME TO EMPLOYEE REGISTER PAGE</h3>
<form action="save" method="POST">
<pre>
  NAME   : <input type="text" name="name"/>

  DEPT   : <select name="dept">
   				<option value="DEV">DEV</option>
   				<option value="HR">HR</option>
   				<option value="BA">BA</option>
   				<option value="QA">QA</option>
   			</select>
  ADDRESS: <textarea name="addr"></textarea>
  <input type="submit" value="ADD EMPLOYEE"/>   			
</pre>
</form>
${message}
<script type="text/javascript">
$(document).ready(function(){

		// on change ename text input
	$("#ename").change(function(){
		//make ajax call
		$.ajax({
			url : 'validateName', //URL
			data : {"ename" : $("#ename").val() }, //input
			success:function(resTxt) { //once response came
				$("#msg").html(resTxt); //resTxt is variable(any name is fine)
				$("#msg").css("color","red"); //color for span/error section
			}
	
		});

	});
	
});
</script>
</body>
</html>





