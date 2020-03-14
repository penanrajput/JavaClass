// Program 4 : Integer Object Linked List

import java.util.*;

class TestIntegerTree
{
      // Red Black Tree1
      // sorted order : true
      // no duplicates = unique

      public static void main(String[] args) {
            // declaration
            TreeSet <Integer> hs = new TreeSet<Integer>();

            // first function add(Object)
            hs.add(40);
            hs.add(30);
            hs.add(20);
            hs.add(10);
            System.out.println(hs);
            System.out.println("Size -> " + hs.size());

            hs.remove(40);
            hs.remove(10);
            System.out.println(hs);
            System.out.println("Size -> " + hs.size());



      }
}
