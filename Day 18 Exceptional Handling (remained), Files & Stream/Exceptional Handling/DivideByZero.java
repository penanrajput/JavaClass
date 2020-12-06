import java.util.Scanner;

// Problem 1 : DivideByZero : ArithmaticError
// This program show run time error when n2 is zero 
class DivideByZero
{
      public static void main(String[] args)
      {
            Scanner in = new Scanner(System.in);
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            System.out.println("Divide " + n1 + " / " + n2 + " = " + n1/n2);
            System.out.println("End line executed");

      }
}

// using try-catch block
// // exception is solved
// class DivideByZero
// {
//       public static void main(String[] args)
//       {
//             Scanner in = new Scanner(System.in);
//             int n1 = in.nextInt();
//             int n2 = in.nextInt();
//             try
//             {
//                   System.out.println("Divide " + n1 + " / " + n2 + " = " + n1/n2);
//             }
//             catch(Exception e)
//             {
//                   System.out.println("Divide by zero Exception occured. Please fix it");
//             }
//
//             System.out.println("End line executed");
//       }
// }


// Problem 2: s.length()

// class DivideByZero
// {
//       public static void main(String[] args)
//       {
//             // Scanner in = new Scanner(System.in);
//             String s = null;
//             // int n2 = in.nextInt();
//             try
//             {
//                   System.out.println("Length of String is : -> " + s.length());
//             }
//             catch(Exception e)
//             {
//                   System.out.println("Occured when string is not defined");
//             }
//
//             System.out.println("End line executed");
//       }
// }

// Problem 3: NumberFormatException
// class DivideByZero
// {
//       public static void main(String[] args)
//       {
//             Scanner in = new Scanner(System.in);
//             System.out.print("Enter the number: ");
//             String s = in.next();
//             int n;
//             try
//             {
//                   // when you try to non-numerical string the exception occurs
//                   n = Integer.parseInt(s);
//                   System.out.println("The number you entered is : " + n);
//             }
//             catch(Exception e)
//             {
//                   System.out.println("Input string in not numerical. Please enter numerical String");
//             }
//
//             System.out.println("End line executed");
//       }
// }

// Problem 4 : ArrayIndexOutOfBoundsException
// class DivideByZero
// {
//       public static void main(String[] args)
//       {
//             Scanner in = new Scanner(System.in);
//             System.out.print("Enter the String: ");
//             String s = in.next();
//             int n;
//             try
//             {
//                   int index_string = s.length();
//                   System.out.println("\nString you entered -> " + s);
//                   System.out.println("Length of String   -> " + s.length());
//                   System.out.println("Accessing s[" +s.length() + "] = ");
//                   System.out.println(s.charAt(s.length()));
//             }
//             catch(Exception e)
//             {
//                   System.out.println("\t\tTried to access ArrayIndexOutOfBounds");
//             }
//
//             System.out.println("End line executed");
//       }
// }


// some experiments
// class DivideByZero
// {
//       public static void main(String[] args) throws ArithmeticException  {

//             int x = 0;
//             int y = 10;
//             int z = y/x;
//             System.out.println(z);
//             throw new ArithmeticException("Arithmatic Exception is Handles");

//       }
// }
