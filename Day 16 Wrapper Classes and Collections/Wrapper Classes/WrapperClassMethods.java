// Program 2 : WrapperClassMethods

class WrapperClassMethods
{
      public static void main(String[] args) {
            /*
            // Converting Primitive Type to Wrapper Type using Constructor method
            int x = 20;
            System.out.println("     x -> " + x);
            Integer intObj = new Integer(x);
            System.out.println("intObj -> " + intObj);
            System.out.println("----------------------");

            double d = 5454.61454;
            System.out.println("     d -> " + d);
            Double doubleObj = new Double(d);
            System.out.println("doubleObj -> " + doubleObj);
            */

            /*
            // Converting Wrapper object to Primitive Type using instance typeValue method
            Integer intObj = new Integer(40);
            System.out.println("intObj -> " + intObj);
            int x = intObj.intValue();
            System.out.println("     x -> " + x);

            System.out.println("-------------------------");

            Double doubleObj = new Double(4154.21564);
            System.out.println("doubleObj -> " + doubleObj);
            double d = doubleObj.doubleValue();
            System.out.println("        d -> " + d);
            */

            /*
            // Converting String to Primitive Type using static parse method
            int i = Integer.parseInt("4540");
            System.out.println("i -> " + i);

            double d = Double.parseDouble("4540");
            System.out.println("d -> " + d);

            */

            // Converting Primitive Datatype to String using static toString() method
            String str_i = Integer.toString(45846);
            System.out.println("String -> " + str_i + " and length is -> " + str_i.length());

            System.out.println("-------------------------");
            
            String str_d = Double.toString(544.1454);
            System.out.println("String -> " + str_d + " and length is -> " + str_d.length());




      }
}
