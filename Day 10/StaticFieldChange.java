import java.util.*;

class Student
{
    int roll_no;
    String name;
    double marks;
    static private String college = "SSGB";

    public void getData()
    {
        System.out.println("Enter roll_no, name, marks, (college=SSGB)");
        Scanner in = new Scanner(System.in);
        roll_no =  in.nextInt();
        name = in.next();
        marks = in.nextDouble();
        // college = in.next(); // no need
        
    }

    public void putData()
    {
        System.out.println("\t"+roll_no+"\t\t" + name + "\t\t" + marks+ "\t\t"+college);
    }

    public void changeCollege(String changedCollegeName)
    {
        college = changedCollegeName;
    }
}


public class StaticFieldChange
{
    
    public static void main(String[] args) {
        Student[] s = new Student[3];
       for(int i=0; i<s.length; i++)
       {
           s[i] = new Student();
           s[i].getData();
       }
       System.out.println("\n\n\t\t BEFORE CHANGING COLLEGE NAME");
       for(Student v : s)
       {
           v.putData();
       }
       System.out.println("\n\n\t\t AFTER CHANGING COLLEGE NAME");

       // this kind of statement can make life of programmer worse
       // that changes all behaviour of static 
       // so we introduce keyowrd final
       s[0].changeCollege("PVR");

       for(Student v : s)
       {
           v.putData();
       }

    }
}