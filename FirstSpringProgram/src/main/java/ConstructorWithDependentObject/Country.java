package ConstructorWithDependentObject; 

public class Country {  
private String city;  
private String state;  
private String country;  
  
public Country(String city, String state, String country) {  
    super();  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
  
public String toString(){  
    return city+" "+state+" "+country;  
}  
}  