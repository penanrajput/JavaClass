public class ClassObject
{
    private String f_name;
    private String l_name;

    ClassObject(){}
    ClassObject(String n, String m)
    {
        f_name = n;
        l_name = m;
    }
    public void display()
    {
        // System.out.println("Name -> " + f_name + " Last Name -> " + l_name);
        System.out.println(f_name + " " + l_name);
    }
    
    public static void main(String[] args) {
        ClassObject co1 = new ClassObject();
        ClassObject co2 = new ClassObject("Penan", "Rajput");
        ClassObject co3 = new ClassObject(new String("Chetan"), new String("Rajput"));
        co1.display();
        co2.display();
        co3.display();
    }
}