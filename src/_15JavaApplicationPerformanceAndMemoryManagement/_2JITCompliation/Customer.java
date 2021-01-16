package _15JavaApplicationPerformanceAndMemoryManagement._2JITCompliation;

public class Customer implements ReadOnlyCustomer {
	private String name;

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(String name) {
		this.name = name;
	}

	// Copy Constructor
	public Customer(ReadOnlyCustomer customer) {
		this.name = customer.getName();
	}

	@Override
	public String toString() {
		return name;
	}

}
