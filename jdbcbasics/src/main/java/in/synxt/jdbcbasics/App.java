package in.synxt.jdbcbasics;

import java.sql.SQLException;

public class App {
	public static void main(String[] args) throws SQLException {
		EmployeeBrowser empBrowser = new EmployeeBrowser();
		empBrowser.printAllEmployees();
	}
}
