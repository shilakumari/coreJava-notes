package _6Multithreading._3udemy._5SLS;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Book {

	private int id;
	private Lock lock;

	public Book(int id) {
		this.lock = new ReentrantLock();
		this.id = id;
	}

	public void read(Student student) throws InterruptedException {
		// lock.lock();
		if (lock.tryLock(10, TimeUnit.MINUTES)) {
			System.out.println(student + " starts reading " + this);
			Thread.sleep(2000);
			lock.unlock();
			System.out.println(student + " has finished reading " + this);
		} else {
			System.out.println("OOps! someone already reading the book.");
		}
	}

	public String toString() {
		return "Book" + id;
	}

}