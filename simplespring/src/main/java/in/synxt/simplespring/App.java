package in.synxt.simplespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {		
		/*
		 * SampleDao dao = new SampleDao(); dao.setUserDao(uDao);
		 * System.out.println("Hello World!"); dao.getData();
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SampleDao sampleDao = context.getBean("sampleDao",SampleDao.class);
		sampleDao.getData();
		
	}
}
