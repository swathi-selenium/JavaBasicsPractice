package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
//takes values in the form of key-value pair
	/*
	 * HashMap vs HashTable HM :is not synchronized and not thread safe allows 1null
	 * key and any number of null values object values are iterated by using
	 * iterator
	 * 
	 * HT :is thread safe and synchronized do not allow null keys and null values is
	 * the only class other than vector which uses enumerator- -to iterate the
	 * values of HashTable objects
	 * 
	 */
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "HELLO");
		hm.put(1, "Namaste");
		hm.put(2, "HOLA");
		hm.put(3, "SALVE");
		hm.put(4, "ASALAAM ALAIKUM");
		System.out.println(hm.get(3));
		hm.remove(3);
		System.out.println(hm.remove(3));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}
	}

}
