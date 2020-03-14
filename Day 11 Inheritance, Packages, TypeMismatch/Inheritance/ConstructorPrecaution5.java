// Variation 5
// Error

// the way to call Constructor
// first superclass constructor is called
// then subclass constructor

// When we create object of B
// then before Constructor of B called
// we want constructor of A to be called
// Right.
//
// And main things is if Constructor of A is default
// it becomes easy to call default constructor of abstract
// so at first Default consttuctor of A is called
// then parameterized constructor of B is called.

// if B has parameterized constructor
      // searching for default constructor of A
            // if found execute
            // not found , error
class A
{
          // default constructor
          A()
          {
                System.out.println("Inside A Class parameterized Constructor");
          }
}

class B extends A
{
      // parameterized constructor
        B(int x)
        {
             System.out.println("Inside B Class parameterized Constructor with argument " + x);

        }
}



class ConstructorPrecaution5
{
        public static void main(String[] args) {
          B b = new B(30);
        }
}
