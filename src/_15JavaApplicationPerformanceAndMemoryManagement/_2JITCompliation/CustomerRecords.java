package _15JavaApplicationPerformanceAndMemoryManagement._2JITCompliation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
	private Map<String, Customer> records;

	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}

	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}

	public Map<String, Customer> getCustomers() {
		//return this.records;
		//return new HashMap<String, Customer>(this.records);
		//return new HashMap<>(this.records);
		return Collections.unmodifiableMap(this.records);
		//return Map.copyOf(this.records);//Since Java 10v
	}

	@Override
	public Iterator<Customer> iterator() {
		return this.records.values().iterator();
	}
	
	public ReadOnlyCustomer find(String key){
		//return this.records.get(key);
		return new Customer(this.records.get(key));
	}
}
