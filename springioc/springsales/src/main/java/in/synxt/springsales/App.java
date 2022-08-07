package in.synxt.springsales;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.synxt.springsales.model.Product;
import in.synxt.springsales.service.ProductService;

public class App {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ProductService productService = context.getBean("productService",ProductService.class);
		System.out.println(productService);
		List<Product> products = productService.getAllProducts();
		System.out.println("Please choose a product");
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		for(Product  product: products) {
			System.out.printf("%d)%s (%.2f)%n",product.getId(),product.getName(),product.getPrice());
		}
		System.out.println("END");
	}
}
