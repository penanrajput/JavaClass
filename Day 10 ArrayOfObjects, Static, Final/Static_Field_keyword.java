import java.util.Scanner;

// This class taked everytime input college name as SSGB which is time consuming
// class Student
// {
//     int roll_no;
//     String name;
//     double marks;
//     String college;
   
//     public void getData()
//     {
//         System.out.println("Enter roll_no, name, marks, college");
//         Scanner in = new Scanner(System.in);
//         roll_no =  in.nextInt();
//         name = in.next();
//         marks = in.nextDouble();
//         college = in.next();
        
//     }

//     public void putData()
//     {
//         System.out.println("\t"+roll_no+"\t\t" + name + "\t\t" + marks+ "\t\t"+college);
//     }

// }

class Student
{
    int roll_no;
    String name;
    double marks;
    static String college = "SSGB";

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
}





class Static_Field_keyword
{
    public static void main(String[] args) {
       Student s = new Student ();
       
       s.getData();
       System.out.println("--------------------------------------------------------------------------");
       System.out.println("\tROLL_NO\t\tNAME\t\tMARKS\t\tCOLLEGE");
       System.out.println("--------------------------------------------------------------------------");
       s.putData();

    }
}




// Advantage of having static method 
// 4 fields 
// int 4 bytes
// double 8 bytes
// int 4 bytes 

// total 4+4+8 = 16


// 1000 objects 
// everytime we create objects, field memory is allocated

// 16*1000 = 16000

// if make int 4 bytes static
// only one location is created and shared commonly between all objects
// 4 + 8 = 12
// 12 * 1000 = 12000
// 12000 + 4 = 12004

