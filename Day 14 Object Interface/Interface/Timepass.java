// https://www.javatpoint.com/interface-in-java

// Multiple Inheritace why possible in Interface
// interface Printable{
//       void print();
// }
//
// interface Showable{
//       void print();
// }
//
//
// class Timepass implements Printable, Showable
// {
//       public void print() // no ambiguity
//       {
//             System.out.println("Inside Timepass print method");
//       }
//        public static void main(String[] args) {
//              Timepass t = new Timepass();
//              t.print();
//        }
// }


// 2. Interface Inheritance
// interface Showable{
//       void print();
// }
//
// interface Walkable extends Showable
// {
//       void walk();
// }
//
// class Timepass implements Walkable
// {
//       public void walk()
//       {
//             System.out.println("Inside Timepass walk   method");
//       }
//       public void print() // no ambiguity
//       {
//             System.out.println("Inside Timepass print method");
//       }
//        public static void main(String[] args) {
//              Timepass t = new Timepass();
//              t.print();
//              t.walk();
//        }
// }


// Nested Interface in Java
interface Showable
{
      void print();
      interface Printable
      {
            void show();
      }
}

class Timepass implements Showable
{
      public void print()
      {
             System.out.println("Inside Timepass walk   method");
      }
      public void show()
      {
             System.out.println("Inside Timepass show   method");
      }
      public static void main(String[] args)
      {
                  Timepass t = new Timepass();
                  t.print();
                  t.show();
      }
}
