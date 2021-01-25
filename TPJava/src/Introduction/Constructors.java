package Introduction;



public class Constructors {
//a constructor name should be same as class name
	//a simple constructor
		int x;
			//following is the constructor
			Constructors(){
				x=10;
			}
		
		public static void main(String[] args) {
		//constructor is invoked when you initialize and object
			Constructors t1 =new Constructors();
		    Constructors t2 =new Constructors();
	//you do not have to explicitly call constructor unlike methods	    
		    System.out.println(t1.x +" "+ t2.x);
		
	}

}
