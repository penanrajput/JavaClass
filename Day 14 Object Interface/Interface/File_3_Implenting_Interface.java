interface A
{
      public void display();
}

interface B
{
      public void show();
}

class AB implements A, B
{
      public void display()
      {
            System.out.println("Inside AB display method");
      }

      public void show()
      {
            System.out.println("Inside AB show method");
      }
}




class File_3_Implenting_Interface
{
      public static void main(String[] args) {
            AB a = new AB();
            a.display();
            a.show();
      }
}
