import java.util.Scanner;
import java.util.*;

class RuntimeExceptions
{
	public static void main(String [] args)
	{
		boolean done = false;
		int c  = 0;
		while(!done)
		{
			Scanner in = new Scanner(System.in);
			try
			{
					System.out.print("Enter Your age: ");
					int age = in.nextInt();
					done = true;
					System.out.println("Next Year You will be : " + (age+1));
					System.out.println("Thanks");

			}
			catch(InputMismatchException e)
			{
				++c;
				if( c== 3)
				{
					System.out.println("Go To Hell");
					done = true;
				}
				else
					System.out.println("please enter valid number");
			}
		}


	}
}