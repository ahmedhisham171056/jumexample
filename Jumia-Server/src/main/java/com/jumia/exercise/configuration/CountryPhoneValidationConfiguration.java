package com.jumia.exercise.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jumia.exercise.repository.CountryInfoRepository;
import com.jumia.exercise.validator.CountryPhoneValidator;

@Configuration
public class CountryPhoneValidationConfiguration {

	@Autowired
	CountryInfoRepository countryInfoRepository;
	
	@Bean
	public CountryPhoneValidator countryPhoneValidator() {
	    return new CountryPhoneValidator(countryInfoRepository);
	}
}
