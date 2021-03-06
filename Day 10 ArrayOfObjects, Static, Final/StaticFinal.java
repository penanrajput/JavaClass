import java.util.Scanner;

class Student {
    int roll_no;
    String name;
    double marks;
    final static private String college = "SSGB";

    public void getData() {
        System.out.println("Enter roll_no, name, marks, (college=SSGB)");
        Scanner in = new Scanner(System.in);
        roll_no = in.nextInt();
        name = in.next();
        marks = in.nextDouble();
        // college = in.next(); // no need
        
    }

    public void putData() {
        System.out.println("\t" + roll_no + "\t\t" + name + "\t\t" + marks + "\t\t" + college);
    }

    public void changeCollege(String changedCollegeName) {
        // final can't be assigned to any other value
        // college = changedCollegeName; // this will not also work

    }
}

public class StaticFinal {
    public static void main(String[] args) {
        Student[] s = new Student[3];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
            s[i].getData();
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println
        ("STUDENT DATA");

        System.out.println("--------------------------------------------------------------------");
      
        System.out.println("\tMARKS\t\tNAME\t\tMARKS\t\tCOLLEGE");
        System.out.println("--------------------------------------------------------------------");
        for (Student v : s) {
            v.putData();
        }
        // System.out.println("\n\n\t\t AFTER CHANGING COLLEGE NAME");

        // so we introduce keyword final
        // s[0].changeCollege("PVR"); 
        // advantage is that final doesn't let change the value
        // and static creates single copy of field and shared commonly between different objects
        // so we introduce the concept of static final or final static, order doesn't
        // matter

        // for(Student v : s)
        // {
        // v.putData();
        // }
    }
}
