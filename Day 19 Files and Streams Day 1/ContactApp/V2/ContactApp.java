import java.util.*;
import java.io.*;

class Contact implements Serializable
{
      String firstName;
      // String lastName;
      // String state;

      String email;
      long mobile;

      Contact(String a, String c, long d)
      {
            firstName = a;
            // lastName = b;
            email = c;
            mobile = d;
      }
      void display()
      {
            System.out.println("\t" + firstName + "\t\t" + email + "\t\t" + mobile);
      }
      String getName()
      {
            return firstName;
      }
      void modifyName(String a)
      {
            firstName = a;
      }

}

class ContactApp
{
      // static Vector <Contact> v = new Vector<Contact>();
      static Scanner in = new Scanner(System.in);

      // null;
      // @SuppressWarnings("unchecked")
       // = null;
      // static ObjectOutputStream fout = null;
       // = null;
       // static Vector<Contact> v = new Vector<Contact>();
       static Vector<Contact> v ;

      public static void addContact()
      {
                  System.out.println("Enter Contact Detail: ");
                  System.out.print("Enter FirstName : ");


                  String firstName = in.next();
                  // System.out.print("Enter LastName  : ");
                  // String lastName = in.next();
                  System.out.print("Enter Email     : ");
                  String email = in.next();
                  System.out.print("Enter Mobile    : ");
                  long mobile = in.nextLong();

                  v.add(new Contact(firstName, email, mobile));
                  // fout.writeObject(v);

      }

      public static void searchContact()
      {


            System.out.println("Enter Contact Detail: ");
            System.out.print("Enter Name : ");
            String name = in.next();
            boolean counter = false;
            for(Contact c: v)
            {
                  if(c.getName().equals(name))
                  {
                        System.out.println("Found Contact");
                        System.out.println("\tName\tMobile");
                        c.display();
                        counter = true;
                  }
            }
            if(!counter)
            {
                  System.out.println("Cannot Search. Reason: NotFoundContact");
            }
      }

      public static void deleteContact()
      {


            // fout.print("");
            System.out.println("Enter Contact Detail: ");
            System.out.print("Enter Name : ");
            String name = in.next();
            boolean counter = false;
            for(int i=0; i<v.size(); i++)
            {
                  Contact c = v.get(i);
                  if(c.getName().equals(name))
                  {
                        System.out.println("Found the Contact, and Deleted");
                        v.remove(i);
                        counter =  true;
                  }
            }
            if(!counter)
            {
                  System.out.println("Cannot Delete. Reason: NotFoundContact");
            }
            // fout.writeObject(v);
      }

      public static void modifyContact()
      {

            // fout.print("");
            System.out.println("Enter Contact Detail: ");
            System.out.print("Enter Name : ");
            String name = in.next();
            boolean counter = false;
            for(int i=0; i<v.size(); i++)
            {
                  Contact c = v.get(i);
                  if(c.getName().equals(name))
                  {
                        System.out.println("Found the Contact");
                        System.out.print("Enter New Name: ");
                        String changedName = in.next();
                        System.out.println("\tFirstName\tEmail\t\tMobile");
                        c.modifyName(changedName);
                        c.display();
                        counter =  true;
                  }
            }
            if(!counter)
            {
                  System.out.println("Cannot Modify. Reason: NotFoundContact");
            }
            // fout.writeObject(v);
      }

      public static void displayAllContact()
      {
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("\tFirstName\tEmail\t\tMobile");
            System.out.println("-----------------------------------------------------------------------------------");
            // try
            // {

                  for(Contact c:v)
                  {
                        c.display();

                  }
            // }
            // catch(NullPointerException e )
            // {
            //       System.out.println("Empty Records");
            // }
      }

      public static void saveObject()
      {
            try
            {
                  ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream("App.dat"));
                  fout.writeObject(v);
                  fout.close();
            }
            catch(IOException e)
            {
                  System.out.println(e);
            }

      }
      public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException
      {
            int n;
            // Vector <Contact> v = new Vector<Contact>();
            try
            {
                  ObjectInputStream fin  = new ObjectInputStream(new FileInputStream("App.dat"));
                  v = (Vector)fin.readObject();
            }
            catch(FileNotFoundException e)
            {
                  System.out.println("File Created");
                   v = new Vector<Contact>();
            }

            do
            {
                  System.out.println("\nMenu : Enter your Input");
                  System.out.println("1. Add Contact");
                  System.out.println("2. Search Contact");
                  System.out.println("3. Delete Contact");
                  System.out.println("4. Modify Contact");
                  System.out.println("5. Display All Contact");
                  System.out.println("6. Exit");
                  n = in.nextInt();
                  switch(n)
                  {
                        case 1: addContact(); break;
                        case 2: searchContact(); break;
                        case 3: deleteContact(); break;
                        case 4: modifyContact(); break;
                        case 5: displayAllContact(); break;
                        case 6: saveObject();break;
                        default: System.out.println("Incorrect Input");
                  }

            } while ( n != 6);


      }
}
