package Introduction;

public class PassingParametersByValue {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println("Before swapping, a =" + a + " and b =" + b);
		//invoke the swap method
		swapFunction(a,b);
		
	}
	public static void swapFunction(int n1,int n2) {
		//swap n1 with n2
		int n3=n1;
		n1=n2;
		n2=n3;
		System.out.println("After swapping (Inside),a="+n1 +" and b = "+n2);
	}

}
