package bankapp;

import java.util.*;

public class Bank {
	
	private List<Customer> customers= new ArrayList<Customer>();
	
	public void addCustomer(Customer newCustomer) {
		 customers.add(newCustomer);
		 
	}
	public int  getCustCount() {
		return customers.size();
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public Customer getCustomerByID(long cID) {
		for(int i=0;i<getCustCount();i++)
			if(customers.get(i).getCustID()==cID) {
				return customers.get(i);
			}
	return null;
	}	
}