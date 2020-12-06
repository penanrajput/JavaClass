import java.util.*;

class StringBufferVsString
{
      public static void main(String[] args) {
            /*
            // String class object Program to concatenation of Strings
            String str = "";
            Date st_time = new Date();
            for(int i=0; i< 100000; i++)
            {
                  str = str + "Hello";
            }
            Date end_time = new Date();
            // System.out.println(str);
            System.out.println("Time consumed -> " + (end_time.getTime() - st_time.getTime())+ " ms");
            // Output  31799 ms = 32 seconds
            */

            // StringBuffer class object program to concatentaion of Strings
            // String class object Program to concatenation of Strings
            StringBuffer str = new StringBuffer();
            Date st_time = new Date();
            for(int i=0; i< 100000; i++)
            {
                  str = str.append("Hello");
            }
            Date end_time = new Date();
            // System.out.println(str);
            System.out.println("Time consumed -> " + (end_time.getTime() - st_time.getTime())+ " ms");
            // Output  101 ms = 0.1 seconds
      }
}
