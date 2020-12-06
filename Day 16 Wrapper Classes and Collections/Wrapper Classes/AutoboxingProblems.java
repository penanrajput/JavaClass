class AutoboxingProblems
{
      public static void main(String[] args) {
            // manually unboxing
            /*
            Integer intObj = 100;
            int intVar = intObj.intValue();// manually unbox // intVar = 100
            System.out.println("IntVar -> " + intVar);
            int intVar2 = intObj.byteValue();   // intVar = 100
            System.out.println("IntVar2 -> " + intVar2);

            intObj = 1000;
            int intVar2 = intObj.byteValue(); // intVar = -24
            // this might be error
            // but didn't show up, so
            System.out.println("IntVar2 -> " + intVar2);
            */

            //bad use of Wrapper Classes
            // technically correct and does, in fac the work properly
            // its very bad use of autobxing and unboxing
            // its far less efficient than equivalent code written using the primitve type Double
            // the reason is that each autobx and auto-unbox adds overhead that is not present if primimtve type is used
            Double a, b, c;

            a = 10.0;
            b = 4.0;
            // calculate hypothenuse of right triangle
            c = Math.sqrt(a*a + b*b);
            System.out.println("hypothenuse -> " + c);






      }

}
