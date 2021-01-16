package _2OOPs._8Generic;

class GenricTestClass2<T> {
	T ob;

	GenricTestClass2(T ob) {
		this.ob = ob;
	}

	public void show() {
		System.out.println("The type of ob  is  " + ob.getClass().getName());
	}

	public T getOb() {
		return ob;
	}
}
