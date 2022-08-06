package in.synxt.springsales.dao.utils;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class DBCP {
	private static DataSource dataSource;
	public static DataSource getDataSource() {
		if(dataSource==null) {
			BasicDataSource dataSource = new BasicDataSource();
			dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			dataSource.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
			dataSource.setUsername("system");
			dataSource.setPassword("admin");
			dataSource.setMinIdle(2);
			dataSource.setMaxActive(10);
			dataSource.setInitialSize(5);
			DBCP.dataSource = dataSource;
		}
		return DBCP.dataSource;
	} 
}
