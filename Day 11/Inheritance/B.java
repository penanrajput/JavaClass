class A
{
    int x;
    void setX( int a )
    {
        x = a;
    }

    public void showX()
    {
        System.out.println("Show the value of x -> "+x);
    }


}

// we inherit means we add those things that's it
/*
class B extends A 
{
    int y;
    void setY(int a)
    {
        y = a;
    }
    void display()
    {
        System.out.println("the value of x -> " + x);
        System.out.println("the value of y -> " + y);
    }
    public static void main(String[] args) {
        B b = new B();
        b.setX(40);
        b.setY(60);
        b.display();        
        System.out.println("value of x -> " + b.x);
        System.out.println("value of x -> " + b.y);
    }
}
*/
class B extends A 
{
    int y;
    void setY(int a)
    {
        y = a;
    }
    void display()
    {
        System.out.println("the value of x -> " + x);
        System.out.println("the value of y -> " + y);
    }
    public static void main(String[] args) {
        B b = new B();
        b.setX(40);
        b.setY(60);
        b.display();        
        System.out.println("value of x -> " + b.x);
        System.out.println("value of y -> " + b.y);

        A a = new A();
        a.setX(89);
        a.showX();
    }

    
}