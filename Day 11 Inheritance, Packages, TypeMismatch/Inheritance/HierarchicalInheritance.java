class A
{
  int x;
  void setX(int a)
  {
    x = a;
  }
}
class B extends A
{
  int y;
  void setY(int a)
  {
    y = a;
  }

  void display()
  {
    System.out.println("The value of x -> " + x);
    System.out.println("The value of y -> " + y);

  }
}

class C extends A
{
  int z;
  void setZ(int a)
  {
    z = a;
  }

  void display()
  {
    System.out.println("The value of x -> " + x);

    System.out.println("The value of z -> " + z);
  }
}


class HierarchicalInheritance
{
  public static void main(String[] args) {
    B b = new B();
    b.setX(40);
    b.setY(80);
    b.display();

    C c = new C();
    c.setX(45);
    c.setZ(90);
    c.display();
  }
}
