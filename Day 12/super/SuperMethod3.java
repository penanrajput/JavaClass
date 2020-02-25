// Variation 1

class A
{
    A()
    {
      System.out.println("Inside class A Constructor");
    }
}

class B extends A
{
  B()
  {
    System.out.println("Inside class B Constructor");
  }
}
class SuperMethod3
{
  public static void main(String[] args) {
    B b = new B();
  }
}
