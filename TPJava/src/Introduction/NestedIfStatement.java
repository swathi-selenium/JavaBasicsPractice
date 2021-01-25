package Introduction;

public class NestedIfStatement {
/*Syntax:
 * if(boolean_expression 1){
 * executes when the boolean expression 1 is true
 * if(boolean_expression 2){
 * executes when the boolean expression 2 is true
 * }
 * }
 */
	public static void main(String[] args) {
		int x=30;
		int y=10;
		if (x==30) {
			System.out.println("The first condition is met");
			if (y==10) {
				System.out.println("The second condition is met");
				System.out.println("x=30 and y=10");
			}
		}

	}

}
