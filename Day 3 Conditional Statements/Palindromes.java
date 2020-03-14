
/*
// find the first and last number of number
class Palindromes
{
      public static void main(String[] args) {
            int num = 45678;
            System.out.println(num);

            int end = num  % 10;
            int start = 0;
            while(num > 0)
            {
                  start = num % 10;

                  num = num / 10;
            }
            System.out.println("Start number is  -> " + start);
            System.out.println("End   number is  -> " + end);
            // System.out.println("product of two is-> " + start * end);

      }
}
*/

/*
// find whether given number is palindrom or not
class Palindromes
{
      public static int findReverse(int n)
      {
            int rev = 0;
            while(n > 0)
            {
                  rev = rev * 10 +  n % 10;
                  n = n / 10;
            }
            return rev;
      }


      public static void isPalindrome(int n)
      {
            if (n == findReverse(n))
                  System.out.println(String.format("The number %7d is Palindrome", n));
            else
                  System.out.println(String.format("The number %7d is not Palindrome", n));
      }


      public static void main(String[] args) {
            isPalindrome(121);
            isPalindrome(123);
            isPalindrome(124);
            isPalindrome(12321);

      }
}
*/


// https://stackoverflow.com/questions/2012305/comparing-stringbuffer-content-with-equals

class Palindromes
{
      public static void isPalindrome(String str)
      {
            StringBuffer rev = new StringBuffer(str);


            // if we used the rev.equals(rev.reverse())
            // we actually comparing the references of StringBuffer and not actual String so we need toString method to get actual String compared
            // boolean equals(Object obj)
                  // Indicates whether some other object is "equal to" this one.
                  // Object is getting compared
            // String	toString()
                  // Returns a string representation of the object.


            if(rev.toString().equals(rev.reverse().toString()))
                  System.out.println(str + " is Palindrome");
            else
                  System.out.println(str + " is not Palindrome");

            // System.out.println("str -> " + rev);
            // System.out.println("sf  -> " + rev.reverse());
            // System.out.println(rev.equals(rev.reverse()));
            // System.out.println(rev.equals(rev.reverse()));
      }
      public static void main(String[] args) {
            isPalindrome("AbaB");
            isPalindrome("AaaA");


            // String s1 = "Hello";
            // String s2 = "Hello";
            //
            // StringBuffer sf1 = new StringBuffer("hello");
            // StringBuffer sf2 = new StringBuffer("hello");

            // System.out.println("s1 == s2        -> " + s1 == s2);
            // System.out.println(s1 == s2);
            // System.out.println("s1.equals(s2)   -> " + s1.equals(s2));

            // System.out.println(   sf1 == sf2);
            // System.out.println(   sf1.equals(sf2));


      }
}
