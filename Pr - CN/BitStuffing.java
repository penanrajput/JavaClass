// Bit sequence: 110101111101011111101011111110 (without bit stuffing)
// delimiter   : 0111110
// Bit sequence: 110101111100101111101010111110110 (with bit stuffing)

import java.util.Scanner;
class BitStuffing
{
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter input string   : ");
            StringBuffer input_string = new StringBuffer(in.next());
            System.out.print("Enter pattern string : ");
            String pattern = in.next();
            String pattern_mod = pattern.substring(1, pattern.length()-1);
            // String output = "";
            int pattern_mod_len = pattern_mod.length();

            // System.out.println("pattern_mod -> " + pattern_mod);
            int found_index = 0;
            while(found_index <input_string.length())
            {
                  found_index = input_string.indexOf(pattern_mod, found_index);
                  if(found_index == -1)
                        break;
                  // System.out.println("found at " + found_index);
                  // input_string.replace(found_index, found_index + pattern_mod.length(), pattern);

                  input_string.insert(found_index+ pattern_mod_len,"0" );
                  found_index = found_index+ pattern_mod_len;
            }
            System.out.print("Enter ouput string   : " + input_string);


      }
}
