class Typecasting{
    public static void main(String[] args) {
        int x = 10; 
        int y = 14;
        int z = 20;

        System.out.println("Average is as follows : "); // asnwers is 44/3 = 14.6666667
        // Both x+y+z and 3 are integers

        // double avg = (x+y+z)/3;
        // System.out.println(avg);  // 14


        // double avg = (double)(x+y+z)/3;
        // System.out.println(avg);  // 14.666667

        // double avg = (x+y+z)/(double)3;
        // System.out.println(avg);   // 14.666667

        // double avg = (double)(x+y+z)/(double)3;
        // System.out.println(avg);   // 14.666667

        // table is as follows:
        //  X (any operation, +, -, *, /)
        // i X i = i
        // i X R = R
        // R X i = R
        // R X R = R 

        // double should be preferred because agar float 4 bit se jyada hua to, isliye hamesha prefer double


        
        // double avg = (double)(x+y+z)/3.0;
        // System.out.println(avg);   // 14.666667


        // Type casting in java




        int a = 10;
        
    }
}