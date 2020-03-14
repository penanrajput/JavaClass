// FileStream
      // FileInputStream
      // FileOutputStream
/*
import java.io.*;
import java.util.*;

class Test
{
      public static void main(String[] args) throws  IOException, ClassNotFoundException {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter input filename : ");
            String filename = in.next();

            FileInputStream fin;
            try
            {
                   fin = new FileInputStream(filename);
                  int temp = fin.read();
                  while(temp!=-1)
                  {
                        System.out.print((char)temp);
                        temp = fin.read();
                  }
                  fin.close();
            }
            catch(FileNotFoundException e)
            {
                  // System.out.println(e);
                  System.out.println("File Doesn't exists ");
            }


      }
}
*/

/*
// File Content Copy from one file to another file
// You can copy images, texts , word documnets
import java.io.*;
import java.util.*;

class Test
{
      public static void main(String[] args) throws  IOException, ClassNotFoundException {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Source filename : ");
            String source_file = in.nextLine();

            // FileInputStream fin; // incase you want to use fin outside try block
            try
            {
                  FileInputStream fin = new FileInputStream(source_file);
                  System.out.println("Enter the Destination Filename -> ");
                  String destination_file = in.nextLine();
                  FileOutputStream fout = new FileOutputStream(destination_file);

                  int temp = fin.read();
                  while(temp!=-1)
                  {
                        fout.write((char)temp);
                        temp = fin.read();
                  }
                  fin.close();
                  fout.close();
            }
            catch(FileNotFoundException e)
            {
                  // System.out.println(e);
                  System.out.println("File Doesn't exists ");
            }
      }
}
*/

// DataStream
      // DataInputStream
      // DataOutputStream
      import java.io.*;
      import java.util.*;

      class Test
      {
            public static void main(String[] args) throws  IOException, ClassNotFoundException {
                  Scanner in = new Scanner(System.in);
                  int    x = 12345;
                  double y = 45666.4875125;
                  char   z = 'A';

                  System.out.println("Enter output filename : ");
                  String filename = in.next();


                  try
                  {
                        DataOutputStream fout = new DataOutputStream(new FileOutputStream(filename));
                        fout.writeInt(x);
                        fout.writeDouble(y);
                        fout.writeChar(z);
                        fout.close();
                        System.out.println("Data Written Successful");

                        System.out.println("Reading from file -> " + filename);

                        DataInputStream fin = new DataInputStream(new FileInputStream(filename));
                        int a = fin.readInt();
                        double b = fin.readDouble();
                        char c = fin.readChar();

                        System.out.println(" a -> " + a);
                        System.out.println(" b -> " + b);
                        System.out.println(" c -> " + c);
                        System.out.println("Data Input Successful");
                  }
                  catch(FileNotFoundException e)
                  {
                        // System.out.println(e);
                        System.out.println("File Doesn't exists ");
                  }


            }
      }








/*
// Object Stream
      // ObjectOutputStream
      // ObjectInputStream
import java.io.*;
import java.util.*;
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

class Test
{
      public static void main(String[] args) throws  IOException, ClassNotFoundException {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter output filename : ");
            String filename = in.next();
            ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(filename));
            fout.writeObject(new Emp("Amar", 10, 1000.0));
            fout.writeObject(new Emp("Ajay", 20, 2000.0));
            fout.writeObject(new Emp("Anthony", 30, 3000.0));
            fout.close();


            System.out.println("Enter input filename : ");
            filename = in.next();
            ObjectInputStream fin = new ObjectInputStream(new FileInputStream(filename));

            try
            {
                  Emp e = (Emp)fin.readObject();
                  while(true) // when we don't know the number of objects in File
                  {
                        e.display();
                        e = (Emp)fin.readObject();
                  }
            }
            catch(EOFException e)
            {
                  // System.out.println(e);
            }
            finally
            {
                  fin.close();
            }


      }
}

*/
