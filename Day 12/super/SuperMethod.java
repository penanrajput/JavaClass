

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
    // to call A constructor we use super() method, always first line
    super();
    System.out.println("Inside class B Constructor");

    //error
    // System.out.println("Inside class B Constructor");
    // super();
  }
}
class SuperMethod
{
  public static void main(String[] args) {
    B b = new B();
  }
}
