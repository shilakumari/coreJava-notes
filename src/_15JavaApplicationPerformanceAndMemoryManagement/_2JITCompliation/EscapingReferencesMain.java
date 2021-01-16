package _15JavaApplicationPerformanceAndMemoryManagement._2JITCompliation;

import java.util.Iterator;

public class EscapingReferencesMain {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();
		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));

	
		// Map<String, Customer> customers = records.getCustomers();
		// customers.clear();

		ReadOnlyCustomer customer0 = records.find("John");
		System.out.println(customer0.getName());

		//customer0.setName("Janu");//CTE
		System.out.println(customer0.getName());

		for (ReadOnlyCustomer customer : records.getCustomers().values()) {
			System.out.print(customer+"\t");
		}

		// for(Customer customer :records){
		// System.out.print(customer+"\t");
		// }
		// System.out.println();
		// Iterator<Customer> iterator = records.iterator();
		// iterator.hasNext();
		// Customer simson=iterator.next();
		// System.out.println(simson);
		// iterator.remove();
		//
		// System.out.println();
		// for(Customer customer :records){
		// System.out.print(customer+"\t");
		// }

	}

}
