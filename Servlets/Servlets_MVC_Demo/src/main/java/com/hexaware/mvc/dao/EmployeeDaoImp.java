package com.hexaware.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.mvc.pojo.Employee;

public class EmployeeDaoImp implements IEmployeeDao {
	
	
	Connection conn = DBUtil.getDBConnection();
	

	@Override
	public int addEmp(Employee emp) {

		
			int count =0;
			
		try {
			PreparedStatement pstmt =		conn.prepareStatement("insert into  Employee  values(?,?,?)");
			
							pstmt.setInt(1, emp.getEid());
							pstmt.setString(2, emp.getEname());
							pstmt.setDouble(3, emp.getSalary());
			
			
				count =		pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ? positional parameters
		
		
		return  count;
	}

	@Override
	public List<Employee> displayAll() {

		
		List<Employee>  list = new ArrayList<Employee>();
		
		try {
			PreparedStatement pstmt =		conn.prepareStatement("Select  eid,ename ,salary from Employee");
		
				ResultSet rs =	pstmt.executeQuery();
				
				while(rs.next()) {
					
				int eid =	rs.getInt("eid");
				String ename = rs.getString("ename");
				double  salary = rs.getDouble("salary");
				
				
				Employee emp = new Employee(eid, ename, salary);
				
				list.add(emp);
					
				}
				
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}


}
