package Introduction;

// when we work with Numbers we use primitive data types
//Number class is part of java.lang package
public class NumberClass {

	public static void main(String[] args) {
		Integer x = 5;
		Integer y = 10;
		Double d = 100.678;
		Float f = (float) -90.28;

		System.out.println(x);
		System.out.println(x.equals(y));
		System.out.println(x.compareTo(3));
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(f));
		System.out.println(Math.min(x, y));
		System.out.printf("The value of e is %4f%n", Math.E);
		System.out.println(Math.random());

	}

}
