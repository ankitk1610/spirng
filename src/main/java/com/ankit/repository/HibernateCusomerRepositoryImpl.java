package com.ankit.repository;

import java.util.ArrayList;
import java.util.List;

import com.ankit.model.Customer;

public class HibernateCusomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see com.ankit.repository.CustomerRepository#findALl()
	 */
	public List<Customer> findALl() {
		List<Customer> customers = new ArrayList<Customer>();

		Customer customer = new Customer();
		customer.setFirstName("Ankit");
		customer.setLastName("Kumar");

		customers.add(customer);

		return customers;

	}
}
