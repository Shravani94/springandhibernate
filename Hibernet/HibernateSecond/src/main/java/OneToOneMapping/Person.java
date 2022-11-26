package OneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person {
	@javax.persistence.Id
	@Column(name="Id")
	private int Id;
	@Column(name="Name")
	private String name;
	@Column(name="MailId")
	private String mailId;
	@Column(name="Address")
	private Address address;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public void setAddress(Address adress1) {
	this.address=address;
		
	}
	public Address getAddress() {
		return address;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", name=" + name + ", mailId=" + mailId +", Addres= "+address+"]";
	}
	

}
