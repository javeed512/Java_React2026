package com.hexaware.mvc.controller;

import java.io.IOException;
import java.util.List;

import com.hexaware.mvc.dao.EmployeeDaoImp;
import com.hexaware.mvc.dao.IEmployeeDao;
import com.hexaware.mvc.pojo.Employee;
import com.hexaware.mvc.service.EmployeeServiceImp;
import com.hexaware.mvc.service.IEmployeeService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayController
 */
@WebServlet("/DisplayController")
public class DisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	
	IEmployeeService service;
	
    public DisplayController() {
    	IEmployeeDao  dao = new EmployeeDaoImp();
        
    	service = new EmployeeServiceImp(dao);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Employee> list =		service.displayAll();
		
			HttpSession session =	request.getSession();
			
			session.setAttribute("empList", list);
		
		
			RequestDispatcher  rd =	 request.getRequestDispatcher("success.jsp");
			
			rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
