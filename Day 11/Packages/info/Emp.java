package info;

public class Emp
{
    private int emp_id;
    private String name;

    public Emp(int a, String b)
    {
        emp_id = a;
        name = b;
    }

    public void display()
    {
        System.out.println("Emp_id = " + emp_id);
        System.out.println("name = " + name);
    }
}