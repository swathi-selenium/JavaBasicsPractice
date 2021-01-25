package OOPSconcepts;

public class StudentTest {

	public static void main(String[] args) {
		StudentExam s = new StudentExam();
		/*
		 * First case- assign value to private variable through getter and setter
		 * methods
		 */
		s.setName("Kiran");
		System.out.println(s.getName());
		/*
		 * Second case- does not allow to assign value to private variable(rollno), no
		 * getter and setter methods
		 */
	//	System.out.println(s.rollNo = 25);
		/*
		 * Third case- private getter and setter methods cannot be called by other class
		 * they are accessible within the class
		 * 
		 */
		
	}

}
