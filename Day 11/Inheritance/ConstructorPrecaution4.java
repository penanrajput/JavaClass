// Variation 4
// Error

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
          // parameterized constructor
          A(int x)
          {
                System.out.println("Inside A Class parameterized Constructor");
          }
}

class B extends A
{
      // parameterized constructor
        B(int x)
        {
             System.out.println("Inside B Class parameterized Constructor");
        }
}



class ConstructorPrecaution4
{
        public static void main(String[] args) {
          B b = new B(30);
        }
}
