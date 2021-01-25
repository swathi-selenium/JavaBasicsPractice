package OOPSconcepts;

public class ImplementInterface implements Math_Teacher{

	public static void main(String[] args) {
		
		ImplementInterface obj=new ImplementInterface();
		obj.department();
		obj.jobRole();
		obj.subject();
		obj.Division();

	}
	public void department() {
		System.out.println("Teaching");
	}
	public void jobRole() {
		System.out.println("Math Teacher");
	}
	public void subject() {
		System.out.println("Mathematics");
	}
	
	public void Division() {
		System.out.println("Division");
		
	}
	

}
