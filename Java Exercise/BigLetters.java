
//  BigLetters.java  (c) Kari Laitinen

//  http://www.naturalprogramming.com

//  2013-09-12  File created.
//  2013-09-12  Last modification.

/*  This program demonstrates:
      - definition and calling of a static method
      - the use of static data items that are visible to
        several methods inside a class
      - the use of arrays of strings
*/

import java.util.* ;

class BigLetters
{
   static String[] letter_A_data =
                               { "   XX     ",
                                 "  XXXX    ",
                                 " XX  XX   ",
                                 "XX    XX  ",
                                 "XXXXXXXX  ",
                                 "XX    XX  ",
                                 "XX    XX  " } ;

   static String[] letter_B_data =
                               { "XXXXXXX   ",
                                 "XX    XX  ",
                                 "XX    XX  ",
                                 "XXXXXXX   ",
                                 "XX    XX  ",
                                 "XX    XX  ",
                                 "XXXXXXX   " } ;

   static String[] letter_C_data =
                               { " XXXXXX   ",
                                 "XX    XX  ",
                                 "XX        ",
                                 "XX        ",
                                 "XX        ",
                                 "XX    XX  ",
                                 " XXXXXX   " } ;

   static String[] letter_D_data =
                                { "XXXXXXX  ",
                                  "XX    XX  ", 
                                  "XX    XX  ",
                                  "XX    XX  ",
                                  "XX    XX  ",
                                  "XX    XX  ",
                                  "XXXXXXX  " } ;

    static String[] letter_E_data = 
                                {   "XXXXXXXX  ",
                                    "XX        ",
                                    "XX        ",
                                    "XXXXXXXX  ",
                                    "XX        ",
                                    "XX        ",
                                    "XXXXXXXX  "
                                };
    static String[] letter_F_data =   
                                {
                                    "XXXXXXXX  ",
                                    "XX        ",
                                    "XX        ",
                                    "XXXXXXXX  ",
                                    "XX        ",
                                    "XX        ",
                                    "XX        "
                                };
    static String[] letter_G_data =
                                {
                                    "XXXXXXX  ",
                                    "XX       ",
                                    "XX       ",
                                    "XXXXXXXX ",
                                    "XX    XX ",
                                    "XX    XX ",
                                    "XXXXXXX  "
                                };
    static String[] letter_H_data =
                                {
                                    "XX    XX  ",
                                    "XX    XX  ",
                                    "XX    XX  ",
                                    "XXXXXXXX  ",
                                    "XX    XX  ",
                                    "XX    XX  ",
                                    "XX    XX  "
                                    };

    static String[] letter_I_data =
                                    {                               
                                    "XXXXXXXX  ",
                                    "   XX     ",
                                    "   XX     ",
                                    "   XX     " ,
                                    "   XX     ",
                                    "XXXXXXXX  "  
                                    };
        static String[] letter_J_data =
                                    {       
                                    "XXXXXXXX  ",
                                    "       XX ",
                                    "       XX ",
                                    "       XX ",
                                    "       XX ",
                                    "       XX ",
                                    "XXXXXXX   "
                                    };
 
//         static String[] letter_K_data =
// {       

// XX   XX
// XX  XX
// XX XX
// XXXX
// XX XX
// XX  XX
// XX   XX
// }

//         static String[] letter_L_data =
// {       
// XX
// XX
// XX 
// XX
// XX 
// XX  
// XXXXXXXX
// static String[] letter_M_data =
// {       

// XX      XX
// XXX    XXX
// XX  XX  XX
// XX      XX
// XX      XX
// XX      XX 
// XX      XX

static String[] letter_N_data =
{       

"XX     XX  ",
"XXX    XX  ",
"XX XX  XX  ",
"XX   X XX  ",
"XX    XXX  ",
"XX     XX  ",
"XX     XX  "
};


// static String[] letter_O_data =

// {       
// XXXXXXX
// XX     XX
// XX     XX
// XX     XX
// XX     XX
// XX     XX 	
// XXXXXXX
// }
static String[] letter_P_data =
        {      
 
                "XXXXXXXX  ",
                "XX     XX ",
                "XX     XX ",
                "XXXXXXXX  ",
                "XX        ",
                "XX        ",
                "XX        "
        };

   static String[] get_letter_data( char given_letter )
   {
        String[] letter_data = new String [10];
      switch(given_letter)
      {
          case 'A': letter_data = letter_A_data; break;
          case 'B': letter_data = letter_B_data; break;
          case 'C': letter_data = letter_C_data; break;
          case 'D': letter_data = letter_D_data; break;
          case 'E': letter_data = letter_E_data; break;
          case 'F': letter_data = letter_F_data; break;
          case 'P': letter_data = letter_P_data; break;
          case 'N': letter_data = letter_N_data; break;
          
      }
      return letter_data ;
   }

   /*
   static void print_big_letter( char given_letter )
    {
        String[] letter_data = get_letter_data( given_letter ) ;
        for ( String letter_data_line : letter_data )
        {
            System.out.print( "\n " + letter_data_line ) ;
        }
        System.out.print( "\n" ) ;
    }
    */
    static void print_big_letter( char [] given_letter )
    {
        for(int i=0; i<given_letter.length; i++)
        {
            char letter = givenletter[i]
            for(int i=0; i<given_letter.length; i++)
            {
                System.out.println(given_letter[i]);
            
            }
        }
        
    }


   public static void main( String[] not_in_use )
   {
    //   Scanner  keyboard  =  new  Scanner( System.in ) ;


    //   print_big_letter( 'P' ) ;
    //   print_big_letter( 'E' ) ;
    //   print_big_letter( 'N' ) ;
    //   print_big_letter( 'A' ) ;
    //   print_big_letter( 'N' ) ;
    print_big_letter(new char[]{'P', 'E', 'N', 'A', 'N'});
   }
}


