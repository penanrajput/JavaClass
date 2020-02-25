package planet;
import info.Animal;

public class Shape
{
  public static void main(String[] args)
  {
    // access Animal Class of different package 
    Animal a = new Animal();
    a.setAge(120);
    a.getAge();
  }
}
