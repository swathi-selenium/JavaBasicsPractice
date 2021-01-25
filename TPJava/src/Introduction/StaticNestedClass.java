package Introduction;

/*Static nested class is a nested class which is a static memberof the outer class
 * Syntax:
 * class MyOuter{
 * static class Nested_Demo{
 * }
 * }
 */
public class StaticNestedClass {
	private static class Nested_Class {
		public void display() {
			System.out.println("This is a static nested class");
		}
	}

	public static void main(String[] args) {
		StaticNestedClass.Nested_Class nested = new StaticNestedClass.Nested_Class();
		nested.display();

	}

}
