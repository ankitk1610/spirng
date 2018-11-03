package com.ankit.service;

import java.util.List;

import com.ankit.model.Customer;
import com.ankit.repository.CustomerRepository;
import com.ankit.repository.HibernateCusomerRepositoryImpl;

public class CustmerServiceImpl implements CustmerService {
	private CustomerRepository customerRepository = new HibernateCusomerRepositoryImpl();
// HardCoding done.... Spring removes it..

	
	
	/* (non-Javadoc)
	 * @see com.ankit.service.CustmerService#findAll()
	 */
	
	
	
	public List<Customer> findAll() {
		return customerRepository.findALl();
	}
}
