package in.synxt.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MyBusiness business = context.getBean("myBusiness",MyBusiness.class);
		business.doMyBusiness();
	}
}
