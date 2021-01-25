package Introduction;

public class ContinueStatement {
/*for loop,continue causes control to immediately jump to the update statement
 * while or do/while loop control immediately jumps to the boolean expression
 * Syntax:continue;
 */
	public static void main(String[] args) {
		int [] numbers = {10,20,30,40,50};
		for(int i :numbers) {
			if(i==30) {
				continue;
			}
			System.out.println( "The value of i : "+ i );
		}
			
			
			}

}
