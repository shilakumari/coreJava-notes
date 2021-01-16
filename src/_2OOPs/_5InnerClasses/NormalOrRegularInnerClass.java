package _2OOPs._5InnerClasses;

public class NormalOrRegularInnerClass {
	static int x = 10;

	class Inner {
		int x = 100;

		public void m1() {
			int x = 1000;
			System.out.println(x);// 1000
			System.out.println(this.x);// 100
			System.out.println(NormalOrRegularInnerClass.this.x);// 10
		}
	}

	public static void main(String args[]) {
		//new NormalOrRegularInnerClass().new Inner().m1();
		
		
		new Thread(){
			int x=10;
			public void run(){
				System.out.println("hiii"+x);
			}
		}.start();
	}
}
