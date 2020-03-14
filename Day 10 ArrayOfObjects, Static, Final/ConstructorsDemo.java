import java.util.Scanner;

//static methods only static fields inside it
// call by Class name
// parameters can be instances 
// but variables inside static method should be static only
/*
// default constructor is called there is no constructor
class Student {
    int roll_no;
    String name;
    double marks;
    private static String college = "SSGB";

    public void putData() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\t" + roll_no + "\t\t" + name + "\t\t" + marks + "\t\t" + college);

    }
}



public class ConstructorsDemo
{
    public static void main(String[] args) {
        Student s = new Student(); // default Constructor is called 
        s.putData();
    }
} 

*/

/*
class Student {
    int roll_no;
    String name;
    double marks;
    private static String college = "SSGB";

    Student()
    {
        System.out.println("Default constructor is called");
    }

    public void putData() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\t" + roll_no + "\t\t" + name + "\t\t" + marks + "\t\t" + college);

    }
}



public class ConstructorsDemo
{
    public static void main(String[] args) {
        Student s = new Student(); // default Constructor is called 
        s.putData();
    }
} 

*/

/*
class Student {
    int roll_no;
    String name;
    double marks;
    private static String college = "SSGB";
    Student (int r, String n, double d)
    {
        roll_no = r;
        name = n;
        marks = d;
    }
    public void putData() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\t" + roll_no + "\t\t" + name + "\t\t" + marks + "\t\t" + college);

    }
}



public class ConstructorsDemo
{
    public static void main(String[] args) {\
    //     required: int,String,double
    //     found: no arguments
    //     reason: actual and formal argument lists differ in length
    //   1 error
        Student s = new Student();
        // reason when there is parameterized and no default constructor 
        // then error occurs because if one is present then default can't be called
        s.putData();
    }
} 
*/

class Student {
    int roll_no;
    String name;
    double marks;
    private static String college = "SSGB";

    Student()
    {
        System.out.println("Inside Default constructor");
    }


    Student (int r, String n, double d)
    {
        roll_no = r;
        name = n;
        marks = d;
    }
    public void putData() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\t" + roll_no + "\t\t" + name + "\t\t" + marks + "\t\t" + college);

    }
}



public class ConstructorsDemo
{
    public static void main(String[] args) {
   
        Student s1 = new Student();
        s1.putData();

        Student s2 = new Student(30, "PENAN", 9.41);
        s2.putData();
    }
} 
