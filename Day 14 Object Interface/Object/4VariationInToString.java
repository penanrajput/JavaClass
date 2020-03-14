// toString() objects String Representation

class Person
{
      public String toString()
      {
            return " Called toString() of Person";
      }
}

class Emp extends Person
{
      public int id;
      public String name;
      public double salary;
      Emp(int a, String b, double c)
      {
            id = a;
            name = b;
            salary = c;
      }

      public String toString()
      {
            // return ("ID     = " + id + "\nName   = " + name + "\nSalary = " + salary);
            return " Called toString() of Emp";
      }
}



class 4VariationInToString
{
      public static void main(String[] args)
      {
            Person p = new Emp(10, "ajay", 500.00); // DMD concept here applies
            System.out.println(p);


      }
}
