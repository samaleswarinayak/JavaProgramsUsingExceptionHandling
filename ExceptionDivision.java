/* Write a java program to read two numbers aand b and calculate a/(a-b). The program should
check the value of a-b before dividing with a, itshould throw an exception if a-b is zero. In the
exception handler the program should displayappropriate message to the user. */
import java.util.*;
class ExceptionDivision
{
	public static void main(String args[])
	{
		try 
		{
			double a,b,res;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Value of a : ");
			a = sc.nextInt();
			System.out.print("Enter Value of b : ");
			b = sc.nextInt();
			if(a==b)
			{
				throw new ArithmeticException(); 
			}
			else
			{
				res = a/(a-b);
				System.out.println("a/(a-b) = "+res);
			}
		}
		catch(ArithmeticException ob)
		{
			System.out.println("As a=b , therefore cannot divide by zero");
		}
	}
}
