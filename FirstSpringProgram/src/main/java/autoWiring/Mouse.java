package autoWiring;

public class Mouse {
Systems system;
public Mouse() {
System.out.println("move the mouse");	
}
public Systems getSystem() {
	return system;
}
public void setSystem(Systems system) {
	this.system = system;
}
public static  void print() {
	System.out.println("mouse is clicked");
	
}
public static void display() {
	print();
	Systems.print();
}
}
