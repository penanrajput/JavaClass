import java.math.BigInteger;

public class Biginteger{
    public static void main(String[] args) {
        int a, b;                
        BigInteger A, B, C ; 
       
        /*
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
        */


        // multiply with big numbers
        BigInteger bi1 = new BigInteger("4845154845121455555254655485");
        BigInteger bi2 = new BigInteger("484515484512145555525465545");
        BigInteger bi3 = bi1.multiply(bi2);
        System.out.println(bi3);
    }
}