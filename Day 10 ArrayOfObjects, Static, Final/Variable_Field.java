
// Variable is inside funtion, not default intialised if not explicitely initalised -> so generates error
// Field is inside class, default initialised if not explicitely initialised -> not generate error

class Student
{

    // below are fields
    // default iniatialised if not explicitely initialised
    int roll;
    String name;
    double marks;

    public void getData()
    {
        // error -> x should be initialised
        // x is variable
        // int x;
        // System.out.println(x);
    }

    public void putData()
    {
        System.out.println("\tROLL_NO\t\tNAME\t\tMARKS");
        System.out.println("\t"+roll+"\t\t" + name + "\t\t" + marks);
    }



}


class Variable_Field
{
    
    public static void main(String[] args) {

        // // error
        // int x;
        // System.out.println(x);    

        Student s = new Student();
        s.putData();

    
    }
}