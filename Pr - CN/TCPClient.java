import java.lang.*;
import java.io.*;
import java.net.*;

class TCPClient 
{
   
public static void main(String args[]) 
{

try 
{
Socket skt = new Socket("localhost", 8000);

BufferedReader in = new BufferedReader
(new InputStreamReader(skt.getInputStream()));

System.out.println("Connected to server with  IP Address: "+skt.getInetAddress());
System.out.println("Port No:"+skt.getPort());


System.out.println("Received Message :- ");
System.out.print(in.readLine());

System.out.println("\nClient Message to be sent: - ");


BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
PrintWriter output= new PrintWriter(skt.getOutputStream(),true);
output.println(input.readLine());
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