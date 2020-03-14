import java.util.Scanner;

//static methods only static fields inside it
// call by Class name
// parameters can be instances 
// but variables inside static method should be static only

class Student {
    int roll_no;
    String name;
    double marks;
    private static String college = "SSGB";

    public void getData() {
        System.out.println("Enter roll_no, name, marks, (college=SSGB)");
        Scanner in = new Scanner(System.in);
        roll_no = in.nextInt();
        name = in.next();
        marks = in.nextDouble();
        // college = in.next(); // no need
        
    }

    public void putData() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\t" + roll_no + "\t\t" + name + "\t\t" + marks + "\t\t" + college);
        System.out.println("--------------------------------------------------------------------");
    }

    // making this class static
    public static void changeCollege(String changedCollegeName) {
        // static method can only refer to static variables, else error will occur
        college = changedCollegeName;

    }
}


public class StaticFinal2
{   
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getData();
        s1.putData();
        Student.changeCollege("PVR");
        Student s2 = new Student();
        s2.getData();
        s2.putData();
    }
    
}