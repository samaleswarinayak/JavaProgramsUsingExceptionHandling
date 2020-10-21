/*Use of finally block in exception handling mechanism of Java*/

import java.util.*;
class TestExceptionHandlingFinally
{
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
			res = no1/no2;
			System.out.println("Result is "+res);
			System.out.println("Hello I am inside the try block");
		}
		catch(ArithmeticException ob)
		{
			System.out.println("Cannot divide by zero");
			System.out.println(ob);
		}
		finally
		{
			System.out.println("Finally Block");
		}
		System.out.println("Program Over");
		System.out.println("Hello I am outside the try block");	
	}
}