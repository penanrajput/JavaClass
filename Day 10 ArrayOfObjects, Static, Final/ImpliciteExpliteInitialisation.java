import java.util.*;


// class for demonstrating the implicite initialisation
class Emp
{
    // implicite declarration of fields -> default is set
    int emp_id;
    String name;
    double salary;
    
    public void getData()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter EMP_ID : ");
        emp_id = in.nextInt();
        System.out.println("Enter NAME : ");
        name = in.next();
        System.out.println("ENTER SALARY : ");
        salary = in.nextDouble();
        
    }
    public void putData()
    {
        System.out.println("\t"+emp_id+"\t\t" + name + "\t\t" + salary);

    }
}

// class for demonstrating the explicite initialisation
class Student
{
    // explicite initialisation of fields in class 
    int roll_no = 10;
    String name = "PENAN";
    double marks = 90.0;

    public void getData()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ROLL_NO : ");
        roll_no = in.nextInt();
        System.out.println("Enter NAME : ");
        name = in.next();
        System.out.println("ENTER MARKS : ");
        marks = in.nextDouble();
        
    }
    public void putData()
    {
        System.out.println("\t"+roll_no+"\t\t" + name + "\t\t" + marks);

    }

}

public class ImpliciteExpliteInitialisation
{

    public static void main(String[] args) {
        Emp e = new Emp();
        e.putData();
    }

    // public static void main(String[] args) {
    //     Student s = new Student();
    //     s.putData();
    // }
}