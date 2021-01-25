package Collections;

import java.util.ArrayList;

public class ArrayListExample {
// Classes that implement list interface are ArrayList,LinkedList,Vector
//arraylist will accept duplicate values
// array have fixed size ,arraylist can grow dynamically
// we can access and insert any value in any index
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Kiran");
		a.add("Swathi");
		a.add("Sriram");
		a.add("Sruti");
		System.out.println(a);
		a.add(0, "Kalluri");
		System.out.println(a);
		// a.remove(0);
		// System.out.println(a);
		System.out.println(a.get(2));
		// test whether specified string is present in the list
		System.out.println(a.contains("Testing"));
		System.out.println(a.indexOf("Swathi"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
