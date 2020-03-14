
final class Dog
{
  // by default all members (fields+methods) of final class become final members

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

// cannot create inherit of final class
/*
class Tommy extends Dog
{

}
*/

class Bird
{
  String name;
  void getName(String s)
  {
    name = s;
  }

  void putName()
  {
    System.out.println("Name is -> "+name)
  }


  final void voice()
  {
    System.out.println("voice of Bird")
  }


}

class Parrot extends Bird
{
  // cannot overrdie fiponm
}

class Test_4_abstract_final
{
  public static void main(String[] args)
  {
    // you can create object of final class
      Dog d = new Dog();
      d.getName("Tommy");
      d.putName();


      // you cannot modify members of final class
      // d.name = 40;
    }

}
