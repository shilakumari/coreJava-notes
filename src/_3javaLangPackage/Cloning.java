package _3javaLangPackage;
public class Cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c = new Cat(20);
		Dog d1 = new Dog(c, 10);
		System.out.print(d1.i+"\t");
		System.out.println(d1.c.j);
		
		Dog d2 = (Dog)d1.clone();
		System.out.print(d2.i+"\t");
		System.out.println(d2.c.j);
		
		d2.i=888;
		d2.c.j=999;
		System.out.print(d2.i+"\t");
		System.out.println(d2.c.j);
		
		System.out.print(d1.i+"\t");
		System.out.println(d1.c.j);
	}
}