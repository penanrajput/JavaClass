 // File 1 Exceptionl Handling


/*
 // Mutliple Catch Statement
 class Test
 {
       public static void main(String[] args) {
             int i=10, b=5, c=5;
             int [] arr = new int[5];
             String str1 = "123abc";
             String str2 = null;
             try
             {
                   int result = i/(b-c);                                            // Stmt 1
                   // int result = 10 / 0;
                   System.out.println("arr[5] = " + arr[5]);                        // Stmt 2
                   int num = Integer.parseInt(str1);                                // Stmt 3
                   System.out.println("Length of str2 " + str2.length());           // Stmt 4
             }
             catch(ArithmeticException e)
             {
                   System.out.println(e);                                           // Stmt 5
             }
             catch(ArrayIndexOutOfBoundsException e)
             {
                   System.out.println(e);                                           // Stmt 6
             }
             catch(NumberFormatException  e)
             {
                   System.out.println(e);                                           // Stmt 7
             }
             catch(NullPointerException e)
             {
                   System.out.println(e);                                           // Stmt 8
             }
             System.out.println("Statement 9 is executed");
       }
 }
*/

// Exception Hierarchy
//
// Object
//     |_ thowable
//               |_Exception
//               |         |_InputOutputException ( Checked )
//               |         |_RunTimeException     ( Unchecked )
//               |_Error

/*
class Test
{
      public static void main(String[] args) {
            try
            {
                  int i = 10 / 0;
            }
            catch(Exception e)
            {
                  System.out.println(e);
            }
      }
}
*/

/*
// SuperClass Reference Throwable
class Test
{
      public static void main(String[] args) {
            try
            {
                  int i = 10 / 0;
            }
            catch(Throwable e)
            {
                  System.out.println(e);
            }
      }
}
*/

/*
class Test
{
      public static void main(String[] args) {
            try
            {
                  int i = 10 / 0;
            }
            catch(Object e) // Object cannot be converted to Throwable
            {
                  System.out.println(e);
            }
      }
}
*/

/*
// Variation NO 1
  // Mutliple Catch Statement When SuperClass Exception Object is present
  // Rule : First It will Find the own class reference in catch Statement
  // if not found, then it will surely go to SuperClass Reference

  class Test
  {
        public static void main(String[] args) {
              int i=10, b=5, c=5;
              int [] arr = new int[5];
              String str1 = "123abc";
              String str2 = null;
              try
              {
                    int result = i/(b-c);                                     // Stmt 1
                    // int result = 10 / 0;
                    System.out.println("arr[5] = " + arr[5]);                 // Stmt 2
                    int num = Integer.parseInt(str1);                         // Stmt 3
                    System.out.println("Length of str2 " + str2.length());    // Stmt 4
              }
              catch(ArithmeticException e)
              {
                    System.out.println(e);                                    // Stmt 5
              }
              catch(ArrayIndexOutOfBoundsException e)
              {
                    System.out.println(e);                                    // Stmt 6
              }
              catch(NumberFormatException  e)
              {
                    System.out.println(e);                                    // Stmt 7
              }
              catch(NullPointerException e)
              {
                    System.out.println(e);                                   // Stmt 8
              }
              catch(Exception e)
              {
                    System.out.println("Exception Super Class Block Executed");     // Stmt 9
              }

             System.out.println("Statement no 10 executed");                         // Stmt 10
        }
  }
*/

/*
// Finally syntax 1

class Test
{
      public static void main(String[] args) {
            int i=10, b=5, c=5;
            Scanner in = new Scanner()
            try
            {
                  int result = i/(b-c);                                     // Stmt 1
            }
            catch(ArithmeticException e)
            {
                  System.out.println(e);                                    // Stmt 5
            }
            finally
            {
                  System.out.println("Statement gonna execute whether Exception occurs or not");
            }
      }
}
*/

