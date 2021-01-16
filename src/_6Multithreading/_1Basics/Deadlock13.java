package _6Multithreading._1Basics;

class A {
	public synchronized void d1(B b) {
		System.out.println("Thread1  starts execution of d1() method");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread1 trying to call B's last() method");
		b.lastB();
	}

	public synchronized void lastA() {
		System.out.println("Inside A, last() method");
	}
}

class B {
	public synchronized void d2(A a)// read as d2 of A
	{
		System.out.println("Thread2  starts execution of d2() method");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread2 trying to call A's last() method");
		a.lastA();
	}

	public synchronized void lastB() {
		System.out.println("Inside B, last() method");
	}
}

class MyThreadD extends Thread {
	A a = new A();
	B b = new B();

	public void m1() 
	{
		this.start();
		a.d1(b);// by main thread
	}

	public void run() {
		b.d2(a);// by child thread
	}
}

public class Deadlock13 {
	public static void main(String[] args) {
		MyThreadD t = new MyThreadD();
		t.m1();
	}
}
