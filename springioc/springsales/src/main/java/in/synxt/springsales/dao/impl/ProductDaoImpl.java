package in.synxt.springsales.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import in.synxt.springsales.aspects.Loggable;
import in.synxt.springsales.dao.ProductDao;
import in.synxt.springsales.model.Product;
@Repository("dbDao")
//@Primary
@Profile("prod")
public class ProductDaoImpl implements ProductDao{
	@Autowired
	@Qualifier("dataSource")
	private DataSource datasource;
	@Autowired
	private Logger logger;
	@Override
	@Loggable
	public List<Product> getAllProducts() throws SQLException {	
		List<Product> products = new ArrayList<>();
		try {
			Connection conn = datasource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT id,name,category,price,quantity_in_hand FROM PRODUCTS ORDER BY id");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				products.add(new Product(rs.getInt("id"),rs.getString("name"),rs.getString("category"),rs.getDouble("price"),rs.getInt("quantity_in_hand")));
			}
		}catch(SQLException ex) {
			logger.error("Dao",ex);
			throw ex;
		}
		return products;
	}
	
}
