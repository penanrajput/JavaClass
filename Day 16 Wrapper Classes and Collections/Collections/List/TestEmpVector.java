import java.util.Vector;
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
            return "(Name:" + name + ",Number:" + no + ")" ;
      }
}


class TestEmpVector
{
      public static void main(String[] args) {
                  Vector<Emp> v = new Vector<Emp>();
                  v.add(new Emp("Akshay", 400));
                  v.add(new Emp("Atul", 541));
                  v.add(new Emp("ajay", 233));
                  v.add(new Emp("penu", 532));

                  System.out.println(v);

      }
}
