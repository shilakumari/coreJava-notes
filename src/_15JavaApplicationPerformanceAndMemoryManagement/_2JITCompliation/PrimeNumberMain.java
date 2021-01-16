package _15JavaApplicationPerformanceAndMemoryManagement._2JITCompliation;

import java.util.Date;

public class PrimeNumberMain {

	public static void main(String[] args) throws InterruptedException {
		// Thread.sleep(10*1000);
		System.out.println("Starting in main()");
		Date start = new Date();
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
		Date end = new Date();
		System.out.println("Total time taken:" + (end.getTime() - start.getTime()) + "ms");

	}

}
// java _15JavaApplicationPerformanceAndMemoryManagement._2JITCompliation.Main 4