import java.util.Scanner;

class Student
{
    private String name;
    private double marks;

    void getData(String s, double m)
    {
        name = s;
        marks = m;
    }
    void getData()
    {
        Scanner in = new Scanner(System.in);
        name = in.next();
        marks = in.nextDouble();
    }
    void putData()
    {
        System.out.println("Name is   "+name);
        System.out.println("Marks are "+marks);
    }
    double getMarks()
    {
        return marks;
    }

    public String getName() {
        return name;
    }


}

public class Assignment extends Student
{


    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        // s1.getData("Akash", 600);
        // s2.getData("Penan", 100);
        s1.getData();
        s2.getData();

        String name = s1.getMarks() > s2.getMarks() ? s1.getName() : s2.getName(); 
        System.out.println("Name of Student with high marks : " + name);

    }
}