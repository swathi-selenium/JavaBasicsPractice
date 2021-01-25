package OOPSconcepts;
//Super keyword
class Person {
	String name = "Swathi";
}
	public class Employee extends Person {
		String name = "Kiran";

		public void display() {
			System.out.println("Super class employee name : " + super.name);
			System.out.println("Sub cass employee name : " + name);

		}

		public static void main(String[] args) {

			Employee e = new Employee();
			e.display();

		}

		

	}


