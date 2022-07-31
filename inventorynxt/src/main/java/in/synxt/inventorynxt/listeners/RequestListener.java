package in.synxt.inventorynxt.listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener {


    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("Response Commited");
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
    	System.out.println("New Request Recieved");
    }
	
}
