class A
{
      int x;
      Class B
      {
            int x;
            void display()
            {
                  System.out.println("Inside B display method");
            }
      };


      public static void show()
      {
            // B b = new B();
            // B.display();
      }
}


class F1_InnerClass
{
      public static void main(String[] args) {
            A a = new A();
            // A.show();
      }
}
