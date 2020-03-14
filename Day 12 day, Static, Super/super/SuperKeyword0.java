class A
{
        int i;
        void showIA()
        {
             System.out.println("The value of i in A class " + i);
        }
}

class B extends A
{
        int i;
        B(int a, int b)
        {
             i = a;
       }
       void showIB()
       {
            System.out.println("The value of i in B class " + i);
       }
}
class SuperKeyword0
{
        public static void main(String[] args)
        {
             B b = new B(45, 90);
             b.showIA();
             b.showIB();

        }
}
