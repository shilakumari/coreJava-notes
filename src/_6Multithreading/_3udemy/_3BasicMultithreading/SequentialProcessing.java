package _6Multithreading._3udemy._3BasicMultithreading;

public class SequentialProcessing {

	public static void main(String[] args) {
		Runner1 runner1=new Runner1();
		runner1.startRunning();
		Runner2 runner2=new Runner2();
		runner2.startRunning();
	}

}
