/*Use of nested try catch blocks in exception handling mechanism of Java*/

import java.util.*;
class TestExceptionHandlingNestedtrycatch
{
	public static void main(String args[])
	{
		try//Outer try block
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
			try//Ineer try block
			{
				String str = "Shree";
				System.out.println("Length of String is "+str.length());
				int arr[] = {1,3,5};
				System.out.println("The value of array is "+arr[5]);
			}
			catch(NullPointerException ob)//Outer try block
			{
				System.out.println("String value is null");
				System.out.println(ob);
			}
		}
		catch(NumberFormatException ob)//Inner catch block
		{
			System.out.println("Cannot divide by zero");
			System.out.println(ob);
		}
		
		catch(ArithmeticException ob)//Inner catch block
		{
			System.out.println("Cannot divide by zero");
			System.out.println(ob);
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
			System.out.println("Array index out of boundary");
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