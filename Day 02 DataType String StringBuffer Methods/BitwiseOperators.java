import java.util.*;

class BitwiseOperators
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = in.nextInt();
		// int b = in.nextInt();

		/*
		// even odd
		if ((a & 1) == 1)
			System.out.println(a + " is odd number");
		else
			System.out.println(a + " is even number");

		// System.out.println(a&1 == 1);
		*/

		System.out.println(" a >> 1 -> " + (a>>1)); // Idk logic
		System.out.println(" a << 1 -> " + (a<<1)); // Idk logic
	}
}
