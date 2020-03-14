interface Salary
{

}

class Person
{

}


// class Emp implements Salary extends Person  // bad way of declaring the class
class Emp extends Person implements Salary
{

}





class File_5_Good_References
{
      public static void main(String[] args) {
            // only 3 good references in java for class
            Emp e = new Emp();
            Person p = new Emp();
            Salary s = new Emp();
      }
}
