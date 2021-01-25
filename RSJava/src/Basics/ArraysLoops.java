package Basics;

public class ArraysLoops {

	public static void main(String[] args) {
		// sum of numbers in array
		int sum = 0;
		int c[] = { 1, 2, 3, 4, 5, 6,7 };
		for (int i = 0; i < c.length; i++) {
			// System.out.println(c[i]);
			sum = sum + c[i];
			System.out.println(sum);
            //print index of desired number
			//System.out.println(i);
        /* if(c[i]==4)
         {
        	 break;//to come out of loop after conditions met
         }*/
		}

	}

}
