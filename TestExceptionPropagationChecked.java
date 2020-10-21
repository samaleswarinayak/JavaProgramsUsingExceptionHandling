/*Use of exception Propagation*/

import java.io.*;
class TestExceptionPropagationChecked
{  
  void fun1() throws IOException
  {  
    throw new IOException();  
  }  
  void fun2() throws IOException
  {  
    fun1();  
  }  
  void fun3()
  {  
   try
   {  
    fun2();  
   }
   catch(Exception ob)
   {
	   System.out.println("Exception is handled");
   }  
  }  
  public static void main(String args[])
  {  
   TestExceptionPropagationChecked obj=new TestExceptionPropagationChecked();  
   obj.fun3();  
   System.out.println("Program Over");  
  }  
}  