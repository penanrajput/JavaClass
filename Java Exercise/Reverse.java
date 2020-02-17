import java.util.*;
/*
public class Reverse
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = in.nextInt(); 
        int [] arr = new int[n];
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        
        System.out.println("\nReverse order is : ");
        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
*/
/*
public class Reverse
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = new int[7];
        
        int count = 0;
    do
    {
        int temp = in.nextInt();
        if(temp >= 1 && temp<=39)
        {
            arr[count] =  temp;
            ++count;
        }
    }while(count<7);
       
        
        System.out.println("\nReverse order is : ");
        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
*/

public class Reverse
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = new int[7];
        
        int count = 0;
        do
        {
            int temp = in.nextInt();
            // if(temp >= 1 && temp <= 39 && Arrays.binarySearch(arr,temp) < 0 )
            if(temp >= 1 && temp <= 39 )
            {
                // finding whether int is present in array or not
                boolean found = false;
                for(int j = 0; j<=count; j++)
                    if(arr[j] == temp)
                        found = true;
                if(found)
                {
                    System.out.println(" not included because already present\t current count = "+ count);
                    continue;
                }

                else
                    arr[count++] = temp;
            }
            else
                System.out.println(" not included, not in-bound 1 to 39\t current count = "+ count);
            
        }
    while(count<7);
       
        
        System.out.println("\nReverse order is : ");
        for(int i=arr.length-1; i>=0; i--)
            System.out.print(arr[i] + " ");
        
    }
}