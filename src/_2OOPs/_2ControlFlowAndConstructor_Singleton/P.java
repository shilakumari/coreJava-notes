package _2OOPs._2ControlFlowAndConstructor_Singleton;
class P
{
	int i=10;//4,15
	{//5
		m1();//16
		System.out.println("Parent instance block");//18
	}
	P()//6,20
	{
		System.out.println("Parent constructor");
	}
	public static void main(String [] args)//1
	{
		P p=new P();
		System.out.println("Parent main()");
	}
	public void m1()//7
	{
		System.out.println(j);//17
	}
	int j=20;//8,19
}
