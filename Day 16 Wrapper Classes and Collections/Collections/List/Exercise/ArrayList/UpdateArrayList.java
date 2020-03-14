import java.util.*;

class UpdateArrayList
{

      public static void main(String[] args) {
            Scanner in = new Scanner (System.in);

            ArrayList <Integer> ar = new ArrayList<Integer>();
            ar.add(60);
            ar.add(10);
            ar.add(20);
            ar.add(30);
            ar.add(40);
            ar.add(100);
            System.out.println(ar);

            System.out.print("Enter the number to be updated: ");
            int n = in.nextInt();
            int n_index = ar.indexOf(n);
            System.out.print("Enter the new number : ");
            int n_new = in.nextInt();

            ar.set(n_index, n_new);
            System.out.println(ar);

      }
}
