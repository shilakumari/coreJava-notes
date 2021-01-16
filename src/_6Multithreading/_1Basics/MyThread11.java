package _6Multithreading._1Basics;

class MyThread11 extends Thread {
	Display d;
	String name;

	MyThread11(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}