/*
// finally synatx part 2
class Test
{
      public static void main(String[] args) {
            int i=10, b=5, c=5;
            Scanner in = new Scanner()
            try
            {
                  int result = i/(b-c);                                     // Stmt 1
            }

            finally
            {
                  System.out.println("Statement gonna execute whether Exception occurs or not");
            }
      }
}

*/

/*
// Variation No 2
import java.util.*;
class Test
{
      public static void main(String[] args) {
            int i=10, b=5, c=5;
            Scanner in = new Scanner(System.in);
            try
            {
                  int result = i/(b-c);      // Stmt 1
                  System.out.println("Inside try block ");
            }
            catch(ArrayIndexOutOfBoundsException a)
            {
                  System.out.println("ArrayIndexOutOfBoundsException is not");
            }
            catch(Exception e)
            {
                  System.out.println("Exception Common to all");                          // Start 2
            }
            finally
            {
                  System.out.println("Statement gonna execute whether Exception occurs or not");
            }
      }
}
*/

/*
// Variation
import java.util.*;
class Test
{
      public static void main(String[] args) {
            int i=10, b=5, c=5;
            Scanner in = new Scanner(System.in);
            try
            {
                  int result = i/(b-c);      // Stmt 1
                  System.out.println("Inside try block ");
            }
            catch(ArrayIndexOutOfBoundsException a)
            {
                  System.out.println("ArrayIndexOutOfBoundsException is not");
            }
            catch(Exception e)
            {
                  System.out.println("Exception Common to all");                          // Start 2
            }
            finally
            {
                  System.out.println("Statement gonna execute whether Exception occurs or not");
            }
      }
}
*/

/*
// Variation 5
import java.io.IOException;
class Testthrows1{

void p()
  {
   try
   {
    // n();
    throw new IOException("device error");//
   }
   catch(IOException e)
   {
         System.out.println("IOException handled");
   }
  }
}

class Test
{
  public static void main(String args[])
  {
   Testthrows1 obj=new Testthrows1();
   obj.p();
   System.out.println("normal flow...");
  }
}
*/

/*
// checked exception
import java.net.*;
class Test
{
      public static void main(String[] args) throws UnknownHostException{
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println(address);
      }
}

// ***** net off ***
// run ->  unreported exception UnknownHostException ; must be caught or declared to be thrown
// ***** net on ***
// run -> Address


// But it throws exception when net is off, that needs to be caught....


*/


// Unchecked Exception : RunTimeException(AE, NFE, NOE, AOOIE, IME, SIOOBE, etc)
// Checked Excepotion : InputOutputException (FileNotFoundException, EOFExcepotion, UnknownHostException, SQLException)

// Unchecked Exception
// compile... done
// run... not done
/*
class Test
{
      public static void main(String[] args) {
            int i = 10/0;
            System.out.println(i);
      }
}
*/
/*
// Solution
class Test
{
      public static void main(String[] args) {
            try
            {
                  int i = 10/0;
            }
            catch(ArithmeticException e)
            {
                  System.out.println("Please Do not enter 0");
            }
      }
}
*/


// Checked Exception : InputOutputException (FileNotFoundException, EOFExcepotion, UnknownHostException, SQLException
// Handle : Try Catch block, throws in front of method
/*
import java.io.*;
class Test {
   public static void main(String args[])
      {
      	FileInputStream fis = null;
      	// This constructor FileInputStream(File filename)
      	//  throws FileNotFoundException which is a checked
      	//  exception

              fis = new FileInputStream("B:/myfile.txt");
      }
}
*/
// compile time :  error: unreported exception FileNotFoundException; must be caught or declared to be thrown

