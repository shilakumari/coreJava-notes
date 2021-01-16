package _6Multithreading._1Basics;

class Synchronization11 {
	public static void main(String args[]) throws InterruptedException {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread11 t1 = new MyThread11(d1, "Dhoni");
		MyThread11 t2 = new MyThread11(d2, "Sachin");
		t1.start();
		t2.start();
	}
}