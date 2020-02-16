import java.util.StringTokenizer;

public class StringTokenZer
{
    public static void main(String[] args) {
        // StringTokenizer st = new StringTokenizer("this is my first line in string tokenizer ");
        // while(st.hasMoreTokens())
        // {
        //     System.out.println(st.nextToken());
        // }

        // o/p
        // this
        // is
        // my
        // first
        // line
        // in
        // string
        // tokenizer



        // String [] tokens = new String[100];
        // String str = new String("hello this is my first program");
        // tokens = str.split(" ");
        // for(int i=0; i<tokens.length; i++)
        // {
        //     System.out.println(tokens[i] + " ");
        // }
        // hello
        // this
        // is
        // my
        // first
        // program

        // methods in StringTokenizer 
        // count()
        // hasMoreElements()
        // hasMoreTokens()
        // nextElement()
        // nextTokens()
        // nextToken(String delim)
        

        // int countTokens()
        // StringTokenizer st  = new StringTokenizer("Info planet is best institute for java coding");
        // System.out.println(st.countTokens());


        // boolean hasMoreTokens() == boolean hasMoreElements()
        // StringTokenizer st  = new StringTokenizer("Info planet is best institute for java coding");
        // while(st.hasMoreTokens())
        // {
        //     System.out.println(st.nextToken());
        // }

        // while(st.hasMoreElements())
        // {
        //     System.out.println(st.nextToken());
        // }

            // Object nextElement() returns object instead of string which is returned by nextToken()
        //  while(st.hasMoreElements())
        // {
        //     System.out.println(st.nextElement());
        // }
        StringTokenizer st  = new StringTokenizer("Info %plan% et is b%est in%stitute f%r java coding");
         while(st.hasMoreElements())
        {
            System.out.println(st.nextToken("%"));
        }
    
        // System.out.println(st); // java.util.StringTokenizer@15db9742

        // 
    }
}