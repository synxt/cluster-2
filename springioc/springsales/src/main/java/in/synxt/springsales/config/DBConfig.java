package in.synxt.springsales.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.synxt.springsales.aspects.Loggable;

@Configuration
public class DBConfig {
	@Bean("dataSource")
	@Loggable
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		dataSource.setUsername("system");
		dataSource.setPassword("admin");
		dataSource.setMinIdle(2);
		dataSource.setMaxActive(10);
		dataSource.setInitialSize(5);
		return dataSource;
	}
	@Bean
	public Logger logger() {
		return LogManager.getLogger("in.synxt.springsales");
	} 
}
