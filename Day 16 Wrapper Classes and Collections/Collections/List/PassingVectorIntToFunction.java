import java.util.*;


class PassingVectorIntToFunction
{
	// Type no need to be given of vector
	// passToFunction(Vector<Integer> v is invalid)
	public static void passToFunction(Vector v)
	{
		// System.out.println(v);
		System.out.println("value at index 5 : " + (int)v.get(5)); // Typecasting is must

	}

	public static void main(String [] args)
	{
		Vector<Integer> vect = new Vector<Integer>();
		vect.add(40);
		vect.add(20);
		vect.add(10);
		vect.add(50);
		vect.add(90);
		vect.add(80);
		// System.out.println(vect);
		System.out.println("value at index 5 : " + vect.get(5));
		passToFunction(vect);


	}
}