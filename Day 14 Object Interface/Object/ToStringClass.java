// Program No. 5
/*
class Emp
{
      String name;
      int no;
      Emp(String s, int n)
      {
            name = s;
            no = n;
      }
}


class ToStringClass
{
      public static void main(String[] args) {
            Emp e = new Emp("Ajay", 1203);
            System.out.println(e); // ClassName@HexLocation
      }
}
*/

class Emp
{
      String name;
      int no;
      Emp(String s, int n)
      {
            name = s;
            no = n;
      }
      public String toString()
      {
            return "[Name: " + name + ", Number: " + no + "]" ;
      }
}


class ToStringClass
{
      public static void main(String[] args) {
            Emp e = new Emp("Ajay", 1203);
            System.out.println(e); // Overridden toString Methods call
      }
}
