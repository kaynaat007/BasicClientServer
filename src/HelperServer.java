

import java.util.*;
import java.util.concurrent.*;
import java.io.PrintWriter;
import java.net.*;


public class HelperServer extends Thread  { 
	
	Socket sock ;
	PrintWriter out ;
	Scanner in ;
	HelperServer ( Socket s ) {
		
		sock = s ;
			
	}
	
	
	public void run () {
		
		// do input / output here. 
		
		System.out.println("client connected");
		try {
			
		
	    in = new Scanner ( sock.getInputStream() )  ;
		if ( in.hasNext() ) {
			
			System.out.println("request recieved from client" );
			System.out.println ( in.nextLine() + "client has been connected to me") ;
				
		}
			 
			
		}
		catch ( Exception e ) {
			
			
			
		}
		
					
	} // run 

}
