package Introduction;

public class EnhancedForLoop {
/*
 * This is mainly used to traverse collection of elements including arrays
 * Syntax:
 * for(declaration:expression){
 * statement
 * }
 */
	public static void main(String[] args) {
		int [] numbers= {10,20,30,40,50};
		for (int x:numbers) {
			System.out.print( x );
			System.out.print(",");
		}
		System.out.print("\n");
		String [] names = {"Kiran","Swathi","Sriram","Sruti"};
		
		for(String name:names) {
			System.out.print(name);
			System.out.print(",");
		}
				

	}

}
