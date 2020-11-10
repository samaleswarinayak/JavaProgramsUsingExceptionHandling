/* Write a java program to create a user-defined exception called NameFormatException. The
program should read a name from the user and throw NameFormatException if the entered name
contains any character other than the English alphabets. */
import java.util.*;
class NameFormatException extends Exception
{
	char ch;
	NameFormatException(char ch)
	{
		this.ch = ch;
	}
	public String toString()
	{
		return("as it contains "+ch);
		
	}
}
class TestNameFormatException
{		
	static void validate(String str) throws NameFormatException
	{
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i) >= 65 &&str.charAt(i) <= 90){}
			else
			{
				if(str.charAt(i) >= 97 &&str.charAt(i) <= 122){}
				else
				{
					throw new NameFormatException(str.charAt(i));
					
				}
			}
		}
		System.out.println("Name contains only Alphabets");
	}
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Name : ");
			String str = sc.nextLine();
			validate(str);
		}
		catch(NameFormatException ob)
		{
			System.out.println("Invalid Name format "+ob);
		}
	}
}
