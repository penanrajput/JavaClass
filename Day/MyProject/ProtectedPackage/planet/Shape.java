package planet;
import info.Animal;

public class Shape extends Animal
{
  public static void main(String[] args)
  {
    Shape a = new Shape();
    // the Person and Dog classes are in 2 different packages.
    // The waveTail() method of the Dog class is protected,
    // thus the Person class cannot invoke it:

    a.setAge(100);
    a.getAge();
  }
}
