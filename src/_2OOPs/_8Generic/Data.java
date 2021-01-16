package _2OOPs._8Generic;

public class Data {

	private Object data;

	public Data(Object data) {
		super();
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data [data=" + data + "]";
	}

}
