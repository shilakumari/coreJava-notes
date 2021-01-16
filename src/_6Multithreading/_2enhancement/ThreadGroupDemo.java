package _6Multithreading._2enhancement;

public class ThreadGroupDemo {

	public static void main(String[] args) throws Exception {
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		//m6();
		m7();
	}

	private static void m7() {
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg, "ChildGroup");

		
		ThreadGroup[] arrtg = new ThreadGroup[system.activeGroupCount()];
		system.enumerate(arrtg);
		for (ThreadGroup tg : arrtg) {
			System.out.println(tg.getName() + "..." + tg.isDaemon());
		}
	}

	private static void m6() {
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] arrt = new Thread[system.activeCount()];
		system.enumerate(arrt);
		for (Thread t1 : arrt) {
			System.out.println(t1.getName() + "..." + t1.isDaemon());
		}
	}

	private static void m5() throws Exception {
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg, "ChildGroup");

		MyThread t1 = new MyThread(pg, "ChildThread1");
		MyThread t2 = new MyThread(pg, "ChildThread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());// 2
		System.out.println(pg.activeGroupCount());// 1
		pg.list();

		Thread.sleep(5000);

		System.out.println(pg.activeCount());// 0
		System.out.println(pg.activeGroupCount());// 1
		pg.list();
	}

	private static void m4() {
		Thread.currentThread().setPriority(4);

		ThreadGroup tg1 = new ThreadGroup("tg1"); // max priority=10
		Thread t1 = new Thread(tg1, "FirstThread");
		Thread t2 = new Thread(tg1, "SecondThread");
		tg1.setMaxPriority(3);

		Thread t3 = new Thread(tg1, "ThirdThread");
		Thread t4 = new Thread(tg1, "ThirdThread");
		Thread t5 = new Thread(tg1, "ThirdThread");
		t4.setPriority(2);
		t5.setPriority(7);

		System.out.println(t1.getPriority());// 4
		System.out.println(t2.getPriority());// 4
		System.out.println(t3.getPriority());// 3
		System.out.println(t4.getPriority());// 2
		System.out.println(t5.getPriority());// 3

		tg1.list();// java.lang.ThreadGroup[name=tg1,maxpri=3]
	}

	private static void m3() {
		ThreadGroup tg1 = new ThreadGroup("FirstGroup");
		System.out.println(Thread.currentThread().getThreadGroup().getName());// main
		System.out.println(tg1.getParent().getName());// main
		System.out.println(tg1.getName());// FirstGroup

		ThreadGroup tg2 = new ThreadGroup(tg1, "SecondGroup");
		System.out.println(tg2.getParent().getName());// FirstGroup

	}

	private static void m2() {
		ThreadGroup tg1 = new ThreadGroup("FirstGroup");
		System.out.println(Thread.currentThread().getThreadGroup().getName());// main
		System.out.println(tg1.getParent().getName());// main
		System.out.println(tg1.getName());// FirstGroup
	}

	private static void m1() {
		System.out.println("Thread: " + Thread.currentThread().getName());// main
		System.out.println("Thread Group: " + Thread.currentThread().getThreadGroup().getName());// main
		System.out.println("Parent of thread group: " + Thread.currentThread().getThreadGroup().getParent().getName());// system

	}

}
