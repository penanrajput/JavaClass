// Program 4 : Integer Object Linked List

import java.util.*;

class TestIntegerLinkedHashSet
{
      // insertion order : true
      // no duplicates = unique

      public static void main(String[] args) {
            // declaration
            LinkedHashSet <Integer> hs = new LinkedHashSet<Integer>();

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
