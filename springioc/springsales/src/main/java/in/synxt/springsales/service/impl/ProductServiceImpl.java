package in.synxt.springsales.service.impl;

import java.sql.SQLException;
import java.util.List;

import in.synxt.springsales.dao.ProductDao;
import in.synxt.springsales.dao.impl.ProductDaoImpl;
import in.synxt.springsales.model.Product;
import in.synxt.springsales.service.ProductService;

public class ProductServiceImpl implements ProductService{
	private ProductDao dao = new ProductDaoImpl(); 
	@Override
	public List<Product> getAllProducts() throws Exception {
		List<Product> products = null;
		try{
			products = dao.getAllProducts();
		}catch(SQLException ex) {
			throw new Exception("Could not fetch products",ex);
		}
		return products;
	}

}
