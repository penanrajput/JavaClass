// program 1 : WrapperClass

class WrapperClass
{
      public static void main(String[] args) {
            byte b = 30;
            short s = 4563;
            int i = 40; // supports till 9 digits
            long l = 456689405454254L; //more than 9 digits
            float f = 36.45f;
            double d = 45.362;
            char c = 'A';
            boolean bl = true;

            System.out.println("\n\tPrimitive Datatypes : ->  ");
            System.out.println("Byte    -> " + b);
            System.out.println("Short   -> " + s);
            System.out.println("Integer -> " + i);
            System.out.println("Long    -> " + l);
            System.out.println("Float   -> " + f);
            System.out.println("Double  -> " + d);
            System.out.println("Char    -> " + c);
            System.out.println("Boolean -> " + bl);

/*
      // Constructor how it can be made (Imagination)
      class Integer
      {
            int x;
            Integer(int i)
            {
                  x = i;
            }
      }

      }
}
*/
            Byte bb = new Byte(b);
            Short ss = new Short(s);
            Integer ii = new Integer(i);
            Long ll = new Long(l);
            Float ff = new Float(f);
            Double dd = new Double(d);
            Character cc = new Character(c);
            Boolean bbll = new Boolean(bl);

            System.out.println("\n\tWrapper Objects : -> ");
            System.out.println("Byte ->    " + bb);
            System.out.println("Short ->   " + ss);
            System.out.println("Integer -> " + ii);
            System.out.println("Long    -> " + ll);
            System.out.println("Float   -> " + ff);
            System.out.println("Double  -> " + dd);
            System.out.println("Char    -> " + cc);
            System.out.println("Boolean -> " + bbll);
      }



}
