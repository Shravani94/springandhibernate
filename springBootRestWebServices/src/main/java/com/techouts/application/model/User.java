package com.techouts.application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	@Column
	private String name;
	@Column
	private String mailId;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public User(int userid, String name, String mailId) {
		super();
		this.userid = userid;
		this.name = name;
		this.mailId = mailId;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
