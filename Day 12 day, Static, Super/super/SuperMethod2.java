class A
{
  int x;
    A(int a)
    {
      x = a;
      System.out.println("Inside class A Constructor");
    }
}

class B extends A
{
  int y;
  B(int a, int b)
  {
      // to call A constructor we use super() method, always first line
    super(a);
    y = b;
    System.out.println("Inside class B Constructor");

    // defauklt not allowed bcoz class A has parameterized constructor
    // super();
  }
}

class C extends B
{
  int z;
  C(int a, int b, int c)
  {
    super(a, b);
    z = c;
    System.out.println("Inside class C Constructor");
  }
  void show()
  {
    System.out.println("value of x -> " + x);
    System.out.println("value of y -> " + y);
    System.out.println("value of z -> " + z);
  }

}
class SuperMethod2
{
  public static void main(String[] args) {
    C c  = new C(15, 30, 45);
    c.show();
  }
}
