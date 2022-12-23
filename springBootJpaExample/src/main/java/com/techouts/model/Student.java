package com.techouts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student1")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="stu_id")
	private int id;
	@Column(name="sty_name")
	private String name;
	@Column(name="stu_mail")
	private String mailid;
	@Column(name="stu_mobile")
	private String mobilenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	public Student() {

	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mailid=" + mailid + ", mobilenumber=" + mobilenumber + "]";
	}
	

}
