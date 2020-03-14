// Variation 1

// the way to call Constructor
// first superclass constructor is called
// then subclass constructor

class A
{
      // default constructor
          A()
          {
            System.out.println("Inside class A Constructor");
          }
}

class B extends A
{
      // default constructor
        B()
        {
          System.out.println("Inside class B Constructor");
        }
}

class C extends B
{
      // default constructor
      C()
      {
            System.out.println("Inside class C Constructor");
      }
}

class ConstructorPrecaution1
{
        public static void main(String[] args) {
          C c = new C();
        }
}
