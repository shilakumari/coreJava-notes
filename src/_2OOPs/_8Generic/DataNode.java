package _2OOPs._8Generic;

public class DataNode<T> {

	private T t;
	private DataNode<T> next;

	
	public <T> DataNode(T t) {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataNode(T t, DataNode<T> next) {
		super();
		this.t = t;
		this.next = next;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public DataNode<T> getNext() {
		return next;
	}

	public void setNext(DataNode<T> next) {
		this.next = next;
	}

	public static void main(String args[]) {
		DataNode<Integer> dataNode0 = null;// new DataNode<>(null, null);
		DataNode<Integer> dataNode10 = new DataNode<>(10, null);
		dataNode0 = dataNode10;
		DataNode<Integer> dataNode20 = new DataNode<>(20, null);
		dataNode10.setNext(dataNode20);

	}

}