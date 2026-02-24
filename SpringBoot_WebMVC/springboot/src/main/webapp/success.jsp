<%@ page language="java" import="com.hexaware.springboot.entity.*"  isELIgnored="false"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	JSP Scriptlet <br>
	
	<% 
	
	Employee emp = (Employee)	session.getAttribute("emp");
	
	  out.print(emp);
		
	
	%>
	
<br>	JSP Exp <br>

	<%= session.getAttribute("emp")  %>


<br>	EL Exp <br>

		${ emp }

</body>
</html>