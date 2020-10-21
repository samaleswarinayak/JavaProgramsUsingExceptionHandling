/*Use of exception handling mechanism in Java*/

import java.util.*;
class TestExceptionHandling11
{
	static void sum(int a, int b) throws ArithmeticException
	{
		int res;
		res = a/b;
		System.out.println("Result is "+res);
	}
	public static void main(String args[])
	{
		try
		{
			int no1,no2,res;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first value");
			no1 = sc.nextInt();
			System.out.println("Enter the second value");
			no2 = sc.nextInt();
			TestExceptionHandling11.sum(no1,no2);
			System.out.println("Hello I am inside the try block");
		}
		catch(ArithmeticException ob)
		{
			System.out.println("Cannot divide by zero");
			System.out.println(ob);
		}
		System.out.println("Program Over");
		System.out.println("Hello I am outside the try block");
		
	}
}