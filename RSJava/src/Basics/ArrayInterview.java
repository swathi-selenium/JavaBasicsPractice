package Basics;

public class ArrayInterview {
//program to retrieve the min value among the array values
//identify column of that min value
	// identify max of that column
	public static void main(String[] args) {
		int abc[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int min = abc[0][0];
		int mincolumn=0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
					mincolumn = j;
				}

			}
		}
		System.out.println("minimum variable is " + min);

		int max = abc[0][mincolumn];
		int k = 0;
		while (k < 3) {
			if (abc[k][mincolumn] > max) {
				max = abc[k][mincolumn];
			}
			k++;
			
		}
		System.out.println("maximum variable is " + max);
	}
	
}
