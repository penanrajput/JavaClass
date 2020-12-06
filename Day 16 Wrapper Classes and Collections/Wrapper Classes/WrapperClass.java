// program 1 : WrapperClass

class A
{
      String str;
      public A(String s)
      {
            str = s;
      }

}


class WrapperClass
{
      public static void main(String[] args) {
            /*
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

            // as JDK 9, the constructors has been deprecated
            // today we recommended that ypu use static metod valueOf() to obtain the Wrapper Object
            public static Integer valueOf(int i)
            0
            {
                  x = i;
            }
      }
      }

      }
}
*/
      /*
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

            */
            // creating Wrapper Objects using valueOf() method instead of deprecated Constructors
            /*
            Integer intObj = Integer.valueOf(65);
            int intVar = intObj;
            System.out.println("intVar -> " + intVar);
            */

            // created Wrapper Object - Way 2
            /*
            Integer intObj = Integer.valueOf("4561");
            System.out.println(intObj);

            Double d = Double.valueOf("45.65");
            System.out.println(d);
            */

            // toString method override by Wrapper Classes
            String str = "hello World";
            System.out.println(str.toString());

            A a = new A("Penan");
            System.out.println(a);

            Integer intValue = Integer.valueOf(456);
            System.out.println(intValue);

      }
}
