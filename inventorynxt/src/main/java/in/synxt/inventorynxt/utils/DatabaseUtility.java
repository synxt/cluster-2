package in.synxt.inventorynxt.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtility {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		//Class.forName("org.postgresql.Driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cluster2", "postgres", "Open123$");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "admin");
		
		return conn;
	}
}
