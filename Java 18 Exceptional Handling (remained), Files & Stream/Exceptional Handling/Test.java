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

// Now Creating Exception
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
