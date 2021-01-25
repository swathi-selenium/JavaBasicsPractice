package Introduction;

public class InstanceVariables {
int c;

public void addition() {
	int a=10;
	int b=20;
	c=a+b;
	System.out.println("Sum of a and b is: " + c);
}

public void difference() {
	int x=200;
	int y=150;
	c=x-y;
	System.out.println("Difference between x and y is: "+ c);
}
	public static void main(String[] args) {
		InstanceVariables insl=new InstanceVariables();
		insl.addition();
		insl.difference();
		
	}

}
