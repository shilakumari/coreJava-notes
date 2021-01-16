package _2OOPs._9GarbageCollector;

public class FinalizeMethodDemo {
	static FinalizeMethodDemo s;
	public static void main(String[] args) throws InterruptedException {
		FinalizeMethodDemo f = new FinalizeMethodDemo();

		System.out.println(f.hashCode());
		f = null;
		System.gc();
		Thread.sleep(2000);

		System.out.println(s.hashCode());
		s = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println("End of main()");
	}
	public void finalize() {
		System.out.println("finalize() called");
		s = this;
	}
}
