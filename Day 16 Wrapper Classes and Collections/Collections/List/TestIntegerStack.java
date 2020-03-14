// Program 4 : Integer Object Linked List

import java.util.*;

class TestIntegerStack
{
      public static void main(String[] args) {
            // declaration
            Stack <Integer> s = new Stack<Integer>();

            // first function add(Object)
            s.push(40);
            s.push(30);
            s.push(20);
            s.push(10);
            System.out.println(s);
            System.out.println("Size -> " + s.size());

            s.pop();
            s.pop();
            System.out.println(s);
            System.out.println("Size -> " + s.size());
            // System.out.println("Capacity -> " + l.capacity());

            // search() == indexOf()
            // search(Object o)
            System.out.println(s.search(new Integer(30)));
            // System.out.println(s.indexOF(30));



      }
}
