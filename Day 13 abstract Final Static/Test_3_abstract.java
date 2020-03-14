abstract class Animal
{
  String name;
  abstract  void getName(String s);
  abstract  void putName();
}

class Dog extends Animal
{
  String name;
  void getName(String s)
  {
    name = s;
  }
  void putName()
  {
    System.out.println("Name of Dog -> "+ name);
  }
}

class Test_3_abstract
{
  public static void main(String[] args)
  {
      Dog d = new Dog();
      d.getName("Tommy");
      d.putName();
    }

}