/*
import java.io.*;
class Test {
   public static void main(String args[]) throws FileNotFoundException
      {
      	FileInputStream fis = null;
      	// This constructor FileInputStream(File filename)
      	//  throws FileNotFoundException which is a checked
      	//  exception

              fis = new FileInputStream("B:/myfile.txt");
      }
}
// compile time : Compiled
// run time :Exception in thread "main" java.io.FileNotFoundException: B:\myfile.txt (The system cannot find the path specified)
        // at java.io.FileInputStream.open0(Native Method)
        // at java.io.FileInputStream.open(Unknown Source)
        // at java.io.FileInputStream.<init>(Unknown Source)
        // at java.io.FileInputStream.<init>(Unknown Source)
        // at Test.main(Test.java:301)

*/

/*
// use of throw keyword
class Test
{
      public static void main(String[] args) {
            try
            {
                  throw new NullPointerException("demo");
            }
            catch(NullPointerException e)
            {
                  System.out.println(e); // java.lang.NullPointerException: demo
            }0

      }
}
*/

/*
// rethrow exception
class Test
{
      public static void m()
      {
            try
            {
                  throw new NullPointerException("demo");
            }
            catch(NullPointerException e)
            {
                  System.out.println("inside m() : " + e);
                  throw e;
            }
      }
      public static void main(String[] args) {
            try
            {
                  m();
            }
            catch(NullPointerException e)
            {
                  System.out.println("Recaught   : " + e);
            }
      }
}
*/

/*
// throw problem
class Test
{
      public static void throwOne()
      {
            System.out.println("Inside throwOne : ");
            throw new IllegalAccessException("demo");
      }
      public static void main(String[] args) {0
            throwOne();
      }
}
*/

/*
// throw solution 1
class Test
{
      public static void throwOne() throws IllegalAccessException
      {
            System.out.println("Inside throwOne : ");
            throw new IllegalAccessException("demo");
      }
      public static void main(String[] args)  throws IllegalAccessException  {
            throwOne();
      }
}
*/
/*
// throw solution 2
class Test
{
      public static void throwOne() throws IllegalAccessException
      {
            System.out.println("Inside throwOne : ");
            throw new IllegalAccessException("demo");
      }
      public static void main(String[] args)  {
            try
            {
                              throwOne();
            }
            catch(IllegalAccessException e)
            {
                  System.out.println("Caught inside main() : " + e);
            }

      }
}
*/


/*
// Finally
class Test
{
      static void m1()
      {
            try
            {
                  System.out.println("Inside m1() : ");
                  throw new RuntimeException("demo");
            }
            finally
            {
                  System.out.println("Inside m1() finally");
            }
      }

      static void m2()
      {
            try
            {
                  System.out.println("Inside m2() : ");
            }
            finally
            {
                  System.out.println("Inside m2() finally");
            }
      }

      static void m3()
      {
            try
            {
                  System.out.println("Inside m3() : ");
            }
            finally
            {
                  System.out.println("Inside m3() finally");
            }
      }

      public static void main(String[] args) {
            try
            {
                  m1();
            }
            catch(RuntimeException e)
            {
                  System.out.println("Exception : " + e);
            }
            m2();
            m3();

      }
}
*/


/*
// Now Creating Exception (my own attempt)

import java.io.IOException;
// creating the PenanException own class Exception
class PenanException extends Exception
{
      String str;
      PenanException(String s)
      {
            str = s;
      }

}

// example of use of userDefined Exception PenanException
class Testthrows
{
      void p()
        {
            try
            {
                  throw new PenanException("device error");//
            }
            catch(PenanException e)
            {
                  System.out.println("PenanException handled");
            }
        }
}
class Test
{
      public static void main(String[] args) {
            Testthrows tr = new Testthrows();
            tr.p();
      }
}
*/

