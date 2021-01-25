package Introduction;

public class NestedIfElseStatement {
/*Syntax:
 * if(boolean_expression 1){
 * executes if expression 1 is true
 * }else if(boolean_expression 2){
 * executes if expression 2 is true
 * }else if(boolean_expression 3){
 * executes if expression 3 is true
 * }else{
 * executes if none of the above expression is true
 * }
 */
	public static void main(String[] args) {
		int x =30;
		if(x==10) {
			System.out.println("Value of x is 10");
		}else if (x==20) {
			System.out.println("Value of x is 20");
			System.out.println("This is an else if block");
		}else if (x==30) {
			System.out.println("Value of x is 30");
			System.out.println("This is an else if block");
		}else {
			System.out.println("This is else block and none of the conditions are met");
		}

	}

}
