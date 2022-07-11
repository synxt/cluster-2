package in.synxt.jdbcbasics;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws SQLException {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter Employee Id"); int empId =
		 * Integer.parseInt(sc.nextLine());
		 * 
		 * System.out.println("Enter Hike Amount"); double hikeAmount =
		 * Double.parseDouble(sc.nextLine());
		 */		
		EmployeeBrowser empBrowser = new EmployeeBrowser();
		
		//empBrowser.hikeSalaryByToEmployeeById(hikeAmount,empId);
		
		//empBrowser.printEmployee(empId);
		/*
		 * System.out.println("Enter Employee Name"); String empName = sc.nextLine();
		 * EmployeeBrowser empBrowser = new EmployeeBrowser();
		 * empBrowser.printEmployeeByName(empName);
		 */
		//System.out.println(empBrowser.getNameById(10));
		empBrowser.getEmployeesByDeptId(1);
	}
}
