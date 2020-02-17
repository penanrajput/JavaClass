import java.util.*;

class Loops
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" This program prints conversion tables."+
        "\n Type a letter to select a conversion table"+
        "\n m miles to kilometers"+
        "\n k kilometers to miles"+
        "\n p pounds to kilograms"+
        "\n x exit the program"
        );
        char choice = in.next().charAt(0);
        if(choice == 'm')
        {
            System.out.println("\t   miles\tkilometers");
            System.out.println();

            for(int i=10; i<=110; i=i+10)
            {
                System.out.println(String.format("%15.2f%15.2f", (double)(i), (double)(i*1.609)));
            }
        }
        if(choice == 'k')
        {
            // km to miles
            System.out.println("\t   kiloemeters\tmiles");
            System.out.println();
            for(int i=10; i<=110; i=i+10)
            {
                System.out.println(String.format("%15.2f%15.2f", (double)(i), (double)(i*.621)));
            }
        }

        if(choice == 'p')
        {
             // km to miles
             System.out.println("\t   pounds\tkilometers");
             System.out.println();
             for(int i=10; i<=110; i=i+10)
             {
                 System.out.println(String.format("%15.2f%15.2f", (double)(i), (double)(i*.4536)));
             }
        }






      
     

    }
}