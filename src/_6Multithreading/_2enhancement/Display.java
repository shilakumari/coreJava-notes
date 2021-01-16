package _6Multithreading._2enhancement;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Display {
	ReentrantLock l = new ReentrantLock();

	public
	// synchronized
	void wish(String name) {
		for (int i = 0; i < 15; i++) {
			System.out.print("Good Morning ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	}

	public void wish2(String name) {
		l.lock();// Line 1
		for (int i = 0; i < 15; i++) {
			System.out.print("Good Morning ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
		l.lock();// Line 1
	}

	public void wish3(String name) {

		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + "…..get lock and performing safe operations");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			l.unlock();
		} else {
			System.out.println(
					Thread.currentThread().getName() + "…..unable to get lock and hence performing unsafe operations");
		}

	}

	public void wish4(String name) {

		do {
			try {
				if (l.tryLock(1, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + "…..get lock and performing safe operations");
					Thread.sleep(2000);
					l.unlock();
					System.out.println(Thread.currentThread().getName() + "…..releases lock");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + "…..unable to get lock and will try again");
				}
			} catch (InterruptedException e) {
			}
		} while (true);

	}

}
