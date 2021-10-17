package com.jumia.exercise.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY_INFO")
public class CountryInfo {
	
	@Id
	@Column(name = "COUNTRY_CODE")
	private String countryCode;
	
    private String name;   
    
    private String regex;
    
    public CountryInfo() {
    	
    }

	public CountryInfo(String countryCode, String name, String regex) {
		super();
		this.countryCode = countryCode;
		this.name = name;
		this.regex = regex;
	}



	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	@Override
	public String toString() {
		return "Country [countryCode=" + countryCode + ", name=" + name + ", regex=" + regex + "]";
	}


    
}
