package OOPSconcepts;

public class StudentExam {
	private String name;
	private int rollNo;
	String subject;
	
	void setName (String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}

	public static void main(String[] args) {
		StudentExam s=new StudentExam();
		s.setName("Durga");
		System.out.println(s.getName());
		s.rollNo=12;
		System.out.println(s.rollNo=20);

	}

}
