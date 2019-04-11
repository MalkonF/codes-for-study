public class MethodOverload
{
	public static void main(String[] args)
	{
		System.out.printf("Square of integer 7 is %d", square(7));
		System.out.printf("Square os double 7.5 is %f%n", square(7.5));
	}
	
	public static int square(int intValue)
	{
		System.out.printf("%nCalled square with int argument: %d%n",
  		intValue);
		return intValue * intValue;
	}

	public static double square(double doubleValue)
	{
		System.out.printf("%nCalled square with double argument: %f%n",
		doubleValue);
		return doubleValue * doubleValue;
	}
}
