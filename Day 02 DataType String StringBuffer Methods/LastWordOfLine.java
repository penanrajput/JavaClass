import java.util.*;


public class LastWordOfLine
{
    public static void main(String[] args)
    {
          // implicite Line
        // String str = "Hello World Java and Python";
        // int lastSpace = str.lastIndexOf(" ");
        // System.out.println(str.substring(lastSpace+1, str.length()));

        // Explicite lines
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String str = in.nextLine();
        System.out.print("Last Word is  : ");
        int lastSpace = str.lastIndexOf(" ");
        System.out.println(str.substring(lastSpace+1, str.length()));

    }
}
