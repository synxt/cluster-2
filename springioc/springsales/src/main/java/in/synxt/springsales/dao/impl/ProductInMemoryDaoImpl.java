package in.synxt.springsales.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import in.synxt.springsales.aspects.Loggable;
import in.synxt.springsales.dao.ProductDao;
import in.synxt.springsales.model.Product;
@Repository("inMemoryDao")
@Profile("test")
public class ProductInMemoryDaoImpl implements ProductDao{
	@Autowired
	private Logger logger;
	@Override
	@Loggable
	public List<Product> getAllProducts() throws SQLException {
		List<Product> productDao = new ArrayList<>();
		productDao.add(new Product(1, "MIC", "Electronics", 1500, 2));
		productDao.add(new Product(2, "Design Large Data Apps", "Book", 3000, 1));
		productDao.add(new Product(3, "Water Bottle", "Essentials", 20, 2));
		return productDao;
	}

}
