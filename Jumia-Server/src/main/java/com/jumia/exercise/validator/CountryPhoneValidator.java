package com.jumia.exercise.validator;

import java.util.List;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jumia.exercise.entity.CountryInfo;
import com.jumia.exercise.entity.Customer;
import com.jumia.exercise.repository.CountryInfoRepository;

public class CountryPhoneValidator implements Validator {
	
    CountryInfoRepository countryInfoRepository;
	
	public CountryPhoneValidator(CountryInfoRepository countryInfoRepository) {
		this.countryInfoRepository = countryInfoRepository;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return Customer.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Customer user = (Customer) obj;

		if (checkPhonePattern(user.getFlatPhone())==null) {
			errors.rejectValue("phone", "Phone is not following the valid pattern of its country!");
		}
	}
	
	private CountryInfo checkPhonePattern(String phone) {
		List<CountryInfo> countryInfos = countryInfoRepository.findAll();
		for (CountryInfo countryInfo : countryInfos) {
	        if (countryInfo.getCountryCode().contains(phone))
	            return countryInfo;
	    }
	    return null;
	}

}
