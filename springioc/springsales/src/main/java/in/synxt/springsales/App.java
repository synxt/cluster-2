package in.synxt.springsales;

import java.util.List;
import java.util.Scanner;

import in.synxt.springsales.model.Product;
import in.synxt.springsales.service.ProductService;
import in.synxt.springsales.service.impl.ProductServiceImpl;

public class App {
	public static void main(String[] args) throws Exception {		
		ProductService productService = new ProductServiceImpl();
		List<Product> products = productService.getAllProducts();
		System.out.println("Please choose a prodct");
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		for(Product  product: products) {
			System.out.printf("%d)%s (%.2f)%n",product.getId(),product.getName(),product.getPrice());
		}
		System.out.println("END");
	}
}
