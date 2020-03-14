
public class StringMethods {
    public static void main(String [] args)
    {
        String s = new String("Hello Java");

        // // Method length()
        // System.out.println(s.length());
        // for(int i=0; i<s.length(); i++)
        // {
        //     System.out.println(s.charAt(i));
        // }

        // char ch = s.charAt(4);
        // System.out.println("the character at location 4 is "+ch );

        // String str = "hello java";
        // if(s.compareToIgnoreCase(str))
        // {
        //     System.out.println("Both strings are equal");
        // }
        // else{
        //     System.out.println("Both strings are not equal");
        // }

        // s.concat(" hello Penan");
        // System.out.println(s);

        // System.out.println(s.contains("hello")); // false
        // System.out.println(s.contains("Hello")); // true

        // to find the uppercase and lowercase of String
        // System.out.println(s.toUpperCase());
        // System.out.println(s.toLowerCase());

        // indexOf
        int n = s.indexOf('J');
        System.out.println(n);
    }
}
