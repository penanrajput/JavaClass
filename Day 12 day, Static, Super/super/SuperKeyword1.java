class A
{
        int x;
        void setX(int a)
        {
                x = a;
        }
}

class B extends A
{
        int y;
        void setY(int a, int b)
        {
                super.x = a;
                y = b;
        }

        void display()
        {
             System.out.println("the x = > " + x);
             System.out.println("the y = > " + y);
       }
}
class SuperKeyword1
{
        public static void main(String[] args)
        {
             B b = new B();
             b.setY(40, 50);
             b.display();

        }
}
