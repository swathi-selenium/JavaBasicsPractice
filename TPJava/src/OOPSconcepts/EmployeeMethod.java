package OOPSconcepts;
//differentiating between parent class member and child class member-SuperKeyword
class PersonMethod{
	String name="Sriram";
	public void display() {
		System.out.println("This is Super Class");
	}
}
public class EmployeeMethod extends PersonMethod {
	String name="Sruti";
	public void display() {
		System.out.println("Super class name: "+super.name);
		System.out.println("Sub class name: "+name);
	}
	public void finalDisplay() {
		super.display();
	}

	public static void main(String[] args) {
		EmployeeMethod e=new EmployeeMethod();
		e.display();//this will call subclass method
		e.finalDisplay();//this will call the superclass method

	}

}
