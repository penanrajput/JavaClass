import java.net.*;
import java.io.*;

class Test
{
	public static void main(String [] args) throws UnknownHostException, IOException
	{
		/*
		// InetAddress
		// InetAddress address = InetAddress.getLocalHost();
		// System.out.println(address);

		InetAddress address = InetAddress.getByName("www.google.com");
		InetAddress temp1   = InetAddress.getByName("172.217.166.36");
		InetAddress temp2   = InetAddress.getByName("www.google.com");
		System.out.println("Host(IP/Address) : " + address);
		System.out.println("equals(temp1) : " + address.equals(temp1));
		System.out.println("equals(temp2) : " + address.equals(temp2));
		System.out.println("   HostName : " + address.getHostName());
		System.out.println("HostAddress : " + address.getHostAddress());
		System.out.println("isMulticast Address : " + address.isMulticastAddress());
		*/

		/*
		// Socket
		Socket s = new Socket("whois.internic.net", 43);
		// System.out.println(s);

		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();

		// out.write("My name is Penan".getBytes());
		out.write("OraclePressBooks.com".getBytes());

		int c = in.read();
		while( c!= -1)
		{
			System.out.println((char)c);
			c = in.read();
		}
		*/

		// URL
		URL hp = new URL("https://www.google.co.in/careers--");
		System.out.println("URL : " + hp);
		System.out.println("Protocol : " + hp.getProtocol());
		System.out.println("Host : " + hp.getHost());
		System.out.println("File : " + hp.getFile());
		System.out.println("Ext : " + hp.toExternalForm());

	}
}