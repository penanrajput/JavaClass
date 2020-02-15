public class MathClass
{
    public static void main(String[] args) {
        System.out.println(Math.sqrt(50));  // 7.0710678118654755
        System.out.println(Math.sqrt(-50)); // Nan

        System.out.println(Math.sin(50));
        System.out.println(Math.cos(50));
        System.out.println(Math.tan(50));

        System.out.println(Math.exp(50));
        System.out.println(Math.log(50));
        System.out.println(Math.log10(50));

        System.out.println(Math.max(50, 10)); // result int
        System.out.println(Math.max(50.0f, 10.0f)); // result float
        System.out.println(Math.max(50.0, 10.0)); // result double
        System.out.println(Math.max(50.0, 10)); // not error, implicite typecasting

        System.out.println(Math.min(50, 10)); // result int
        System.out.println(Math.min(50.0f, 10.0f)); // result float
        System.out.println(Math.min(50.0, 10.0)); // result double
        System.out.println(Math.min(50.0, 10)); // not error, implicite typecasting



          
    }
}