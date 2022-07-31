package in.synxt.inventorynxt.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class ContextListener implements ServletContextListener {


    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("Context Destryod"); 
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("Context Created");
    }
	
}
