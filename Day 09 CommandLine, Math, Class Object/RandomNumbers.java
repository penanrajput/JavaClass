
public class RandomNumbers {

    public static int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper - lower)) + lower;
        return num;

    }

    public static int randomRange(int lower, int upper, int step) {
        int num = (int) (Math.random() * (upper - lower)) + lower;
        num = num - (num % 5);
        return num;

    }

    public static void main(String[] args) {
        // print one random number
        // double d = Math.random();
        // System.out.println(d);

        // // Print 10 double random numbers
        // for (int i = 0; i < 10; i++) {
        // double d = Math.random();
        // System.out.println(d);
        // }

        // print 10 double random numbers from range 0 to 10
        // for(int i=0; i<10; i++)
        // {
        // double d = Math.random();
        // System.out.println(d*10);
        // }

        // print 10 integer random numbers from range 0 to 10
        // for(int i=0; i<10; i++)
        // {
        // int d = (int)(Math.random()*10);
        // System.out.println(d);
        // }

        // print integer 10 random numbers ranging from 0 to 1000
        // for(int i=0; i<10; i++)
        // {
        // int d = (int)(Math.random()*1000);
        // System.out.println(d);
        // }

        // print integer 10 random numbers ranging from 100 to 1000
        // int counter = 1;
        // while(true)
        // {
        // int d = (int)(Math.random()*1000);
        // if (d < 1000 && d>100)
        // {

        // ++counter;
        // System.out.println(d);
        // }
        // if(counter == 10)
        // {
        // break;
        // }
        // }

        // Java Generate Random Number Between Two Given Values
        // Scanner in = new Scanner(System.in);
        // int lower = in.nextInt();
        // int upper = in.nextInt();
        // int r = (int) (Math.random() * (upper - lower)) + lower;
        // System.out.println(r);
        // If You want to specify a more decent range, like from 10 to 100 ( both are in
        // the range )
        // so the code would be :
        // int Random =10 + (int)(Math.random()*(91));

        // Java Generate n integer Random Number Between Two Given Values
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter lower bound : ");
        // int lower = in.nextInt();
        // System.out.println("Enter upper bound : ");
        // int upper = in.nextInt();
        // System.out.println("Enter number of integers to be generated : ");
        // int n = in.nextInt();

        // for(int i=1; i<=n; i++)
        // {
        // int r = (int) (Math.random() * (upper - lower)) + lower;
        // System.out.print(r+" ");

        // }

        // ------------------------------------------------------------------------------------
        for (int i = 0; i < 10; i++) {
            System.out.println(randomRange(50, 100));
        }
        // end line
    }
}