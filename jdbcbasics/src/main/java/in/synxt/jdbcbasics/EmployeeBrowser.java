package in.synxt.jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeBrowser {
	public void printAllEmployees() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cluster1", "postgres", "Open123$");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT employee_id,employee_name,employee_salary,department_id FROM employees");
		while(rs.next()) {
			System.out.println(rs.getInt("employee_id") +"<---->"+ rs.getString("employee_name") 
												+"<---->"+ rs.getDouble("employee_salary") +"<---->"+ rs.getInt("department_id"));				
		}			
		conn.close();
	}
}
