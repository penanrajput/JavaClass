import java.util.*;

public class LexicologicalOrder {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            String [] str = new String[n];

            for(int i=0; i<n; i++)
                str[i] = in.next();

            Arrays.sort(str);
            for(String v: str)
                System.out.println(v);

            in.close();


    }
}
