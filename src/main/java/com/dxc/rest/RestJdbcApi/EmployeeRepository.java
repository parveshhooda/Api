package com.dxc.rest.RestJdbcApi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
public class EmployeeRepository {
	
	
	
	Connection con = null;
	
	public EmployeeRepository() {
		String url="jdbc:mysql://localhost:3306/restdb";
		String username="root";
		String password ="1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			
		}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
	
	public List<Employee> getEmployees(){
		List<Employee> emplist = new ArrayList<>();
		
		String sql = "Select * from employee";
		System.out.print("getEmployees() Method");
		
		try {
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Employee e = new Employee();
				
				e.setEmpId(rs.getInt(1));
				e.setEmployee(rs.getString(2));
				e.setAge(rs.getInt(3));
				e.setContact_Number(rs.getString(4));
				e.setEmail(rs.getString(5));
				
				emplist.add(e);
				System.out.print("Employee Object Updated");
			}
			
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
		
		return emplist;
	}
}