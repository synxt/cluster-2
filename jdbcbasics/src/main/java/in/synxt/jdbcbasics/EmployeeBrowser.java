package in.synxt.jdbcbasics;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import com.sun.rowset.internal.Row;

public class EmployeeBrowser {
	final String findEmployeeById = "SELECT employee_id eid,employee_name,employee_salary,department_id FROM test_employess WHERE employee_id=?";
	final String findEmployeeByName = "SELECT employee_id eid,employee_name,employee_salary,department_id FROM test_employess WHERE employee_name=?";
	final String hikeSalary = "UPDATE test_employess SET employee_salary=employee_salary+? WHERE employee_id=?";
	
	public void printAllEmployees() throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cluster1", "postgres", "Open123$");
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT employee_id eid,employee_name,employee_salary,department_id FROM test_employess=");
		
		while(rs.next()) {
			System.out.println(rs.getInt("eid") +"<---->"+ rs.getString("employee_name") 
												+"<---->"+ rs.getDouble("employee_salary") +"<---->"+ rs.getInt("department_id"));				
		}
		
		conn.close();
	}
	
	public void printEmployee(int empId) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cluster1", "postgres", "Open123$");
		PreparedStatement stmt = conn.prepareStatement(findEmployeeById);
		stmt.setInt(1, empId);
				
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("eid") +"<---->"+ rs.getString("employee_name") 
												+"<---->"+ rs.getDouble("employee_salary") +"<---->"+ rs.getInt("department_id"));				
		}
		
		conn.close();
	}
	
	public void printEmployeeByName(String empName) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cluster1", "postgres", "Open123$");
		PreparedStatement stmt = conn.prepareStatement(findEmployeeByName);
		stmt.setString(1, empName);
				
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("eid") +"<---->"+ rs.getString("employee_name") 
												+"<---->"+ rs.getDouble("employee_salary") +"<---->"+ rs.getInt("department_id"));				
		}
		
		conn.close();
	}
	

	public void hikeSalaryByToEmployeeById(double hikeAmount, int employeeId) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cluster1", "postgres", "Open123$");
		PreparedStatement stmt = conn.prepareStatement(hikeSalary);
		stmt.setDouble(1, hikeAmount);
		stmt.setInt(2, employeeId);
				
		int count = stmt.executeUpdate();
		
		System.out.println(count+" rows updated");
		
		conn.close();
	}
	
	public String getNameById(int employeeId) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cluster1", "postgres", "Open123$");
		CallableStatement stmt = conn.prepareCall("{?=call GET_EMP_NAME(?)}");
		
		stmt.registerOutParameter(1, Types.VARCHAR);
		stmt.setInt(2, employeeId);
		stmt.execute();
		String empName = stmt.getString(1);
		
		conn.close();
		
		return empName;
	}
	
	public void getEmployeesByDeptId(int departmentId) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cluster1", "postgres",
				"Open123$");
		conn.setAutoCommit(false);
		CallableStatement stmt = conn.prepareCall("{?=call GET_ALL_EMPSBYDEPTID(?)}");

		stmt.registerOutParameter(1, Types.OTHER);
		stmt.setInt(2, departmentId);
		stmt.execute();
		ResultSet rows = (ResultSet) stmt.getObject(1);

		while (rows.next()) {
			System.out.println(rows.getInt("employee_id") + "<----->" + rows.getString("employee_name") + "<----->"
					+ rows.getInt("department_id"));
		}
 
		conn.close();			
	}
	
	public void getEmpsByDeptId(int departmentId) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cluster1", "postgres",
				"Open123$");
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM employees WHERE department_id=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		stmt.setInt(1, departmentId);
		ResultSet rows = stmt.executeQuery();
		
		while (rows.next()) {
			System.out.println(rows.getRow()+")"+rows.getInt("employee_id") + "<----->" + rows.getString("employee_name") + "<----->"
					+ rows.getDouble("employee_salary"));
			if(rows.getInt("employee_id")==13) {				
				rows.updateDouble("employee_salary", rows.getDouble("employee_salary")+50000);
				rows.updateRow();
			}
		}
		rows.moveToInsertRow();
		rows.updateInt("employee_id", 895);
		rows.updateString("employee_name", "Jai");
		rows.updateDouble("employee_salary", 200000);
		rows.insertRow();
		/*
		 * try { Thread.sleep(1000*60*1); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		
		/*
		 * rows.beforeFirst();
		 * 
		 * while (rows.next()) {
		 * 
		 * System.out.println(rows.getRow()+")"+rows.getInt("employee_id") + "<----->" +
		 * rows.getString("employee_name") + "<----->" + +
		 * rows.getDouble("employee_salary")); }
		 */
		conn.close();			
	}
	
	
public int createEmployee(String empName,double salary ) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cluster1", "postgres",
				"Open123$");
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO employees(employee_name,employee_salary) VALUES(?,?)",1);
		stmt.setString(1, empName);
		stmt.setDouble(2, salary);
		stmt.executeUpdate();
		ResultSet keys= stmt.getGeneratedKeys();		
		keys.next();
		return keys.getInt("employee_id");						
	}
}
