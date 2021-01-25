package Introduction;

//this keyword is helpful to call one constructor in another constructor
public class ThisKeyword {

	// instance variable num
	int num = 10;

	ThisKeyword() {
		System.out.println("Example on keyword this");
	}

	ThisKeyword(int num) {
		// invoking the default constructor
		this();
		// assigning the local variable num to the instance variable num
		this.num = num;
	}

	public void greet() {
		System.out.println("Hi,Welcome to Tutorials Point");
	}

	public void print() {
		// local variable num
		int num = 20;
		// printing the local variable
		System.out.println("Local variable num is: " + num);
		// printing instance variable
		System.out.println("Instance variable num is: " + this.num);
		// invoking the greet method of a class
		this.greet();
	}

	public static void main(String[] args) {
		// instantiating the class
		ThisKeyword obj1 = new ThisKeyword();
		// invoking the print method
		obj1.print();

		System.out.println("\n");

		// passing a new value to the num variable through parameterized constructor
		ThisKeyword obj2 = new ThisKeyword(30);
		// invoking the print method again
		obj2.print();

	}

}
