package OOPSconcepts;
//Overriding-type of polymorphism also called as runtime/dynamic polymorphism
//we can reuse the method but parameters and return type should be same
//we have certain rules please go through in google

class Pearson{
	public void display()
	{
		System.out.println("Pearson Class");
	}
}
class Student extends Pearson{
	public void display() {
		System.out.println("I am a Student");
	}
}
class Employer extends Student{
	public void display() {
		System.out.println("I am an Employer");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Pearson p=new Pearson();//person reference and object
		Pearson s=new Student();//person reference but student object
		Student e=new Employer();
		p.display();//runs the method in person class
		s.display();//runs the method in student class
		e.display();
		
	}

}
