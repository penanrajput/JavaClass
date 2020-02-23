class Emp
{
    public void show()
    {
        System.out.println("In Employee Class show function");
    }
}
class Student
{
    public void show()
    {
        System.out.println("In Student Class show function");
    }
}

class Test
{
    public static void main(String[] args) {
        Emp e = new Emp();
        Student s = new Student();
        e.show();
        s.show();
    }
}