package OOPSconcepts;
class Name{
	String FirstName;
	String MiddleName;
	String LastName;
	public Name(String fname,String mname,String lname) {
		this.FirstName=fname;
		this.MiddleName=mname;
		this.LastName=lname;
		
	}
}
public class EmployeeExam {
	int age;
	Name n;
	public void display(int age,Name n) {
		System.out.println("Age: "+age);
		System.out.println("Full Name: "+n.FirstName+" "+n.MiddleName+" "+n.LastName);
		
	}

	public static void main(String[] args) {
		EmployeeExam e=new EmployeeExam();
		Name n=new Name("Swathi","Kalluri","Kuchibhotla");
		e.display(37, n);
	}

}
