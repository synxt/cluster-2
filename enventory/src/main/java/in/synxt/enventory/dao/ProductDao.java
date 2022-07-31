package in.synxt.enventory.dao;

import java.sql.SQLException;
import java.util.List;

import in.synxt.enventory.model.ProductModel;


public interface ProductDao {
	int registerProduct(ProductModel model) throws SQLException; 
	List<ProductModel> getAllProducts()  throws SQLException;
}
