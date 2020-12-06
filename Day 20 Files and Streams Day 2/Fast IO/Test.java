import java.io.*;
import java.util.*;
/*
// Problem :
class Test
{
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int n = in.nextInt();
            System.out.print("Enter the String : ");
            String str = in.nextLine();
            System.out.println("n = " + n);
            System.out.println("Str = " + str);
      }
}
*/

/*
// Solution:
class Test
{
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int n = in.nextInt();
            in.nextLine();
            // in.flush(); // Scanner has no flush method
            System.out.print("Enter the String : ");
            String str = in.nextLine();
            System.out.println("n = " + n);
            System.out.println("Str = " + str);
      }
}
*/


/*
import java.io.*;
import java.util.*;
class Test
{
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number date to be entered : ");
            int n = in.nextInt();
            int m = n;
            int i = 0;
            int [] arr = new int[n];
            String [] str = new String[n];
            for(i=0; i<n; i++)
            {
                  str[i] = new String();
            }
            i = 0;
            try
            {


                  while(n-- > 0)
                  {
                        System.out.println();
                        System.out.println("For index " + i + " (Age:Int, Name:String):");
                        System.out.print("\t\tEnter Age  : ");

                        arr[i] = in.nextInt();
                        System.out.print("\t\tEnter Name : ");
                        str[i] = in.nextLine();
                        // in.nextLine(); // try adding this line
                        i++;
                  }
            }
            catch(InputMismatchException e)
            {
                  System.out.println("Go to Hell");
                  System.exit(0);
            }
            System.out.println("Done!");
            for(i = 0; i< m ; i++)
            {

                  System.out.println("for index " + i + " : " + arr[i] + " and name " + str[i]);
            }


      }
}


*/

// Userdefined FastReader Class
// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args)
    {
          FastReader in = new FastReader();
          System.out.print("Enter n : ");
          int n = in.nextInt();
          System.out.println("n : " + n);
    }
}
