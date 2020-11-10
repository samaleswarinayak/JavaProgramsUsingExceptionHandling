/* Write a java program to create your own exception which creates insufficient fund exception
whenever an account holder in the bank wants to withdraw money greater than that he has in his
account? */

import java.util.*;
class MyException extends Exception
{
	int amt;
	MyException(int amt)
	{
		this.amt = amt ;
	}
	public String toString()
	{
		return("\nAmount greater than balance\nEnter amount less than Rs "+amt); 
	}
}
class WithdrawAccount
{
	public static void main(String args[])
	{
		try
		{
			int amt,withdraw;
			System.out.println("Welcome to Money Withdraw");
			System.out.print("Enter amount in your acoount Rs = ");
			Scanner sc = new Scanner(System.in);
			amt = sc.nextInt();
			System.out.print("Enter amount you want to withdraw Rs = ");
			withdraw = sc.nextInt();
			if(withdraw >amt)
			{
				throw new MyException(amt);
			}
			else 
			{
				System.out.println("Amount withdrawn Successfully");
			}
		}
		catch(MyException ob)
		{
			System.out.println("Exception Occured "+ob);
		}
		finally
		{
			System.out.println("Thank you , Come again");
		}
	}
}
