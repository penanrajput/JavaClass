package com.penan;

import java.io.*;

public class Addition
{
      int x;
      int y;
      public Addition(int a, int b)
      {
            x = a;
            y = b;
      }
      public String toString()
      {
            return "Addition of " + x + " and " + y + " = " + (x+y)+ " ";
      }
      public int addTwo(int a, int b)
      {
            // try
            // {
                  if(a<0 || b<0)
                        throw new ArithmeticException("negative arguments ");

            // }
            // catch(ArithmeticException e)
            // {
            //       System.out.println("Caught exception in Additon Class add method");
            // }
            return (a+b);
      }

}
