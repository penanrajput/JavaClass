import java.lang.*;
import java.io.*;
import java.util.*;

class Test {
	public static int getMaxIndex(Vector arr)
    {
       	int max = -999999;
		int index = -1;
		for(int  i=0; i<arr.size(); i++)
       	{
			int x = (int)arr.get(i);
			if(max < x )
            {
		        max = x;
				index = i;
            }
		}
        return index;
    }
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);

		// System.out.print("Enter the no. of elements : ");
		int n = in.nextInt();
		// System.out.print("Enter the elements : ");
    	Vector<Integer> arr = new Vector<Integer>();
    	for(int i=0; i<n; i++)
    		    arr.add(in.nextInt());
        int maxIndex = getMaxIndex(arr);
    	arr.remove(maxIndex);
		maxIndex = getMaxIndex(arr);
    	arr.remove(maxIndex);

    	for(int i=0; i<arr.size(); i++)
    	{

    		    System.out.print(arr.get(i) + " ");
    	}
		System.out.println();
	}
}