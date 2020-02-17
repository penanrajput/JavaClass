import java.util.Scanner;

class Height
{
    static int feet;
    static int inches;
    static double centimeter;
    public static double getInCentimeters(int f, int i)
    {
        feet = f;
        inches = i;
        centimeter = 30.48 * feet + 2.54 * inches;
        return centimeter;
    }

    public static String getInFeetInches(double d)
    {
        feet = (int)(d / 30.48);
        inches = (int)(d / 2.48);
        return "" + feet + " feet "+ inches + " inches";
    }


}



class CalculationsDecisions
{
    public static void main(String[] args) {
   
        Scanner in = new Scanner(System.in);
        System.out.println(" This program makes calculations related to your height."
        + "\n Type 1 to give your height in feet and inches or"
        + "\n Type 2 to give your height in centimeters. ");

        int unit_selection = in.nextInt();
        if (unit_selection == 1)
        {
            System.out.println("Enter the feet : ");
            int feet = in.nextInt();
            System.out.println("Enter the inches : ");
            int inches = in.nextInt();

            System.out.println(feet + " feet " + inches + " inches = " + Height.getInCentimeters(feet, inches)+" centimeters");
        }
        else if (unit_selection == 2)
        {
            System.out.println("Enter the centimeters : ");
            double centimeters = in.nextDouble();

            System.out.println(Height.getInFeetInches(centimeters));
        }
        else
        {
            System.out.println("Wrong unit selection.");
        }

        
       



    }
}