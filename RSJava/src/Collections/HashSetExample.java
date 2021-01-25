package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
//Classes that implement Set interface:HashSet,LinkedHashSet,TreeSet
//Set Interface does not accept duplicate values
//No guarantee about the elements storage( in sequential order) may store in random order

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("DENVER");
		hs.add("INDIA");
		hs.add("ASIA");
		hs.add("COLORADO");

		System.out.println(hs);
		hs.add("USA");
		hs.add("INDIA");
		System.out.println(hs);
		hs.remove("INDIA");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());

		// Iterator:Can travel through each and every step
		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {

			System.out.println(i.next());
			

		}

	}

}
