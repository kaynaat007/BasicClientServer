
import java.io.PrintWriter;
import java.net.*;
import java.util.concurrent.*;
import java.util.*;


public class HelperClient  extends Thread { 
	
	Socket sock;
	PrintWriter out;
	Scanner in;
	int id;
	
	public HelperClient (int id, Socket s ) {
		
	    this.id  = id;	
		sock = s ; 		
	}
	
	
	public void run () {
		
		try {
			if ( sock.isConnected() ) {
				
				System.out.println ( "client number " + id + " connected and started") ;
			
			}
		    out = new PrintWriter ( sock.getOutputStream() ) ;
			out.print( "whatever"); 
			out.flush(); // dont forget this tiny little statement 
		//	 in  = new Scanner ( sock.getInputStream() ) ;
		//	String mssg =  in.nextLine() ;
		//	System.out.println( "message recieved from server :  " +  mssg  );
	    
		}	
		catch ( Exception e ) {
			
			
		}
				
	}

}