/*
// Creating Own Exception Subclass
class MyException extends Exception
{
      private int detail;
      MyException(int a)
      {
            detail = a;
      }
      public String toString()
      {
            return "MyException[" + detail + "] is less than Zero";
      }
}

class Test
{
      public static void compute(int a, int b) throws MyException
      {
            System.out.print("Called to compute(" + a + ", " + b + ") : ");
            if(a<0)
                  throw new MyException(a);
            else
                  System.out.println(a+b);

      }
      public static void main(String[] args) {
            try
            {
                  compute(5, 10);
                  compute(15, 20);
                  compute(-5, 20);
            }
            catch(MyException e)
            {
                  System.out.println("\nCaught : " + e);
            }

      }
}
*/


/*
// ask to user to enter age :
// if age > 18, congratulations them for winning bonus
      // keep asking the age
// else
//       throw exception, show under age
//          and exit

import java.util.*;
class IllegalAgeException extends Exception
{
      private int age;
      public IllegalAgeException(int i)
      {
            age = i;
      }
      public String toString()
      {
            return "IllegalAgeException " + age + " : " + "error: please enter the age above 18";
      }
}
class Test
{
      public static void validate(int a) throws IllegalAgeException
      {
            if(a<18)
                  throw new IllegalAgeException(a);
            else
                  System.out.println("Congratulations, you have won the bonus of $6500");
      }
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

                  try
                  {
                        while(true)
                        {
                              System.out.print("Enter the age : ");
                              int age = in.nextInt();
                              validate(age);
                        }
                  }
                  catch(IllegalAgeException e)
                  {
                        System.out.println("caught " + e);
                  }


      }
}
*/


/*
class Test
{
	static void m()
	{
			NullPointerException npe = new NullPointerException("demo");
			npe.initCause(new ArithmeticException("caught"));
			throw npe;
	}
	public static void main(String [] args)
	{
			try
			{
				m();
			}
			catch(NullPointerException e)
			{
				System.out.println("Cauight : " + e);
				System.out.println("Original cause : " + e.getCause());
			}
	}
}
*/

/*
class Test
{
	public static void main(String[] args)
	{
		try
		{
			int z = 10 / 0;
			String str = "hello";
			System.out.println("str[10] = " + str.charAt(10));

		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			// System.out.println(e.getStackTrace()); // [Ljava.lang.StackTraceElement;@15db9742]
			System.out.println(e);
			// System.out.println("hello world");
		}
	}
}
*/



/*
// getLocalizedMessage()
class Test
{
	public static void m(int k)
	{
		//try
		//{
			if(k<0)
				throw new ArithmeticException("Value " + k + " is negative. Value is positive");
			else
				System.out.println("Value is " + k);
		//}
	}

	public static void main(String [] args) throws ArithmeticException
	{
		try
		{
			m(60);
			m(-60);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getLocalizedMessage());
		}

	}
}
*/


/*
// getMessage()
class Test
{
	public static void main(String [] args)
	{
		try
		{
			int a = 10 / 0 ;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
*/

/*
class Test
{
	public static void main(String [] args)
	{
		try
		{
			int a = 10 / 0 ;
		}
		catch(ArithmeticException e)
 		{
			System.out.println(e.getStackTrace()); // [Ljava.lang.StackTraceElement;@15db9742

			StackTraceElement [] msg = e.getStackTrace();
			System.out.println("Length -> " + msg.length); // -> 1

			System.out.println(msg[0].toString()); //Test.main(Test.java:775)
			System.out.println(msg[0]); //Test.main(Test.java:775)
		}
	}
}
*/


/*
class Test
{
	public static void m(int n)
	{
			try
				{
					int a = 10 / n ;
					System.out.println(a);
				}
				catch(ArithmeticException e)
		 		{
					System.out.println(e.getStackTrace()); // [Ljava.lang.StackTraceElement;@15db9742

					StackTraceElement [] msg = e.getStackTrace();
					System.out.println("Length -> " + msg.length); // -> 1

					System.out.println(msg[0].toString()); //Test.main(Test.java:775)
					System.out.println(msg[0]); //Test.main(Test.java:775)
				}
	}
	public static void main(String [] args)
	{
		m(10);
		m(0);
	}
}
*/


