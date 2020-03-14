//
interface Emp
{
      // 1, 2 -  all methods inside interface are public  and abstract, and static , (by default, even if you didn't explicitely declare)
            void display(); // = public void display();
            void info();    // = public void info();
}


// not complete
class Person implements Emp
{
      // 5. by default all methods are static of interface
      public static void display()
      {
            System.out.println("Inside Person display() method");
      }
      public  static void info()
      {
            System.out.println("Inside Person info() method");
      }

}



class File_2_Inteface_Properties implements Emp
{
      public void display() // no error of static
      {
            System.out.println("Inside File_2_Inteface_Properties display() method");
      }
      public void info() // no error of static
      {
            System.out.println("Inside File_2_Inteface_Properties info() method");
      }
      public static void main(String[] args) {
            // 3. Object of Reference Cannot be created
            // Emp e = new Emp();

            // 4. but reference can be created
            // Emp e = new File_2_Inteface_Properties();
            // e.display();
            // e.info();

            // 5. by default all methods are static of interface
            Person.display();
            Person.info();


      }
}
