class AutoBoxingMethods
{
      static int m(Integer n)
      {
            return n;
      }
      public static void main(String[] args) {
            // Auto box and auto unbox
            /*
            Integer iObj = 10;
            System.out.println("Integer iOb => " + iObj);

            int iVar = iObj;
            System.out.println("int iVar    => " + iVar);
            */

            // Autoboxing and methods
            /*
            Integer intObj = 50; // auto boxing
            int intVar = m(intObj);
            System.out.println("intVar => " + intVar);
            */

            // Autoboxing in expressions
            /*
            int i;
            Integer intObj = 50;
            intObj = intObj * intObj;
            System.out.println("intObj => " + intObj);

            ++intObj;
            System.out.println("intObj => " + intObj);

            i =  intObj + (intObj/5);
            intObj = intObj + (intObj/5);
            System.out.println("i -> " + i);
            System.out.println("intObj -> " + intObj);
            */

            // Autoboxing in expression part 2
            // Once the values are unboxed, the standard type promotions and conversions are applied
            /*
            Integer intObj = 100;
            Double doubleObj = 98.6;

            doubleObj = doubleObj + intObj;
            System.out.println("doubeObj -> " + doubleObj);
            */

            /*
            Integer intObj = 2;
            switch(intObj)
            {
                  case 1:
                        System.out.println("Value 1");
                        break;
                  case 2:
                        System.out.println("Value 2");
                        break;
                  case 3:
                        System.out.println("Value 3");
                        break;
            }
            */

            // Autoboxing/Unboxing Boolean and Character Values
            /*
            Boolean b = true;
            if(b)
                  System.out.println("Roses are red");
            else
                  System.out.println("Clouds are blue");
            */

            /*
            Character charObj = 'a';
            char charVar = charObj;
            System.out.println("charVar => " + charVar);
            */

            Boolean b = true;
            // valid code
            while(b)
            {
                  System.out.println("Hello World");
            }
      }
}
