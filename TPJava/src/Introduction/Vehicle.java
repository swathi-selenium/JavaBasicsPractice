package Introduction;


public class Vehicle extends Car{

	public static void main(String[] args) {
		Car a = new Vehicle();
		boolean result = a instanceof Vehicle;
		System.out.println( result );

	}

}
