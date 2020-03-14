abstract class Animal
{
  String name;
  abstract  void getName(String s);
  abstract  void putName();
}

final class Dog extends Animal
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

// cannot create object of final class
class Tommy extends Dog
{

}

class Test_4_abstract_final
{
  public static void main(String[] args)
  {
      Dog d = new Dog();
      d.getName("Tommy");
      d.putName();
    }

}
