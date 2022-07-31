package in.synxt.inventorynxt.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("Session Created");
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("Session Destroyed");
    }
	
}
