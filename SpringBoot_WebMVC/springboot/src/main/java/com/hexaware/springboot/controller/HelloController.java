package com.hexaware.springboot.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot.entity.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/app")
public class HelloController {
	
			@Autowired
			Employee emp;
	
	
		@RequestMapping("/hello")
		@ResponseBody
		public String  sayHello() {
			
			
			return "Welcome to Spring";
			
		}
	
		
		
		@RequestMapping(value = "/add" , method = RequestMethod.POST)
		@ResponseBody
		public  String    addEmp(HttpServletRequest request , HttpServletResponse response) {
			
				int eid =	Integer.parseInt(request.getParameter("eid"));
				String ename =  request.getParameter("ename");
				
				double salary =  Double.parseDouble(request.getParameter("salary"));
			
			
					emp.setEid(eid);
					emp.setEname(ename);
					emp.setSalary(salary);
					
					
			
			
				return "Data added to DB "+emp;
			
		}
		
		
		@RequestMapping(value = "/insert" , method = RequestMethod.POST)
		@ResponseBody
		public void    insertEmployee(HttpServletRequest request , HttpServletResponse response , HttpSession session) throws ServletException, IOException {
			
			int eid =	Integer.parseInt(request.getParameter("eid"));
			String ename =  request.getParameter("ename");
			
			double salary =  Double.parseDouble(request.getParameter("salary"));
		
		
				emp.setEid(eid);
				emp.setEname(ename);
				emp.setSalary(salary);
				
				session.setAttribute("emp", emp);
				
				PrintWriter out = response.getWriter();
				
				response.setContentType("text/html");
				
				
				
				out.print("<h1> Employee Controller Executed.. </h1>");
				
			RequestDispatcher  rd =	request.getRequestDispatcher("/success.jsp");
			
			 rd.include(request, response);
				
			
			
		}
		
		
		
	

}
