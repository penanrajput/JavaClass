// 1. Using Interface // Important One
interface A
{
      void display();
      void show();

}


class AnonymousClassUsingInterface
{
      public static void main(String[] args) {
            A a = new A(){
                  public void display()
                  {
                        System.out.println("From display");
                  }
                  public void show()
                  {
                        System.out.println("From show");
                  }
            };
            a.display();
            a.show();
      }
}


// Ouput :
// From display
// From show



// 2. Using Class
class A
{
      void display()
      {
            System.out.println ("From A display method");
      }
      void show()
      {
            System.out.println ("From A show method");
      }
}

class AnonymousClassUsingClass
{
      public static void main(String[] args) {
            A a = new A(){
                  /*
                  // if you want to override
                  public void display()
                  {
                        System.out.println("From display");
                  }
                  public void show()
                  {
                        System.out.println("From show");
                  }
                  */
            };
            a.display();
            a.show();
}
}



// 3. Using SuperClass
class A
{
      void display()
      {
            System.out.println ("From A display method");
      }
      void show()
      {
            System.out.println ("From A show method");
      }
}

class B extends A
{
      void display()
      {
            System.out.println ("From B display method");
      }
      void show()
      {
            System.out.println ("From B show method");
      }
}


class InterfaceImplementation
{
      public static void main(String[] args) {
            A a = new B(){
                  /*
                  // if you want to override
                  public void display()
                  {
                        System.out.println("From display");
                  }
                  public void show()
                  {
                        System.out.println("From show");
                  }
                  */
            };
            a.display();
            a.show();
      }
}
