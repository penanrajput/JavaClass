import java.util.Scanner;

class CompileTimeErrors
{
      public static void main(String[] args)
      {
            // Arithmatic Errors
            // int a = 10, b = 5, c = 5;
            // int x = a/(b-c);
            // System.out.println("x = " + x);
            // int y = a/(b+c);
            // System.out.println("y = " + y);

            // ArrayOutOfBounds
            // int [] a = {10, 20, 30, 40, 50};
            // System.out.println(a[7]);

			// IOException

			// FileNotFoundException


			// NumberFormatException
			// int n = Integer.parseInt("123Ac");
			// System.out.println("n = " + n);

			// NullPointerException
			// String s = null;
			// System.out.println("Length of String -> " + s.length());

			// InputMisMatchException
			// Scanner in = new Scanner(System.in);
			// int n = in.nextInt(); // give input other than integers
			// System.out.println("n = " + n);

			// OutOfMemoryException
			// int a[] = new int[1000000000]; // 10 crore size of array = 40 crore bytes
			// System.out.println("Memeory allocated");

			//


      }
}
