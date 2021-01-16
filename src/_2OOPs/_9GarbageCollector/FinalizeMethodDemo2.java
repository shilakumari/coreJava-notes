package _2OOPs._9GarbageCollector;

public class FinalizeMethodDemo2 {
	static int count = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			FinalizeMethodDemo2 f = new FinalizeMethodDemo2();
			f = null;
		}
	}

	public void finalize() {
		count++;
		System.out.println("finalize() called: " + count);
	}
}
