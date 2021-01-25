package Introduction;

public class BreakStatement {
/*break;
 * it is a conditional statement
 */
	public static void main(String[] args) {
int [] numbers= {10,20,30,40,50};

for(int i : numbers) {
	if(i==40) {
		break;
	}
	System.out.println(i);
}

	}

}
