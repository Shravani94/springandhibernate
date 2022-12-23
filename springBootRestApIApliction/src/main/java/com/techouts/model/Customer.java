package com.techouts.model;

public class Customer {
	private int cus_id;
	private String cus_name;
	private String cus_mail;
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public String getCus_mail() {
		return cus_mail;
	}
	public void setCus_mail(String cus_mail) {
		this.cus_mail = cus_mail;
	}
	public Customer() {
		
		
	}
	@Override
	public String toString() {
		return "Customer [cus_id=" + cus_id + ", cus_name=" + cus_name + ", cus_mail=" + cus_mail + "]";
	}
	
	

}
