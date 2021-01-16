package _6Multithreading._1Basics;
class Display
{
	synchronized public void wish(String name)
	{
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Good Morning ");
			try
			{
				Thread.sleep(100 );
			}
			catch(InterruptedException e)
			{
			}
			System.out.println(name);
		}
		//
	}
}



