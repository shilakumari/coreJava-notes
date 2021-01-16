package _21javaVersions._8version;

@FunctionalInterface
public interface MyInterface {
	public void methodOne();
	public class Test {
		public static void main(String[] args) {
			MyInterface i = ()->System.out.println("method one execution1");
			i.methodOne();
		}
	}
}
