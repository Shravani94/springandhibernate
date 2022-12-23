package com.techouts.model;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Id;

@Entity
@Table(name="customer_table")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="cust_id")
	  
	private int Id;
	@Column(name="cust_firstName")
	@NotBlank(message = "FirstName is mandatory")
	private String firstName;
	@Column(name="cust_lastName")
	@NotBlank(message = "LastName is mandatory")
	private String lastName;
	@Column(name="cust_userName",unique = true)
	@NotBlank(message = "UserName is mandatory")
	
	private String userName;
	@Column(name="cust_password")
	@Pattern(regexp="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$" ,message="password shout contains atleast one capital letter and atleast on small letter and alteast one special charcter")
	@Size(min=8,max=128,message="password should contains atleast 8 letters")
	@NotBlank(message = "Password is mandatory")
	private String password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String firstName, String lastName, String userName, String password) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	
	
	

}
