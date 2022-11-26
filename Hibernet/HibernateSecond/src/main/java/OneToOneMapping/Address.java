package OneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	private String city,adressLine,state,country;
	private int pincode;
	private Person person;
	@Column(name="City")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(name="AddressLine")
	public String getAdressLine() {
		return adressLine;
	}
	public void setAdressLine(String adressLine) {
		this.adressLine = adressLine;
	}
	@Column(name="State")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Column(name="Country")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Column(name="PinCode")
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Column(name="person")
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", adressLine=" + adressLine + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + ", person=" + person + "]";
	}
	
	

}
