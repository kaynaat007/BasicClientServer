import java.util.*;
import java.io.PrintWriter;
import java.net.*;
import java.util.concurrent.*;



public class Client extends Thread {
	
	static final String host = "localhost";

	
	public static void main ( String [] args ) {
		
	     	
		ExecutorService exe = Executors.newFixedThreadPool(2000);
		int i;
		//for ( i = 0; i < 2; i++) {
			
			Socket sock = null;
			try {
			 
				sock  = new Socket ( host, Server.port ) ; // try  connect to server 
			 
			}
			catch ( Exception e ) {
				
				
				
			}
	         HelperClient obj = new HelperClient( 0 , sock);   
	         obj.start();
	      //   exe.execute(obj);
	       
	         
	//	}
		
	//	exe.shutdown();
			
		
	}
	

}
