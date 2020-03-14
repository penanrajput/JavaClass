import java.util.*;
class StringMethods_part2
{
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter String is    -> ");
            StringBuffer sf = new StringBuffer(in.next());
            // StringBuffer sf = new StringBuffer("01110");


            // we want to replace 01110 to 0110
            // means deleting the 1 in sequence of consecutive 3 1's

            // find the consective 3 1's
            // indexOf will return first index of String
            int ind = sf.indexOf("111");

            // // we will use next replace function to replace
            sf.replace(ind, ind+3, "11");
            System.out.println("Modified String is -> " +sf);

            // Another Solution deleteCharAt(int index);
            // sf.deleteCharAt(ind);
            // System.out.println("Modified String is -> " +sf);

            // next we can loop for next 111
      }
}
