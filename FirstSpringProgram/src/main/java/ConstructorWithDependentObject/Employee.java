package ConstructorWithDependentObject;

public class Employee {  
private int id;  
private String name;  
private Country country;//Aggregation  
  
public Employee() {System.out.println("def cons");}  
  
public Employee(int id, String name, Country country) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.country = country;  
}  
  
void show(){  
    System.out.println(id+" "+name);  
    System.out.println(country.toString());  
}  
  
}  