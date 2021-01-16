package _15JavaApplicationPerformanceAndMemoryManagement._2JITCompliation;

public class ContainerMain {

	public static void main(String args[]) {
		ContainerMain main = new ContainerMain();
		main.start();
	}
	
	public void start() {
		String last = "Z";
		Container container = new Container();
		container.setInitial("C");
		another(container,last);
		System.out.print("1 "+container.getInitial());
	}
	
	public void another(Container initialHolder, String newInitial) {
		newInitial.toLowerCase();
		initialHolder.setInitial("B");
		Container initial2 = new Container();
		initialHolder=initial2;
		System.out.print("2 "+initialHolder.getInitial());
		System.out.print("3   "+newInitial);
	}
}
