package com.jumia.exercise.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jumia.exercise.dto.CustomerDto;
import com.jumia.exercise.entity.Customer;
import com.jumia.exercise.service.CountryInfoService;
import com.jumia.exercise.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	public CustomerService customerService;

	@Autowired
	public CountryInfoService countryInfoService;

	@CrossOrigin(origins = {"http://localhost:8080" , "http://localhost:4200"})
	@GetMapping(path = "/customers")
	public ResponseEntity<List<CustomerDto>> getAllCustomer(
			@RequestParam(name = "page", defaultValue = "0", required = false) int page,
			@RequestParam(name = "size", defaultValue = "100", required = false) int size) {
		List<Customer> customers = customerService.getAllCustomers(PageRequest.of(page, size));
		List<CustomerDto> customerDtoList = new ArrayList<>();
		customerDtoList = countryInfoService.applyPhoneValidation(customers);
		System.out.println(customerDtoList);
		return ResponseEntity.ok(customerDtoList);
	}

}
