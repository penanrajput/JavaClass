import java.math.BigInteger;

public class Biginteger{
    public static void main(String[] args) {
        int a, b;                
        BigInteger A, B, C ; 
       
        
         // BigInteger object.multiply(BigInteger val)
        a = 54;
        b = 23;
        A  = BigInteger.valueOf(54);
        B  = BigInteger.valueOf(37);
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(A.multiply(B));

        C = A.multiply(B);
        System.out.println(C);
    }
}