// Guess the output

class A
{
  int x;
      A()
      {
            System.out.println("Default Constructor of class A is called");
      }
      A(int a)
      {
            x = a;
      }
}

class B extends A
{
      int y;
      B(int a, int b)
      {
            y = b;
      }
      void show()
      {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
      }

}

class SuperMethod5
{
      public static void main(String[] args) {
            B b = new B(40, 50);
            b.show();
      }
}
