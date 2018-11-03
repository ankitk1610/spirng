package com.ankit.repository;

import java.util.List;

import com.ankit.model.Customer;

public interface CustomerRepository {

	List<Customer> findALl();

}