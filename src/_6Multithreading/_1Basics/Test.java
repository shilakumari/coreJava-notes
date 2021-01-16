package _6Multithreading._1Basics;
class Test
{
	public static void main(String args[])////executed by main thread
	{
		MyThread t=new MyThread();//thread instantiation
		
		
		t.start();//starting of a thread

		for(int i=0;i<=10;i++)
		{
			System.out.println("main Thread");
		}
	}
}
class MyThread extends Thread//Defining a thread
{
	//start(){  1000000 lines of code}
	
	public void run() //Job of thread,executed by child thread
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Child Thread");
		}
	}	
}


