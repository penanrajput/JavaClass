import java.util.Arrays;
public class CommandLine
{
    public static void main(String[] args) {
/*
        // add sum of two integers
    // D:\code\Java\JavaClass\Day 9>java CommandLine 50 60
    // sum is 110

    // D:\code\Java\JavaClass\Day 9>java CommandLine 50
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
    //         at CommandLine.main(CommandLine.java:5)

    // D:\code\Java\JavaClass\Day 9>java CommandLine
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
    //         at CommandLine.main(CommandLine.java:4)

    // D:\code\Java\JavaClass\Day 9>java CommandLine 50 60 70 80 90
    // sum is 110

    // D:\code\Java\JavaClass\Day 9>
       String s1 = args[0];
       String s2 = args[1];

       int n1 = Integer.parseInt(s1);         
       int n2 = Integer.parseInt(s2);

       System.out.println("sum is " + (n1 + n2));
*/

// -------------------------------------------------------------
        // sum of all command line arguments
    //     int sum = 0;
    //    for(int i=0; i<args.length; i++)
    //    {
    //         sum = sum + Integer.parseInt(args[i]);
    //    }
    //     System.out.println("sum is " + sum );
       /*
        D:\code\Java\JavaClass\Day 9>javac CommandLine.java

        D:\code\Java\JavaClass\Day 9>java CommandLine 50 60 70 80 90
        sum is 350

        D:\code\Java\JavaClass\Day 9>java CommandLine 50 60 70
        sum is 180
        */

    // ----------------------------------------------------------------------
        // Read two strings and find whether they are equal
        
        
        // if(args[0].equals(args[1]))
        //     System.out.println("Equal");
        // else
        //     System.out.println("Not Equal");
        
      // ----------------------------------------------------------------------------
      // read n strings and find out whether "info" string is provided or not
        // boolean counter = false;
        // for(String v: args)
        // {
        //     if(v.equals("info"))
        //     {
        //         counter = true;
        //         break;
        //     }
        // }
        // if(counter)
        // {
        //     System.out.println("Found");
        // }
        // else{
        //     System.out.println("Not Found");
        // }

        // -----------------------------------------------------------------------------
        // Program to read n numbers from cmd and sort them
        // int [] a = new int[args.length];
        // for(int i=0; i<args.length; i++)
        // {
        //     a[i] = Integer.parseInt(args[i]);
        // }
        // Arrays.sort(a);
        // for(int v : a)
        // {
        //     System.out.println(v);
        // }

        // ------------------------------------------------------------------------------
            

    }
}
