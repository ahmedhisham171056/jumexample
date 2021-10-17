package com.jumia.exercise.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.ValidationUtils;

import com.jumia.exercise.constants.State;
import com.jumia.exercise.dto.CustomerDto;
import com.jumia.exercise.entity.CountryInfo;
import com.jumia.exercise.entity.Customer;
import com.jumia.exercise.repository.CountryInfoRepository;
import com.jumia.exercise.validator.CountryPhoneValidator;

@Service
public class CountryInfoService {

	@Autowired
	public CountryInfoRepository countryInfoRepository;
	
	public List<CountryInfo> findAllCountryInfos() {
		return countryInfoRepository.findAll();
	}
	
	public List<CustomerDto> applyPhoneValidation(List<Customer> customerList) {
		List<CustomerDto> customerDtoList = new ArrayList<>();
		for (Customer customer : customerList) {
			BeanPropertyBindingResult result = new BeanPropertyBindingResult(customer, "customer");

			ValidationUtils.invokeValidator(new CountryPhoneValidator(countryInfoRepository), customer, result);
			CustomerDto dto = mapCustomerToDto(customer);
			if (result.hasErrors()) {
				result.getAllErrors().stream().forEach(e -> {
					dto.setState(State.INVALID);
				});
			}
			customerDtoList.add(dto);

		}
		return customerDtoList;
	}

	private CustomerDto mapCustomerToDto(Customer customer) {
		CustomerDto customerDto = new CustomerDto();
		customerDto.setId(customer.getId());
		customerDto.setName(customer.getName());
		customerDto.setPhone(customer.getPhone());
		customerDto.setState(State.VALID);// default to valid format!
		customerDto.setCountryName(findAllCountryInfos().stream()
				.filter(x -> customer.getFlatPhone().equals(x.getCountryCode().substring(1))) // skipping the first +
																								// sign
				.map(x -> x.getName()).collect(Collectors.joining()));

		return customerDto;
	}

	
}
