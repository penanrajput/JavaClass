package info;


class Bird
{
  String name;
  void setName(String n)
  {
    name = n;
  }
  void getName()
  {
    System.out.println("the name is = " + name);
  }
  void createAnimal()
  {
    Animal a = new Animal();
  }
}
