package Basics;

public class SingleDimensionalArrays {

	public static void main(String[] args) {
//container which stores multiple values of same data type
		int a[]=new int[5];//declares an array and allocates memory for 5
		a[0]=2;
		a[1]=4;
		a[2]=6;//initialize values to array
		a[3]=8;
		a[4]=10;
		
		int b[]= {1,3,5,7,9};
		//most preferred way of initializing values
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			//retrieve values from the array
			System.out.println("--------------");
			System.out.println(b[i]);
		}
		
	}

}
