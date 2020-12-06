import java.util.*;

class ABC
{
	private int height, width, depth;
	ABC()
	{
	}
	/*
	ABC(int a, int b, int c)
	{
		height = a;
		width = b;
		depth = c;
	}
	*/

	public ABC(int height, int width, int depth)
	{
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public String toString()
	{
		return "ABC{height="+height+", width="+width+", depth="+depth+"}";
	}
	public void setHeight(int a)
	{
		height = a;
	}
}

class Test
{
	public static void main(String [] args)
	{
		/*
		// One object, two references
		ABC obj1 = new ABC(10, 20, 30);
		ABC obj2 = obj1;

		System.out.println("\nBefore setHeight(60)");
		System.out.println(obj1);
		System.out.println(obj2);

		System.out.println("\nAfter setHeight(60)");
		obj1.setHeight(60);
		System.out.println(obj1);
		System.out.println(obj2);
		*/

		ABC obj1 = null;
		System.out.println(obj1);
		ABC obj2 = new ABC();
		System.out.println(obj2);

	}
}