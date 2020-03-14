

class Test

{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i=0; i<args.length; i++)
		{
			try
			{
				int n = Integer.parseInt(args[i]);
				sum = sum + n;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid Number : " + args[i]);
			}


		}
		System.out.println("Sum = " + sum);
	}
}