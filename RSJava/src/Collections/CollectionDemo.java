package Collections;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {

		int a[] = { 4, 8, 9, 8, 4, 7, 8, 9, 9 };
//print unique numbers from the list
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;

					}
				}
			}
		//	System.out.println("This is number: "+a[i]);
		//	System.out.println("Number of times: "+k);
			if (k==1)
			{
				System.out.println(a[i]+ " is the unique number");
			}
			
		}

	}

}
