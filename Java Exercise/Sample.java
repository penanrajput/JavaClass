import java.util.ArrayList;

class Sample
{

    public static void main(String[] args) 
    {
        int a = 60;
        System.out.println(a>>1);
        while(a>0)
        {
            System.out.print(a%2);
            a = (int)a / 2;
        }
    
    
    
    }
}