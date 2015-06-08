
import java.net.*;
import java.util.concurrent.*;
import java.util.*;


public class Server {
	
	static final int port = 12351;


	public static void main ( String [] args ) {
		
		try {
		
		ServerSocket server = new ServerSocket ( port ) ;
		System.out.println ( "server listning on ..." + port ) ;
				
		while ( true) {
			
			
			Socket sock =  server.accept();
			
			HelperServer obj = new HelperServer(sock );
			obj.start();
								
		} // while 
		
		
		
	} // try 
		catch ( Exception e ) {
			
			
			System.out.println ( "error connecting server " );
						
		}
		

			
	}
	
	
	
	
	

}
