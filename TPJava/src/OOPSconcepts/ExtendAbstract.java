package OOPSconcepts;


	public class ExtendAbstract extends AbstractClass {
		ExtendAbstract(String eName, String eAddress, int eID) {
			super(eName, eAddress, eID);
		}

		public void jobRole() {
			System.out.println("This is an abstract method");

		}

	

	public static void main(String[] args) {
		ExtendAbstract e=new ExtendAbstract("Swathi","Denver",618);
		e.department();
		e.jobRole();

	}


}
