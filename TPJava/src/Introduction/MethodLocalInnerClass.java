package Introduction;

/*method local inner class can be instantiated only within 
the method where the inner class is defined*/
public class MethodLocalInnerClass {
	int num = 20;

	// instance method of the outer class
	public void Demo() {
		// method local inner class
		class Inner_Class {
			public void display() {
				System.out.println("This is method inner class " + num);

			}
		}
		// end of inner class
		// accessing the inner class
		Inner_Class inClass = new Inner_Class();
		inClass.display();
	}

	public static void main(String[] args) {
		MethodLocalInnerClass obj = new MethodLocalInnerClass();
		obj.Demo();

	}
}
