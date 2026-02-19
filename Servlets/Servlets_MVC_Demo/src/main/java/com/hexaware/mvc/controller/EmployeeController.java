package com.hexaware.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.hexaware.mvc.dao.EmployeeDaoImp;
import com.hexaware.mvc.dao.IEmployeeDao;
import com.hexaware.mvc.pojo.Employee;
import com.hexaware.mvc.service.EmployeeServiceImp;
import com.hexaware.mvc.service.IEmployeeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IEmployeeService service ;
	

    /**
     * Default constructor. 
     */
    public EmployeeController() {
    	
    	IEmployeeDao  dao = new EmployeeDaoImp();
      
    	service = new EmployeeServiceImp(dao);
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int eid =    Integer.parseInt(request.getParameter("eid"));
			
		String ename =	request.getParameter("ename");
			
		double salary =   Double.parseDouble(request.getParameter("salary"));
			
			
			Employee emp = new Employee(eid,ename,salary);
			
			int  count = service.addEmp(emp);
			
			PrintWriter  out =	response.getWriter();
			
				out.print(count + "record inserted successfully..");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
