package in.synxt.inventorynxt.dao;

import java.sql.SQLException;

import in.synxt.inventorynxt.model.ProductModel;

public interface ProductDao {
	int registerProduct(ProductModel model) throws SQLException ; 
}
