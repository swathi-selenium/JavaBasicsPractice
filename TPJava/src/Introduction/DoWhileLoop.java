package Introduction;

public class DoWhileLoop {
/*Syntax:
 * do
 * {
 * statements
 * }while(boolean_expression);
 */
	public static void main(String[] args) {
		int x=10;
		//block of statements will execute atleast once before checking for the condition
   do {
	   System.out.println("Value of x : " + x);
	   x++;
	   
   }while(x<20);

	}

}
