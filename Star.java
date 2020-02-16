import java.util.Scanner;

// Star Pattern 1
/*
5
*
* *
* * *
* * * *
* * * * *
*/
/*
import java.util.Scanner;
class Star
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/

// Star Pattern 2
/*
5
* * * * *
* * * *
* * *
* * 
*
*/

/*
import java.util.Scanner;
class Star
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/



// Star Pattern 3
/*
5
     *
    * *
   * * *
  * * * *
 * * * * *
*/

/*
import java.util.Scanner;
class Star
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=n-i; j>=0; j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

*/
// Star Pattern 4
/*
5
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
*/

/*
import java.util.Scanner;
class Star
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=n-i; j>=0; j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--)
        {
            for(int j=n-i; j>=0; j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/




class Star
{
    public static void main(String [] args)
    {

// ---------------------------------------------------------
// pattern
//     A
//    A B
//   A B C
//  A B C D
// A B C D E

    //     Scanner in = new Scanner(System.in);
    //     int n=in.nextInt();
    //    for(int i=1; i<=n; i++)
    //    {
    //        for(int j=n-i; j>=1; j--)
    //        {
    //             System.out.print(" ");
    //        }
    //        for(int j=1; j<=i; j++)
    //        {
    //            char ch = (char)(64+j);
    //            System.out.print(ch + " ");
    //        }
    //        System.out.println();
    //    }
// -----------------------------------------------------------
// pattern
// A A A A A
// B B B B B 
// C C C C C
// D D D D D
// E E E E E

    //     Scanner in = new Scanner(System.in);
    //     int n=in.nextInt();
    //    for(int i=n; i>=1; i--)
    //    {
          
    //        for(int j=1; j<=n; j++)
    //        {
    //            char ch = (char)(64+j);
    //            System.out.print(ch + " ");
    //        }
    //        System.out.println();
    //    }

    // --------------------------------------------------------------
    // pattern
    // A 
    // B A
    // C B A
    // D C B A
    // E D C B A
    // Scanner in = new Scanner(System.in);
    //     int n=in.nextInt();
    //    for(int i=1; i<=n; i++)
    //    {
          
    //        for(int j=i; j>=1; j--)
    //        {
    //            char ch = (char)(64+j);
    //            System.out.print(ch + " ");
    //        }
    //        System.out.println();
    //    }

    // ---------------------------------------------------------------------
    // pattern
    // E D C B A
    // D C B A
    // C B A
    // B A
    // A
    // Scanner in = new Scanner(System.in);
    //     int n=in.nextInt();
    //    for(int i=n; i>=1; i--)
    //    {
          
    //        for(int j=i; j>=1; j--)
    //        {
    //            char ch = (char)(64+j);
    //            System.out.print(ch + " ");
    //        }
    //        System.out.println();
    //    }


    // -----------------------------------------
// Pattern
// 1
// 123
// 12345
// 1234567
// 123456789
// Scanner in = new Scanner(System.in);
// int n = in.nextInt();
// for(int i=1; i<=n; i++)
// {
//     for(int j=1; j<=2*i-1; j++ )
//     {
//         System.out.print( j + " ");
//     }
//     System.out.println();
// }
// in.close();

// ----------------------------------------
// 1
// 212
// 32123
// 4321234
// 53212345

Scanner in = new Scanner(System.in);
int n = in.nextInt();
for(int i=1; i<=n; i++)
{
    int space = n-i;
    for(int k=2*space; k>=1; k--)
    {
        System.out.print(" ");
    }
    for(int j=i; Math.abs(j)<=i; j--)
    {
        System.out.print( Math.abs(j) + " ");
    }
    System.out.println();
}
in.close();
        


    }
}