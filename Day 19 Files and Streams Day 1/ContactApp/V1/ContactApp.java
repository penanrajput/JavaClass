import java.util.*;
import java.io.*;

class Contact implements Serializable
{
      String firstName;
      String lastName;
      // String state;

      String email;
      long mobile;

      Contact(String a, String b, String c, long d)
      {
            firstName = a;
            lastName = b;
            email = c;
            mobile = d;
      }
      void display()
      {
            System.out.println("\t" + firstName + "\t\t" + lastName + "\t\t" + email + "\t\t" + mobile);
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

      public static void addContact() throws FileNotFoundException, IOException, ClassNotFoundException
      {

             ObjectInputStream fin =  fin = new ObjectInputStream(new FileInputStream("App.dat"));

            try
            {
                  @SuppressWarnings("unchecked")
                   Vector<Contact> v  = (Vector<Contact>)fin.readObject();
                   ObjectOutputStream fout  = new ObjectOutputStream(new FileOutputStream("App.dat"));

                  System.out.println("Enter Contact Detail: ");
                  System.out.print("Enter FirstName : ");


                  String firstName = in.next();
                  System.out.print("Enter LastName  : ");
                  String lastName = in.next();
                  System.out.print("Enter Email     : ");
                  String email = in.next();
                  System.out.print("Enter Mobile    : ");
                  long mobile = in.nextLong();

                  v.add(new Contact(firstName, lastName, email, mobile));
                  fout.writeObject(v);
            }
            catch(Exception e )
            {
                  System.out.println("EOF FIle");
            }


      }

      public static void searchContact() throws FileNotFoundException, IOException, ClassNotFoundException
      {
             ObjectInputStream fin =  fin = new ObjectInputStream(new FileInputStream("App.dat"));
            @SuppressWarnings("unchecked")
             Vector<Contact> v  = (Vector<Contact>)fin.readObject();

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

      public static void deleteContact()  throws FileNotFoundException, IOException, ClassNotFoundException
      {
             ObjectInputStream fin =  fin = new ObjectInputStream(new FileInputStream("App.dat"));
            @SuppressWarnings("unchecked")
             Vector<Contact> v = (Vector<Contact>)fin.readObject();
             ObjectOutputStream fout  = new ObjectOutputStream(new FileOutputStream("App.dat"));

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
            fout.writeObject(v);
      }

      public static void modifyContact()  throws FileNotFoundException, IOException, ClassNotFoundException
      {
             ObjectInputStream fin =  fin = new ObjectInputStream(new FileInputStream("App.dat"));
            @SuppressWarnings("unchecked")
             Vector<Contact> v = (Vector<Contact>)fin.readObject();
             ObjectOutputStream fout  = new ObjectOutputStream(new FileOutputStream("App.dat"));

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
                        System.out.println("\tFirstName\tLastName\tEmail\t\tMobile");
                        c.modifyName(changedName);
                        c.display();
                        counter =  true;
                  }
            }
            if(!counter)
            {
                  System.out.println("Cannot Modify. Reason: NotFoundContact");
            }
            fout.writeObject(v);
      }

      public static void displayAllContact() throws FileNotFoundException, IOException, ClassNotFoundException
      {
             ObjectInputStream fin =  fin = new ObjectInputStream(new FileInputStream("App.dat"));
            @SuppressWarnings("unchecked")
             Vector<Contact> v = (Vector<Contact>)fin.readObject();

            if(v.size() != 0)
            {
                  System.out.println("\tFirstName\tLastName\tEmail\t\tMobile");
                  for(Contact c:v)
                  {
                        c.display();
                        System.out.println("-----------------------------------------------------------------------------------");
                  }

            }
            else
            {
                  System.out.println("No Contact Found!");
            }
      }


      public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
            int n;
            Vector <Contact> v = new Vector<Contact>();
            ObjectOutputStream fout  = new ObjectOutputStream(new FileOutputStream("App.dat"));
            v.add(new Contact("penan", "Rajput", "NA", 7020140334L));
            fout.writeObject(v);
            fout.close();


            ContactApp cp = new ContactApp();

            do
            {
                  System.out.println("\n\nMenu : Enter your Input");
                  System.out.println("1. Add Contact");
                  System.out.println("2. Search Contact");
                  System.out.println("3. Delete Contact");
                  System.out.println("4. Modify Contact");
                  System.out.println("5. Display All Contact");
                  System.out.println("6. Exit");
                  n = in.nextInt();
                  switch(n)
                  {
                        case 1: cp.addContact(); break;
                        case 2: cp.searchContact(); break;
                        case 3: cp.deleteContact(); break;
                        case 4: cp.modifyContact(); break;
                        case 5: cp.displayAllContact(); break;
                        case 6: System.exit(0);
                        default: System.out.println("Incorrect Input");
                  }

            } while ( n != 6);


      }
}
