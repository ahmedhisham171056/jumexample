package com.jumia.exercise.dto;

import java.io.Serializable;

import com.jumia.exercise.constants.State;

public class CustomerDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	
	private String phone;
	
	private State state;
	
	private String countryName;
	
	public CustomerDto() {
		
	}

	public CustomerDto(Long id, String name, String phone, State state, String countryName) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.state = state;
		this.countryName = countryName;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "CustomerDto [id=" + id + ", name=" + name + ", phone=" + phone + ", state=" + state
				+ ", countryName=" + countryName + "]";
	}
	
	

}
