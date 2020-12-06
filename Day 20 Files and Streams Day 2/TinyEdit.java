import java.io.*;

class TinyEdit
{
	public static void main(String [] args) throws IOException
	{
		String str = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		do{
			 str = in.readLine();
			System.out.println("\t\tMessage : " + str);

		}
		while(!str.equals("quit"));
	}
}
