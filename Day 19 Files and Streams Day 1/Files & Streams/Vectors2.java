import java.io.*;
import java.util.*;
// import java.
class Emp implements Serializable
// class Emp
{
      String name;
      int num;
      double salary;
      Emp(String a, int b, double c)
      {
            name = a;
            num = b;
            salary = c;
      }
      public String toString()
      {
            return "(name= " + name + ", num= " + num + ", salary= " + salary + ")";
      }

      public void display()
      {
            System.out.println(" name   -> " + name);
            System.out.println(" num    -> " + num);
            System.out.println(" salary -> " + salary);
            System.out.println("---------------------------------------------------------");
      }
}

class Vectors2
{
      @SuppressWarnings("unchecked")
      public static void main(String[] args) throws  Exception  {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter output filename : ");
            String filename = in.next();
            ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(filename));

            Vector <Emp> v = new Vector<Emp>();
            v.add(new Emp("Penan",  10, 50.00));
            v.add(new Emp("Rajput", 20, 100.00));
            v.add(new Emp("Love",   30, 150.00));

            fout.writeObject(v);
            fout.close();

            ObjectInputStream fin = new ObjectInputStream(new FileInputStream(filename));
            Vector<Emp> temp = (Vector<Emp>)fin.readObject();

            for(Emp c : v)
                  c.display();

            fin.close();
      }
}
