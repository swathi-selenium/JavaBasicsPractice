package OOPSconcepts;
/*Syntax:Interface
 * import java.lang.*;
 *any number of import statements
 public interface NameOfInterface
 {
	 //any number of final ,static fields
	 //any number of abstract method declarations
 }
 */
interface Persons{
	public void department();
	void jobRole();
}
public class Employees implements Persons{
	
	public void department() {
		System.out.println("Department:L&D");
	}
	public void jobRole() {
		System.out.println("Job:Corporate Trainer");
	}

	public static void main(String[] args) {
		Employees e=new Employees();
		e.department();
		e.jobRole();

	}

}
