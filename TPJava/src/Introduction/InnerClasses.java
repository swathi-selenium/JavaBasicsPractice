package Introduction;

//inner classes are a security mechanism in java
// you just need to write a class within a class

class Outer_Demo {
	private class Inner_Demo {
		public void print() {
			System.out.println("This is an Inner Class");
		}
	}

	void display_Inner() {
		Inner_Demo inClass = new Inner_Demo();
		inClass.print();
	}
}

public class InnerClasses {
	public static void main(String[] args) {
		// instantiating the outer class
		Outer_Demo outClass = new Outer_Demo();

		// accessing the display_Inner() method
		outClass.display_Inner();
	}

}
