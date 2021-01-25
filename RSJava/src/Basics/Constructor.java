package Basics;

public class Constructor {

	//Default Constructor
	public Constructor() {
		System.out.println("I am in constructor");
		System.out.println("It is used to define variables");
	}

	public void getdata() {
		System.out.println("I am in method");
	}
	//Parameterized Constructor
	public Constructor(int a,int b) {
		System.out.println("I am in  Parameterized constructor");
	int x=a+b;
	System.out.println(x);
	}
	//implicit constructor
	public Constructor(String str) {
		System.out.println("I am in Single String parameter constructor");
	}

	public static void main(String[] args) {
		// will not return values
		// name of constructor should be the class name
		Constructor c = new Constructor();
		Constructor d = new Constructor(4,5);
		Constructor e = new Constructor("HELLO");
		
		
//compiler will call implicit constructor if we don't define any constructor 
//when ever you create an object constructor is called
//block of code whenever an object is created
	}

}
