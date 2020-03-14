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
        // super method must be on first line of of subclass Constructor
        // otherwise error is generated
          super(a); // right way
          y = b;
          // super(a); // error
          System.out.println("Inside class B Constructor");
  }
}



class SuperMethod4
{

}
