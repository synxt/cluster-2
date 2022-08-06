package in.synxt.springsales.service;

import java.util.List;

import in.synxt.springsales.model.Product;

public interface ProductService {
	public List<Product> getAllProducts() throws Exception;
}
