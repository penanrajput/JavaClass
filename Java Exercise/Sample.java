class Sample
{

    public static void  printSymbols(char[] cmd)
    {
        for(char ch : cmd)
        {
            System.out.println(ch);
        }
    }
    static String[] letter_P_data =
        {      
 
                "XXXXXXXX  ",
                "XX     XX ",
                "XX     XX ",
                "XXXXXXXX  ",
                "XX        ",
                "XX        ",
                "XX        "
        };

    public static void main(String[] args) {
        
        
        for(int i=0; i<letter_P_data.length; i++)
        {
            System.out.println(letter_P_data[i]);
         
            
        }

        
    }
}