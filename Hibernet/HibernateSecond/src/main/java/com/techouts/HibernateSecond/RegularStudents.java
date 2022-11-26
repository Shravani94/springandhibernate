package com.techouts.HibernateSecond;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Regular")
@Access(value=AccessType.FIELD)

public class RegularStudents extends TablePerHierarchy{
	@Column(name="result")
	private String result1;
	@Column(name="promot")
	private String promot;
	public String getResult1() {
		return result1;
	}
	public void setResult1(String result1) {
		this.result1 = result1;
	}
	public String getPromot() {
		return promot;
	}
	public void setPromot(String promot) {
		this.promot = promot;
	}
	public RegularStudents() {
		super();
	}
	

}
