interface Emp
{
      // no constructors
      // all methods are public, and abstract
      void display();
      void info();
}


class 1_SyntaxInteface implements Emp
{
      public void display()
      {
            System.out.println("Inside the SyntaxInteface display() method");
      }
      public void info()
      {
            System.out.println("Inside the SyntaxInteface info() method");
      }
      public static void main(String[] args) {
            SyntaxInteface si = new SyntaxInteface();
            si.display();
            si.info();
      }
}
