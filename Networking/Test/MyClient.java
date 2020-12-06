import java.io.*;
import java.net.*;
import java.util.*;
class MyClient
{
	public static void main(String[] args)
	{
		try
		{
			Socket s=new Socket("localhost",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());

			Scanner in = new Scanner(System.in);
			System.out.print("Enter  first number : ");
			String str1 = in.nextLine();
			in.flush();
			System.out.print("Enter second number : ");
			String str2 = in.nextLine();
			dout.writeUTF(str1);
			dout.writeUTF(str2);

			dout.flush();
			dout.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}