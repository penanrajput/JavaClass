import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
		Scanner in = new Scanner(System.in);
		String str="";
		String longString = "";
		int longStringLength = -9999;

	    int testcases = in.nextInt();

	    while(testcases-- != 0)
	    {
			int n = in.nextInt();
			while(n-- != 0)
			{
				str = in.next();
				// in.nextLine();

				if(longStringLength < str.length())
				{
					longString = str;
					longStringLength = str.length();
				}

			}
			System.out.println(longString);
			longString = "";
			longStringLength = -9999;
		}

	 }
}