package in.synxt.springsales.dao;

import java.sql.SQLException;
import java.util.List;

import in.synxt.springsales.model.Product;

public interface ProductDao {
	public List<Product> getAllProducts() throws SQLException; 
}
