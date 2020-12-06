import java.io.*;
import java.net.*;
class MyServer
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Server Started");
			ServerSocket ss=new ServerSocket(6666);
			System.out.println("Waiting for Client");
			Socket s=ss.accept();//establishes connection
			System.out.println("Connection Established to Server\n\t  IP : "+s.getInetAddress()+"\n\tPort : "+s.getPort());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String  str1=(String)dis.readUTF();
			System.out.println(" First Number : " + str1);
			dis.flush();
			String 	str2=(String)dis.readUTF();
			System.out.println("Second Number : " + str2);
			int n1 = Integer.parseInt(str1);
			int n2 = Integer.parseInt(str2);
			System.out.println("Addition of " + n1 + " and " + n2 + " = " + (n1+n2));
			ss.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}