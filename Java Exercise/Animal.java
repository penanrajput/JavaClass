public class Animal
{
    String animal_name;
    Animal()
    {
        animal_name = null;
    }
    Animal ( String name1, String name2)
    {
        animal_name = name2;
    }
    public void make_stomach_empty()
    {
        String stomach_contents ="";
    }
    public void  feed()
    {
        if ( stomach_contents.length() == 0 )
        {

        } 
    }

    // public String make_speak()
    // {
    //     return "Hello, I am a cat called "+animal_name+".\nI have eaten: ...";
    // } 
    public String make_speak()
    {
        if(animal_name.equals(""))
            return "Hello, I am a default animal called no name.";
        
        else
            return "Hello, I am ...\nMy stomach is empty.";
    } 
    public String get_name(){
        return animal_name;
    }
    Animal (Animal a)
    {
        animal_name = a.get_name();
    }
    public static void main(String[] args) {
        Animal named_cat = new Animal( "cat", "Ludwig" ) ;
        System.out.println( named_cat.make_speak());
    }
}