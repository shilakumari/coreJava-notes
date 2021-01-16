package _2OOPs._8Generic;

public class Data2<T> {

	private T data;

	public Data2(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data2 [data=" + data + "]";
	}

}
