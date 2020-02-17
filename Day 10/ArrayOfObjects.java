import java.util.*;

class Emp
{
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

public class  ArrayOfObjects
{
    public static void main(String[] args) {
            
        // --------------------------------------------------------------
        // null pointer exception 
        // means you created reference of object but not object
        // means you created object for object but not created the object
        // Emp [] s = new Emp[1];
        

        // for(int i=0; i<s.length; i++)
        // {
        //     // s[i] = new Emp(); // null pointer exception
        //     s[i].getData();

        // }

        // System.out.println("\tEMP_ID\t\tNAME\t\tSALARY");
        // for(Emp e:s)
        // {
        //     e.putData();
        // }

        // ------------------------------------------------
        // proper program
        
    //     Emp [] s = new Emp[1];
        

    //     for(int i=0; i<s.length; i++)
    //     {
    //         s[i] = new Emp();
    //         s[i].getData();

    //     }

    //     System.out.println("\tEMP_ID\t\tNAME\t\tSALARY");
    //     for(Emp e:s)
    //     {
    //         e.putData();
    //     }
    // }
    
    // ----------------------------------------------------------------
    // 

}