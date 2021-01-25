package OOPSconcepts;

//abstraction can be achieved in two types:abstract class,abstract method,interfaces
//creating an abstract class
public abstract class AbstractClass {
	String eName;
	String eAddress;
	int eID;
//create constructor of abstract class
	AbstractClass(String eName, String eAddress, int eID) {
		this.eName = eName;
		this.eAddress = eAddress;
		this.eID = eID;
	}
//normal method
	public void department() {
		System.out.println("This employee works for L&D department");
	}

//abstract method ends with a semicolon
	public abstract void jobRole();

//cannot instantiate an abstract class
	
}
