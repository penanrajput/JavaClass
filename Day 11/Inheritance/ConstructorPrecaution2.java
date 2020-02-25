// Variation 2
// Erro

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

          // parameterized constructor
          A(int x)
          {
                System.out.println("Inside A Class parameterized Constructor");
          }
}

class B extends A
{
        B()
        {
          System.out.println("Inside class B Constructor");
        }
        B(int x)
        {
             System.out.println("Inside B Class parameterized Constructor");
        }
}

class C extends B
{
      C()
      {
            System.out.println("Inside class C Constructor");
      }
      C(int x)
      {
           System.out.println("Inside C Class parameterized Constructor");
      }
}

class ConstructorPrecaution2
{
        public static void main(String[] args) {
          C c = new C(30);
        }
}
