import java.util.*;

class Arrays1
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
// Declaration and Initialisation
// 3 ways
// declaration
        int [] arr = new int[3];
        for(int i=0; i<arr.length; i++)
        {
                arr[i] = in.nextInt();
        }
        


        //--------------------------------------------------------------
// Basic functionalities
        //take n input and find sum and average of elements
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int  [] arr = new int[n];

        // for(int i=0; i<n; i++)5                                                       
        // {
        //     arr[i] = in.nextInt();
        // }
        // int sum = 0;
        // for(int i=0; i<n; i++)
        // {
        //     sum += arr[i];
        // }
        // System.out.println("the sum -> " + sum + " and average is " + (double)sum/n); // this double is main in this program

        //-------------------------------------------------------------------
        // read and count how many of them are positive and negative
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int  [] arr = new int[n];

        // for(int i=0; i<n; i++)                                                    
        // {
        //     arr[i] = in.nextInt();
        // }
        // int positives = 0;

        // for(int v : arr)
        // {      
        //         if(v >= 0 )
        //         {
        //                 ++ positives;
        //         }
        // } 
        // System.out.println("Posives numbers => " + positives  + " and negatives are "+(n-positives));

        //----------------------------------------------------------------------
        // Question1 
        // Array initialisation b
        // int [] arr;
        // arr = new int[]{10, 20, 30, 40, 50};
        // for(int v : arr)
        // {
        //         System.out.println(v);
        // }

        //String methods 
        // 
        
// System.out.println();
// for(String v: str)
// {
//   System.out.println("the length of string "+ v + " is "+ v.length());
// }
//     }
// }

        // --------------------------------------------------------
// Methods
// Sorting
        // int [] a = {60, 630, 10 ,30 ,4};
        // Arrays.sort(a);
        // for(int v : a)
        // {
        //     System.out.println(v);
        // }
// Sorting 2 within range 
        // int [] a = {60, 63, 10 ,30 ,40, 10, 96};
        // Arrays.sort(a, 3, 6); // 3 , 4, 5
        // for(int v : a)
        // {
        //     System.out.print (v + "  ");
        // }                                                                    
// Searching // returns index  or negative              
        // int [] a = {60, 630, 10 ,30 ,4};
        // System.out.println(Arrays.binarySearch(a, 10)); // returns index       
        // System.out.println(Arrays.binarySearch(a, 15)); // returns index        
        
// fill methods 
        // int [] a = new int [5];
        // Arrays.fill(a, 50); // filling the strings with specified value
        // for (int v: a)
        // {
        //         System.out.print(v + " ");
        // }
// equals
        // int a [] = {10, 20, 30};
        // int b [] = {10, 20 ,30};
        // System.out.println(Arrays.equals(a, b));

        // int a [] = {10, 20, 30};
        // int b [] = {10, 20}; 
        // System.out.println(Arrays.equals(a, b));
// --------------------------------------------------------
        // int [] arr  = new int [5];
        // for(int v : arr)
        // {
        //     System.out.println(v);
        // }
        
        // double [] arr  = new  double [5];
        // for(double v : arr)
        // {
        //     System.out.println(v);
        // }
        
        // char [] arr  = new  char [5];
        // for(char v : arr)
        // {
        //     System.out.println(v);
        // }

        // String [] arr = new String[5];
        // for(String v : arr)
        // {
        //     System.out.println(v);
        // }

        // Assignment Take five inputs and print each string in reverse order
        // Scanner in = new Scanner(System.in);

        // String [] str = new String[3];
        // for(int i=0; i<str.length; i++)
        // {
        //     str[i] = in.nextLine();
        // }
        // System.out.println("\nStrings in reverse order : ");
        // for(String v: str){
        //     for(int i=v.length()-1; i>=0; i--)
        //     {
        //         System.out.print(v.charAt(i));
        //     }
        //     System.out.println();
        // }

// --------------------------------------------------------
        // Assignment : Take five strings inputs and found out whether info Strings in provided
        // Scanner in = new Scanner(System.in);
        // String [] str = new String[3];

        // for(int i=0; i<str.length; i++)
        // {
        //     str[i] = in.nextLine();
        // }

        // boolean count = false; // by default is false
        // // System.out.println("\nStrings in reverse order : ");
        // for(String v: str){
        //     if(v.equals("info"))
        //     {
        //         count = true;
        //         break;
        //     }
            
        // }
        // if (count == true)
        // {
        //     System.out.println("Found");
        // }
        // else{
        //     System.out.println("Not Found");
        // }

// --------------------------------------------------------
        // assignment : to read five strings and count total number of vowels from all Strings
        // Scanner in = new Scanner(System.in);
        // String [] str = new String[3];

        // for(int i=0; i<str.length; i++)
        // {
        //     str[i] = in.nextLine();
        // }
        // int count = 0;
        // for(String v: str)
        // {
        //     for(int i=0; i<v.length(); i++)
        //     {
        //         if(v.charAt(i) == 'a' || v.charAt(i) == 'i' || v.charAt(i) == 'e' || v.charAt(i) == 'o' || v.charAt(i) == 'u')
        //         {
        //             ++count;
        //         }
        //     }
        // }
        // System.out.println("Total number of vowels are : " + count );
// --------------------------------------------------------
        // find each lines vowels and total number of vowels
        // Scanner in = new Scanner(System.in);
        // String [] str = new String[3];

        // for(int i=0; i<str.length; i++)
        // {
        //     str[i] = in.nextLine();
        // }
        // int total_count = 0;
        // System.out.println();
        // for(String v: str)
        // {
        //     int in_count = 0;
        //     for(int i=0; i<v.length(); i++)
        //     {
        //         if(v.charAt(i) == 'a' || v.charAt(i) == 'i' || v.charAt(i) == 'e' || v.charAt(i) == 'o' || v.charAt(i) == 'u')
        //         {
        //             ++in_count;
        //         }
                
        //     }
        //     total_count += in_count;
        //         System.out.println("vowels in string " + v+ " = " + in_count );
        // }
        // System.out.println("\nTotal number of vowels are : " + total_count );
// --------------------------------------------------------
// find out whether string starts with a or A or not
//         Scanner in = new Scanner(System.in);
//         String [] str = new String[3];

//         for(int i=0; i<str.length; i++)
//         {
//             str[i] = in.nextLine();
//         }
        
//         System.out.println();
//         for(String v: str)
//         {
//            if (v.charAt(0) == 'a' || v.charAt(0) == 'A')
//                 System.out.println("the string " + v + " starts with a or A");
//             else
//             System.out.println("the string " + v + " starts doesn't with a or A");
//         }
//     }
// }
// -----------------------------------------------------
// find out whether string starts with a or A or not
//         Scanner in = new Scanner(System.in);
//         String [] str = new String[3];

//         for(int i=0; i<str.length; i++)
//         {
//             str[i] = in.nextLine();
//         }
        
//         System.out.println();
//         for(String v: str)
//         {
//            if (v.charAt(0) == 'a' || v.charAt(0) == 'A')
//                 System.out.println("the string " + v + " starts with a or A");
//             else
//             System.out.println("the string " + v + " starts doesn't with a or A");
//         }
//     }
// }
// ----------------------------------------------------------
// length() vs length
        // Scanner in = new Scanner(System.in);
        // String [] str = new String[3];

        // for(int i=0; i<str.length; i++)
        // {
        //     str[i] = in.nextLine();
        // }
        
        // System.out.println();
        // for(String v: str)
        // {
        //   System.out.println("the length of string "+ v + " is "+ v.length());
        // }
        

}
// 