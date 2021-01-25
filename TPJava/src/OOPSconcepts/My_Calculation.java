package OOPSconcepts;

public class My_Calculation extends Calculations {
	public void multiplication(int a, int b) {
		c = a * b;
		System.out.println("The product of the given numbers : " + c);
	}

	public void division(int a, int b) {
		c = a / b;
		System.out.println("The division of the given numbers : " + c);
	}

	public static void main(String[] args) {
		My_Calculation demo = new My_Calculation();
		int a = 20;
		int b = 10;
		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
		demo.division(a, b);

	}

}
