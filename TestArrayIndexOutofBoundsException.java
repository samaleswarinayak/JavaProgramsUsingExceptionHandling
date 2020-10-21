/* ArrayIndexOutofBounds Exception in Java */

class TestArrayIndexOutofBoundsException
{
	public static void main(String args[])
	{
		float arr[] = new float[5];
		arr[10]= 25.5f;
		System.out.println(arr[1]);
	}
}