
// abstract class is called partially implemented class
abstract class Shape
{
    double dim1, dim2;
    // Shape(double a, double b)
    // {
    //     dim1 = a;
    //     dim2 = b;

    // }

    // rule 1: at least one abstract method
    abstract void area();
}

class Rectangle extends Shape
{
    Rectangle(double a, double b)
    {
        dim1 = a;
        dim2 = b;
    }
    void area()
    {
        System.out.println("Area is of Rectangle " + (dim1*dim2));
    }
}

class Circle extends Shape
{
    Circle(double a, double b)
    {
        dim1 = a;
    }
    void area()
    {
        System.out.println("Area is of Circle " + (3.14*dim1*dim1));
    }
}

class Triangle extends Shape
{
    Triangle(double a, double b)
    {
        dim1 = a;
        dim2 = b;
    }
    void area()
    {
        System.out.println("Area is of Triangle " + (.5* dim1*dim2));
    }
}

class Test_2
{
    public static void main(String[] args) {
        Shape s; // Shape refernce only

        // rule 2: you cannot create object of abstract class
        // s = new Shape();

        s = new Rectangle(10, 20);
        s.area();

        s = new Circle(10, 20);
        s.area();

        s = new Triangle(10, 20);
        s.area();
    }
}
