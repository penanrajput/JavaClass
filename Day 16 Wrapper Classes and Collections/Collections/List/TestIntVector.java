import java.util.*;

class TestIntVector
{
      public static void main(String[] args) {
            // declaration
            Vector <Integer> v = new Vector<Integer>();

            // first function add(Object)
            v.add(40);
            v.add(30);
            v.add(20);
            v.add(10);
            System.out.println(v);


            // for(int x : v)
            //       System.out.print(x + "  ");
            // System.out.println();

            // Exploring other methods of collection
            // add(index, Object)
            v.add(1, 60); //(index, Object);
            System.out.println("After add(1, 60)        : "  + v);

            // remove Object at index
            // remove(index)
            v.remove(2);
            System.out.println("After delete at index 2 : " + v);

            // Searching
            // contains(Object)
            System.out.println("contains 40             : " + v.contains(40));

            // find out index of Object
            // indexOf (Object);
            System.out.println("index of 10 -> " + v.indexOf(10));

            // find out value at index
            // get(index )
            System.out.println("value at index 2 -> " + v.get(2));

            System.out.println("Before Change : Vector   -> " + v);
            // change the Object at specified index
            // set(index, Obj)
            v.set(2, 100);
            System.out.println("After Change  : Vector   -> " + v);


            System.out.println("Vector   -> " + v);
            System.out.println("Size     -> " + v.size());
            System.out.println("Capacity -> " + v.capacity());


      }
}
