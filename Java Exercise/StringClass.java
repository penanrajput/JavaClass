import java.util.Scanner;
/*
public class StringClass
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, type in your first name: ");
        String f_name = in.next();
        System.out.println();
        System.out.print("Please, type in your last name: ");
        String l_name = in.next();
        System.out.println();

        System.out.println("Your full name is "+f_name + " "+l_name);
        System.out.println();
        System.out.println("Your first nam has " + f_name.length()+ " characters");
        System.out.println("Your last nam has " + l_name.length()+ " characters");
    }
    
}
*/

/*
public class StringClass
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, type in your first name: ");
        String first_name = in.next();
        System.out.println();
        System.out.print("Please, type in your last name: ");
        String last_name = in.next();
        System.out.println();

        System.out.println("Your full name is "+first_name + " "+last_name);
        System.out.println();
        System.out.println("Your first nam has " + first_name.length()+ " characters");
        System.out.println("Your last nam has " + last_name.length()+ " characters");
        String full_name = first_name + " " + last_name ;
        StringBuffer sb = new StringBuffer(full_name);
        System.out.println("Your name in reverse order: " + sb.reverse());
    }
    
}
*/

/*
public class StringClass
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, type in your first name: ");
        String first_name = in.next();
        System.out.println();
        System.out.print("Please, type in your last name: ");
        String last_name = in.next();
        System.out.println();

        System.out.println("Your full name is "+first_name + " "+last_name);
        System.out.println();
        System.out.println("Your first nam has " + first_name.length()+ " characters");
        System.out.println("Your last nam has " + last_name.length()+ " characters");
        String full_name = first_name + " " + last_name ;
        StringBuffer sb = new StringBuffer(full_name);
        System.out.println("Your name in reverse order: " + sb.reverse());
        for(int i=0; i<full_name.length()-1; i++)
            System.out.printf( " %X", (int) full_name.charAt( i ) ) ;
    }
    
}
*/

// My logic // see next logic recommended
/*
public class StringClass
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, type in your first name: ");
        String first_name = in.next();
        System.out.println();
        System.out.print("Please, type in your last name: ");
        String last_name = in.next();
        System.out.println();

        System.out.println("Your full name is "+first_name + " "+last_name);
        System.out.println();
        System.out.println("Your first nam has " + first_name.length()+ " characters");
        System.out.println("Your last nam has " + last_name.length()+ " characters");
        String full_name = first_name + " " + last_name ;
        StringBuffer full_name_buffer = new StringBuffer(full_name);
        // System.out.println("Your name in reverse order: " + full_name_buffer.reverse());
        // for(int i=0; i<full_name.length()-1; i++)
        //     System.out.printf( " %X", (int) full_name.charAt( i ) ) ;



        // random remove
       
        int full_name_length = full_name_buffer.length();

        int counter = 0;
        while(true)
        {
                int random_character_index = (int) ( Math.random() * full_name_buffer.length() ) ;

                counter++;
             
                char removed_character = full_name_buffer.charAt( random_character_index ) ;
                full_name_buffer.deleteCharAt( random_character_index ) ;
                System.out.print( "\n " + removed_character + " was removed from " + full_name_buffer ) ;
    
                if(counter == full_name_length)
                    break;
            
        }


    }
    
}

*/

/*
public class StringClass
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, type in your first name: ");
        String first_name = in.next();
        System.out.println();
        System.out.print("Please, type in your last name: ");
        String last_name = in.next();
        System.out.println();

        System.out.println("Your full name is "+first_name + " "+last_name);
        System.out.println();
        System.out.println("Your first nam has " + first_name.length()+ " characters");
        System.out.println("Your last nam has " + last_name.length()+ " characters");
        String full_name = first_name + " " + last_name ;
        StringBuffer full_name_buffer = new StringBuffer(full_name);
        // System.out.println("Your name in reverse order: " + full_name_buffer.reverse());
        // for(int i=0; i<full_name.length()-1; i++)
        //     System.out.printf( " %X", (int) full_name.charAt( i ) ) ;




       // while loop condition changed and counter, full_name_length is deleted....
        while( full_name_buffer.length() > 0)
        {
                int random_character_index = (int) ( Math.random() * full_name_buffer.length() ) ;

                char removed_character = full_name_buffer.charAt( random_character_index ) ;
                full_name_buffer.deleteCharAt( random_character_index ) ;
                System.out.print( "\n " + removed_character + " was removed from " + full_name_buffer ) ;
              
        }
    }
}
*/

// Exercise 5 


public class StringClass
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, type in your first name: ");
        String first_name = in.next();
        System.out.println();
        System.out.print("Please, type in your last name: ");
        String last_name = in.next();
        System.out.println();

        System.out.println("Your full name is "+first_name + " "+last_name);
        System.out.println();
        System.out.println("Your first nam has " + first_name.length()+ " characters");
        System.out.println("Your last nam has " + last_name.length()+ " characters");
        String full_name = first_name + " " + last_name ;
        StringBuffer full_name_buffer = new StringBuffer(full_name);
        // System.out.println("Your name in reverse order: " + full_name_buffer.reverse());
        // for(int i=0; i<full_name.length()-1; i++)
        //     System.out.printf( " %X", (int) full_name.charAt( i ) ) ;




       // while loop condition changed and counter, full_name_length is deleted....
       StringBuffer original_fn = full_name_buffer;
       for(int i=1; i<=5; i++)
       {
            full_name_buffer = new StringBuffer(original_fn);
            StringBuffer new_name = new StringBuffer();
            while( full_name_buffer.length() > 0)
            {
                    int random_character_index = (int) ( Math.random() * full_name_buffer.length() ) ;

                    char removed_character = full_name_buffer.charAt( random_character_index ) ;
                    full_name_buffer.deleteCharAt( random_character_index ) ;
                    // System.out.print( "\n " + removed_character + " was removed from " + full_name_buffer ) ;
                    new_name.append(removed_character);
                
            }
            System.out.println(i + " -> " + new_name);
    }
    }
}
