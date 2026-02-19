<%@ page language="java"   import="java.util.* , com.hexaware.mvc.pojo.*" isELIgnored="false"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body>

	<h1>WELCOME TO JSP </h1>
	
	JSP Scriplet <br>
	
	<% 
	
	List<Employee> list = (List<Employee>) session.getAttribute("empList");
	
			out.print(list);
	
		%>
		
		
		<br>
		EL Expression <br>
		
		${empList}
		
		
	
	
</body>
</html>