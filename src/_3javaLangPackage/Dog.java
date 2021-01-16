package _3javaLangPackage;

class Dog implements Cloneable {
	Cat c;
	int i;

	public Dog(Cat c, int i) {
		super();
		this.c = c;
		this.i = i;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// return super.clone();//shallow cloning
		Cat c = new Cat(this.c.j);//deep cloning
		Dog d = new Dog(c, i);
		return d;
	}
}