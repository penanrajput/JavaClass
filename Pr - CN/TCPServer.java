import java.lang.*;
import java.io.*;
import java.net.*;

class TCPServer {
   public static void main(String args[]) {
      String data = "Connection established Sucessfully";
      try {
         ServerSocket srvr = new ServerSocket(8000);
System.out.println("Server waiting for client on port :- "	+srvr.getLocalPort());

Socket skt = srvr.accept();

System.out.println("Connected to client with  IP Address: "+skt.getInetAddress());
System.out.println("Port No:"+skt.getLocalPort());

System.out.println("Server connected with client!");
PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
out.println(data);

BufferedReader in = new BufferedReader
(new InputStreamReader(skt.getInputStream()));
System.out.println("Received Message :- ");
System.out.println(in.readLine());


out.close();
in.close();
skt.close();
	
   	      }

      catch(IOException e)
{
	System.out.println(e);
	System.exit(1);

}
   }
}