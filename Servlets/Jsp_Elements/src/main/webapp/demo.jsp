<%@ page import="java.util.* , java.io.*"   language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello Friends
  <h1>Welcome to JSP</h1>
  
  
 <%! 
 
 	int eid;
   static  String ename;
   
   public static void m1(){
	   
	   
   }
 
 
 %> 
  
 
 <% 
 
   int x = 99;
 
  String str = new String("javeed");
  
  	//request.getParameter("eid");
  	
  		session.setAttribute("city","Mumbai");
  		
  		out.print(session.getAttribute("city"));
  		
  		session.setAttribute("username","Javeed");
  		
  		
  		
  		List   list = new ArrayList();
  		
  		
  		
  		
 %>
 
 	<%@include file="display.jsp" %>
 
 
 

</body>
</html>