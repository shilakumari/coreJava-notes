package _4ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FinallyBlock6 {public static void main(String[] args) throws IOException{
	System.out.println("1");
	int b=0;

	try(FileInputStream ft=new FileInputStream("");){
		ft.hashCode();
	}
		
	try
	{
		System.out.println(10/b);
		int[] a=new int[5];
		System.out.println(a[0]);
	}	
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}		
	catch(RuntimeException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("finally block");
	}
	System.out.println("2");
}





}

