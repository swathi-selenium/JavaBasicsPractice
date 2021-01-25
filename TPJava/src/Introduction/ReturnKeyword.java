package Introduction;

public class ReturnKeyword {

	public static int returnNumber() {
		int empId = 369;
		return empId;
	}

	public static void main(String[] args) {

		int eID = returnNumber();
		System.out.println(eID);
	}

}
