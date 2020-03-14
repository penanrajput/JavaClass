class Student
{
      protected void finalize() throws Throwable
      {
          System.out.println("Hello World");
      }
}


class Emp implements Cloneable
{
      static public int id;
      static public String name;
      static public double salary;
      Emp(int a, String b, double c)
      {
            id = a;
            name = b;
            salary = c;
      }
      void setId(int a)
      {
            id = a;
      }
      String display()
      {
            return ("Id -> " + id + " Name -> " + name+ "Salary -> " + salary);
      }
      public Object clone() throws CloneNotSupportedException
      {
            return super.clone();
            // return this.clone();
      }
      public String toString()
      {
            return ("ID     = " + id + "\nName   = " + name + "\nSalary = " + salary);
      }
}

class 3ObjectMethods
{
      static void cloneBefore()
      {
            Emp e1 = new Emp(10, "Ajay", 50000.0);
            // Emp e2 = new Emp(20, "Atul", 60000.0);
            Emp e2 = e1;

            // object is 1 and references are two
            // so change in object is referenced by e1 and e2
            System.out.println("Before Change e1: " + e1.display());
            System.out.println("Before Change e2: " + e2.display());

            e1.setId(50);

            System.out.println("After  Change e1: " + e1.display());
            System.out.println("After  Change e2: " + e2.display());

      }
      static void cloneAfter()  throws CloneNotSupportedException
      {
            Emp e1 = new Emp(10, "Ajay", 50000.0);
            // Emp e2 = new Emp(20, "Atul", 60000.0);
            Emp e2 = (Emp)e1.clone();

            // object is 1 and references are two
            // so change in object is referenced by e1 and e2
            System.out.println("Before Change e1: " + e1.display());
            System.out.println("Before Change e2: " + e2.display());

            e1.setId(50);

            System.out.println("After  Change e1: " + e1.display());
            System.out.println("After  Change e2: " + e2.display());
      }
      static void equalsBefore()
      {
            Emp e1 = new Emp(10, "Ajay", 50000.0);
            Emp e2 = new Emp(10, "Ajay", 50000.0);
            if(e1 == e2) // always false, because reference (address) is checked, and not fields of object
                  System.out.println("Objects fields are equal");
            else
                  System.out.println("Objects fields are not equal");

      }

      static void equalsAfter()
      {
            Emp e1 = new Emp(10, "Ajay", 50000.0);
            Emp e2 = new Emp(10, "Ajay", 50000.0);
            if(e1.equals(e2)) // fields are checked, returns true or false
                  System.out.println("Objects fields are equal");
            else
                  System.out.println("Objects fields are not equal");
      }
      /*
      @Override
      public boolean equals(Object obj)
      {

            // checking if both the object references are
            // referring to the same object.
            if(this == obj)
                  return true;

            // it checks if the argument is of the
            // type EMp by comparing the classes
            // of the passed argument and this object.
            // if(!(obj instanceof Geek)) return false; ---> avoid.
            if(obj == null || obj.getClass()!= this.getClass())
                  return false;

            // type casting of the argument.
            Emp e = (Emp) obj;

            // comparing the state of argument with
            // the state of 'this' Object.
            return (e.name == this.name && e.id == this.id );
      }
      */

      public static void aferFinalise()
      {
            Student s = new Student();
            // finalise method -> https://javaconceptoftheday.com/garbage-collection-finalize-method-java/
      }

      public static void afterGetClass()
      {
            Emp e1 = new Emp(10, "Ajay", 50000.0);
            Student s = new Student();
            System.out.println( e1.getClass());
            System.out.println(  s.getClass());
      }
      public static void afterToString()
      {
            Emp e1 = new Emp(10, "Ajay", 50000.0);
            // System.out.println(e1);
            // is same as
            System.out.println(e1.toString());
      }
      public static void main(String[] args) throws CloneNotSupportedException  {
            // cloneBefore();
            // cloneAfter();
            // equalsBefore();
            // equalsAfter(); // not done
            // aferFinalise();

            // afterGetClass();

            afterToString();


      }
}
