package Introduction;

public class SwitchStatement {
/*switch(expression){
 * case value:
 * statements
 * break;//optional
 * case value:
 * statements
 * break;//optional
 * you can have any no.of case statements
 * default://optional
 * statements
 */
	public static void main(String[] args) {
		//switch statements works for primitive data types
		char grade ='C';
		switch(grade)
		{
		case 'A':
			System.out.println("Excellent");
			break;//break statement will help in coming out the block
		case 'B':
			System.out.println("Well Done");
			break;
		case 'C':
			System.out.println("Above Average");
			break;
		case 'D':
			System.out.println("You Passed");
			break;
		case 'F':
			System.out.println("Better Try Again");
			break;
			default:
			System.out.println("Please enter Grade");	
			
		}
		System.out.println("Your grade is " +grade);
				
	}

}
