package in.synxt.springsales.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import in.synxt.springsales.dao.ProductDao;
import in.synxt.springsales.dao.impl.ProductDaoImpl;
import in.synxt.springsales.model.Product;
import in.synxt.springsales.service.ProductService;
@Service("productService")
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao dao;
	@Autowired
	private Logger logger;
	public ProductDao getDao() {
		return dao;
	}

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	public ProductServiceImpl() {
		super();
	}

	public ProductServiceImpl(ProductDao dao) {
		super();
		this.dao = dao;
	}
	@Override
	public List<Product> getAllProducts() throws Exception {
		logger.trace("Service Started");
		List<Product> products = null;		
		try{
			products = dao.getAllProducts();
		}catch(SQLException ex) {
			logger.error("Service Layer:",ex);
			throw new Exception("Could not fetch products",ex);
		}
		logger.trace("Service Completed");
		return products;
	}

}
