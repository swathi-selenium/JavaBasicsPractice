package Introduction;

public class Arrays {
	/*
	 * Syntax: dataType[] arrayRefVar;----prefered way or dataType
	 * arrayRefVar[];-----works but not prefered
	 */
	public static void main(String[] args) {
		/*create an array by using the new operator
		 *  Syntax:
		 * arrayRefVar = new dataType[arraySize];
		 * declaration:
		 * dataType[] arrayRefVar =new dataType[arraySize];
		 * or 
		 * dataType[] arrayRefVar = {value0,value1,value2........,valuek};
		 */
		
		//Declaration
		char[] myArray;
		//allocate memory for fixed number of integers
		myArray =new char[5];
		//initialization
		myArray[0]='H';
		myArray[1]='E';
		myArray[2]='L';
		myArray[3]='L';
		myArray[4]='O';
		//to print an element stored in a particular index
		System.out.println(myArray[1]);
		//to print complete data from array
		System.out.println(myArray);
		//to print length of the array
		System.out.println(myArray.length);
		
		
		
		double[] myList = {1.9,2.9,9.9,4.9};
//print all the array elements
for(int i=0;i< myList.length;i++) {
	System.out.println(myList[i]+" ");
}
//summing all elements
double total =0;
for (int i=0;i<myList.length;i++) {
	total += myList[i];
}
System.out.println("Total is " +total);

//finding the largest element
double max =myList[0];
for (int i=1;i< myList.length;i++) {
	if (myList[i] >max) {max=myList[i];
	
	}
	System.out.println("Max is " +max);
}

	}

}
