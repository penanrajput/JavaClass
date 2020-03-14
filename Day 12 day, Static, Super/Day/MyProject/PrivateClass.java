// import info.*;

// private member access demo
// class can never be PrivateClass

/*
private class PrivateClassDemo
{

}
*/
class Animal
{
  private int i=10;
  private void getIPrivate()
  {

    System.out.println("Value of i = "+ i);
  }
  void getIPublic()
  {
    // used of private member inside same class
    System.out.println("Value of i = "+ i);
    i = i + 10; // this is  valid
    getIPrivate(); // this is  valid, to call private method inside method of same class
  }
}


class PrivateClass
{

    public static void main(String[] args) {
        Animal a = new Animal();
        // cant access outside class
        // a.i=20; // error
        // a.getIPrivate(); // error
        a.getIPublic();


    }
}
