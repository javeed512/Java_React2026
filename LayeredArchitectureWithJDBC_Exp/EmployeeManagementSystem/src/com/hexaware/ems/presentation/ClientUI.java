package com.hexaware.ems.presentation;

import java.util.List;
import java.util.Scanner;

import com.hexaware.ems.exception.EmployeeNotFoundException;
import com.hexaware.ems.pojo.Employee;
import com.hexaware.ems.service.EmployeeServiceImp;
import com.hexaware.ems.service.IEmployeeService;

public class ClientUI {
	
	static Scanner  scanner = new Scanner(System.in);

	public static void main(String[] args) {

	
		
	IEmployeeService service =	 new EmployeeServiceImp();

		boolean flag = true;
		
		

		while (flag) {
			
			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. DISPLAY ALL EMPLOYEES");
			System.out.println("3. UPDATE EMPLOYEE");
			System.out.println("4. DELETE EMPLOYEE");
			System.out.println("5. DISPLAY BY EID");
			System.out.println("6. EXIT");
			
			
		int choice =	  scanner.nextInt();

			switch (choice) {
			case 1:
				
				Employee emp =	readEmpData();
				
				int count =	service.addEmployee(emp);
				
				if(count > 0) {
					
					System.out.println("Employee Record inserted successfully");
					
				}
				else {
					
					System.err.println("Insert fail..");
					
				}

				break;

			case 2:

				List<Employee> list =		service.displayAllEmployees();
				
						list.stream().forEach(System.out::println);
						
				break;
				
			case 3:
				
					  Employee e1 = readEmpData();
				
					int  n1 =  	service.updateEmployee(e1);
					
					if(n1 > 0) {
						
						System.out.println("Employee Record updated successfully");
						
					}
					else {
						
						System.err.println("update fail..");
						
					}
					
				
				break;
			case 4:
				
				  	  System.out.println("Enter Eid");
				  	  
				  	int   empId =  scanner.nextInt();
				  	
				  			if(service.deleteByEid(empId) > 0) {
				  				
				  				System.out.println("Record Deleted for Employee "+empId);
				  				
				  			}
				  			else {
				  				
				  				System.err.println("Delete fail");
				  			}
				
				
				break;
				
			case 5:
				
				
				  System.out.println("Enter Eid to Search Employee");
			  	  
				  	int   eid1 =  scanner.nextInt();
				  	
				  	Employee employee =		service.selectByEid(eid1);
				  	
				  	
				  	if(employee != null) {
				  	
				  	
				  	System.out.println(employee);
				  	
				  	}
				  	else {
				  		
				  		try {
				  		
				  		throw  new EmployeeNotFoundException();
				  		
				  		}catch(EmployeeNotFoundException e) {
				  			
				  			
				  			System.err.println("Sorry!  Employee Not Found with eid "+eid1);
				  			
				  		}
				  		
				  	}
				
				
				break;
				
				
				
			case 6:
				
						flag = false;
						
						System.out.println("Thank you , Visit again..");

				break;

			default:
				break;
			}

		}

	}
	
	
		public static Employee  readEmpData() {
			
			System.out.println("Enter EID");
			int eid =  scanner.nextInt();
			System.out.println("Enter ENAME");
			String ename = scanner.next();
			System.out.println("Enter SALARY");
			double salary = scanner.nextDouble();
			
			Employee emp = new Employee(eid, ename, salary);
			
			return emp;
			
			
		}
	
	

}
