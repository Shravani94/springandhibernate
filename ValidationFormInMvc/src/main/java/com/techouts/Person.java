package com.techouts;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Person {
	@NotNull(message="required")
	private String name;
	@Max(value=10,message="number must be 10 digits")
	@Min(value=10,message="number should not be greater than 10 digits")
	private long mobileNumber;
	@Pattern(regexp="^[@gmail.com}")
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
