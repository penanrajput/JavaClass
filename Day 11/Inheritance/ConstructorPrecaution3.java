// Variation 3
// Error

// the way to call Constructor
// first superclass constructor is called
// then subclass constructor

// When we create object of B
// then before Constructor of B called
// we want constructor of A to be called
// Right.
//
// And main things is if Constructor of A is parameterized and not default is defined
// then parameterized constructor of A needs to be called
// but because we don't have any way to call parameterized constructor of A, so we use the method super(<parameters>).



class A
{
            // default constructor defined by us
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
      // default constructor defined by us
        B()
        {
          System.out.println("Inside class B Constructor");
        }

}

class C extends B
{
      // default constructor defined by us
      C()
      {
            System.out.println("Inside class C Constructor");
      }
      C(int x)
      {
           System.out.println("Inside C Class parameterized Constructor");
      }
}

class ConstructorPrecaution3
{
        public static void main(String[] args) {
          C c = new C(30);
        }
}


// Programs run because we have default constructor defined by us
// next program with parameterized constructor , but no default constructor
