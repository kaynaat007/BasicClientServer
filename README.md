# BasicClientServer
This is  Basic Client Server Program in java. Server is a  multithread server, so can  handle multiple clients on the same port.
The program consist of four files :  Server.java, Client.java, HelperServer.java, HelperClient.java.

-------------------------------------------------HOW TO RUN-------------------------------------------------------------------
1> copy these four files under any  java project in eclipse/netbeans. 
2> first run Server.java
3> then run Client.java

NOTE 1 : see console output for more information . 
NOTE 2 : each client will run in a separate thread and handled by server separately. you can run as many client as you want. 
each will be connected to server and served separately. 

OPTIONAL : you can set the port number and hostname in  Server.java' and 'Client.java' respectively. 

-------------------------------------------------DESCRIPTION-------------------------------------------------------------------------

1> Server.java
This is Main Server file.
This file has one main() class.
This file defines a port at which it listens as a global variable. you may change , whatever you wish for.
In the main class, basic SocketServer object is made , which listens on port number you specified before. 
Then an infinite while loop starts, by calling 'accept' method of SocketServer object. it returns a 'Socket' object when a client 
connects to server. 

2>HelperServer.java

Then a 'HelperClass' object is defined, which runs as a thread for each client that connects to. it takes care for input/output 
with client. 

3> Client.java 
This is Main Client file. 
In the main method, a simple 'socket' object is created, and client tries  to connect with server for 'host' and 'port' .
as soon as it connects, 

4> HelperClient.java 

as soon as client connects, i make 'helperClient' class object and pass to it the Socket object. this class is responsible for 
sending/recieving information from server. 






