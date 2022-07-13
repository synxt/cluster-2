package in.synxt.jdbcbasics;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		//empBrowser.getEmpsByDeptId(1);
		//System.out.println(empBrowser.createEmployee("AUTO CREATED", 12000000));
		
		//empBrowser.transfer(500000, 1, 4);
		
		//System.out.println("completed");
		
		
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(1,"Pavitra-1",1500000));
		accounts.add(new Account(2,"Prathap-1",1100000));
		accounts.add(new Account(3,"Sunayana-1",15000000));
		accounts.add(new Account(4,"Prathigna-1",1400000));
		
		int[] results = empBrowser.batchPreparedInsert(accounts);
		System.out.println(Arrays.toString(results));
		
	}
}
