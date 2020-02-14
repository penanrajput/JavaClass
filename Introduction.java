import java.util.*;

public class Introduction
{
    public static void main(String[] args)
    {
        String str = "Hello World Java and Python";
        int lastSpace = str.lastIndexOf(" ");
        System.out.println(str.substring(lastSpace+1, str.length()));
        
 
    }
}