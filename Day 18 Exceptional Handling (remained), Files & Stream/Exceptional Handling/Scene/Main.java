import com.penan.Addition;

class Main
{
      static Addition add = null;
      public static void main(String[] args) {
            add = new Addition(20, 30);
            try
            {
                  System.out.println("Total = " + add.addTwo(-20, 20));
            // System.out.println(add);
            }
            catch(ArithmeticException e)
            {
                  System.out.println("Exception caught in Main java in main method ");
            }
            pink();

      }
      public static void pink()
      {
            add = new Addition(50, 60);
            add.addTwo(-30, 60);
      }
}
