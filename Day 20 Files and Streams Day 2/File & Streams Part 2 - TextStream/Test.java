// TextStream


import java.io.*;



/*
Sample.txt
ABCD
*/
/*

class Test
{
      public static void main(String[] args) throws IOException  {
            FileReader fin = new FileReader("Sample.txt");
            int ch = fin.read(); // 65
            System.out.println(ch); // 65
            System.out.println((char)ch); //'A'
      }
}


*/

/*

class Test
{
      public static void main(String[] args) throws IOException  {
            FileWriter fout = new FileWriter("Sample2.txt"); // to create file if not found / if file found then start from intial condition
             // FileWriter fout = new FileWriter("Sample2.txt", true); // to append

            fout.write('A'); // 'A'
            fout.write("BCDERF"); // BCDERF
            fout.close();
      }
}
*/

/*
// BufferedReader
class Test
{
      public static void main(String[] args) throws IOException  {
            BufferedReader fin = new BufferedReader(new FileReader("Sample2.txt"));
            // to create file if not found // if file found then start from intial condition
             // FileWriter fout = new FileWriter("Sample2.txt", true); // to append

             // Single line print
             // String str = fin.readLine();
             // System.out.println(str);
             // str = fin.readLine();
             // System.out.println(str);

             // All lines in file should print
             String str = fin.readLine();
             int n=0;
             while(str != null)
             {
                   ++n;
                    System.out.println(n + ": " + str);
                    str = fin.readLine();
             }


      }
}
*/

/*
//
class Test
{
      public static void main(String[] args) throws IOException  {
            BufferedReader fin = new BufferedReader(new FileReader("Sample2.txt"));
            // to create file if not found // if file found then start from intial condition
             // FileWriter fout = new FileWriter("Sample2.txt", true); // to append

             // Single line print
             // String str = fin.readLine();
             // System.out.println(str);
             // str = fin.readLine();
             // System.out.println(str);

             // All lines in file should print
             String str = fin.readLine();
             int n=0;
             while(str != null)
             {
                   ++n;
                    System.out.println(n + ": " + str);
                    str = fin.readLine();
             }


      }
}
*/

/*

class Test
{
      public static void main(String[] args) throws IOException  {
            BufferedWriter fout = new BufferedWriter(new FileWriter("Sample2.txt"));
            // to create file if not found // if file found then start from intial condition
             // FileWriter fout = new FileWriter("Sample2.txt", true); // to append

             // Single line print
             // String str = fin.readLine();
             // System.out.println(str);
             // str = fin.readLine();
             // System.out.println(str);

             // All lines in file should print
             fout.write("Siddhes is my BestFriend.......");
             fout.close();
      }
}
*/

/*
// using readLine of BufferedReader
import java.util.*;
class Test
{
      public static void main(String[] args) throws IOException  {
            BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
            System.out.print("Enter two numbers: ");
            String str1 = in.readLine();
            String str2 = in.readLine();

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            System.out.println("Addition of " + num1 + " and " + num2 + " = " + (num1+num2));


      }
}

*/


/*
// using read() of BufferedReader
// not possible by this method
import java.util.*;
class Test
{
      public static void main(String[] args) throws IOException  {
            BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
            System.out.print("Enter two numbers in single line: ");
            int num1 = in.read();
            // int num2 = in.read();

            int num1 = Integer.parseInt((char)num1);
            // int num2 = Integer.parseInt((char)(str2));

            System.out.println((char)num1);
            // System.out.println(num2);

            System.out.println(num1);
            // System.out.println("Addition of " + num1 + " and " + num2 + " = " + (num1+num2));


      }
}


*/

/*
// Input 45 65
// output 110
import java.util.*;
class Test
{
      public static void main(String[] args) throws IOException  {
            BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
            System.out.print("Enter two numbers in single line: ");
            String str = in.readLine();
            String [] num_arr = str.split(" ");
            // System.out.println(num_arr[0]);

            int num1 = Integer.parseInt(num_arr[0]);
            int num2 = Integer.parseInt(num_arr[1]);

            System.out.println("Addition of " + num1 + " and " + num2 + " = " + (num1+num2));

      }
}

*/

// this is how we print to screen
/*
class System
{
      public static final  PrintStream out = in new PrintStream();
      // other methods
}
class PrintStream
{
    public void println ...
}

main()
{
      System.out.printnln(123456);
}
*/

/*
class Test
{
      public static void main(String[] args) throws FileNotFoundException {
            int x = 12345;
            PrintWriter fout = new PrintWriter("Values.txt");
            // fout.println(x);
            fout.println(12345);
            fout.println(46678.15451);
            fout.println('A');
            fout.println("PQR_ZTC");
            fout.println(2645451512154141L);
            fout.println(true);
            fout.close();
      }
}

*/

/*
class Test
{
      public static void main(String[] args) {
            OutputStream os = new OutputStream(System.out);
            os.write(123);
      }
}
*/

/*
// why flush is important
// https://www.geeksforgeeks.org/printwriter-flush-method-in-java-with-examples/
class Test
{
      public static void main(String[] args) throws FileNotFoundException {
            int x = 12345;
            PrintWriter fout = new PrintWriter(System.out); // no automatic flushing
            // fout.println(x);
            fout.println(12345);
            fout.println(46678.15451);
            fout.println('A');
            fout.println("PQR_ZTC");
            fout.println(2645451512154141L);
            fout.println(true);


            // Without automatic flushing, the following fragment needs an explicit call to fl ush() or
            // close() (line 5). Otherwise, no output is produced at all.

            fout.println("Blue is a violet; red is a rose");
            fout.println("If it's not automatic");
            fout.println("Call flush () or call close ()");
            fout.flush();
      }
}
*/

class Test
{
      public static void main(String[] args) {
            PrintWriter fout = new PrintWriter(System.out);
             // Most Important
            fout.write(65); // 'A'
            fout.flush();
      }
}
