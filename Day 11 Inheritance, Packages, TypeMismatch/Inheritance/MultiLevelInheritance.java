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
}

class C extends B
{
  int z;
  void setZ(int a)
  {
    z = a;
  }

  void display()
  {
    System.out.println("The value of x -> " + x);
    System.out.println("The value of y -> " + y);
    System.out.println("The value of z -> " + z);
  }
}
class MultiLevelInheritance
{
  public static void main(String[] args) {
    C c = new C();
    c.setX(40);
    c.setY(60);
    c.setZ(100);
    c.display();
  }
}
