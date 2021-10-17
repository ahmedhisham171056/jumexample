package com.jumia.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jumia.exercise.entity.Customer;
import com.jumia.exercise.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	public CustomerRepository customerRepository;

	public List<Customer> getAllCustomers(Pageable customerPage) {
		return customerRepository.findAll(customerPage).getContent();
	}
}
