package Introduction;

public class ParameterizedConstructors {

	// a constructor name should be same as class name
	// a simple constructor
	int x;

	// following is the constructor
	ParameterizedConstructors(int i) {
		x = i;
		System.out.println("This is the constructor value "+ x);
	}

	public static void main(String[] args) {
		// constructor is invoked when you initialize and object
		ParameterizedConstructors pc1 = new ParameterizedConstructors(10);
		ParameterizedConstructors pc2 = new ParameterizedConstructors(20);
		// you do not have to explicitly call constructor unlike methods
		System.out.println(pc1.x + pc2.x);

	}

}
