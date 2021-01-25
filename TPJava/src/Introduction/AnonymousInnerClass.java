package Introduction;
/*Syntax:
 * AnonymousInner an_Inner=new AnonymousInner(){
 * public void my_method(){
 * ........
 * .......
 * };
 * }
 */

abstract class AnonymousInClass {
	public abstract void display();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		AnonymousInClass inClass = new AnonymousInClass() {
			public void display() {
				System.out.println("This is an example of anonymous inner class");
			}
		};
		inClass.display();

	}

}
