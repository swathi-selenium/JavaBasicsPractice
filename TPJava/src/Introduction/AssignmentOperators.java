package Introduction;

public class AssignmentOperators {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		int c=0;
		c=a+b;
		System.out.println("c=a+b="+c);
		c+=a;
		System.out.println("c+=a ="+c);
		c-=a;
		System.out.println("c-=a ="+c);
		c*=a;
		System.out.println("c*=a ="+c);
		c/=a;
		System.out.println("c/=a ="+c);
		//not clear about the below topics
		a=10;
		b=15;
		c%=b;
		System.out.println("c%=b ="+c);
		c<<=2;
		System.out.println("c<<=2"+c);
		c>>=2;
		System.out.println("c>>=2"+c);
		
		c&=2;
		System.out.println("c&=2"+c);
		c^=a;
		System.out.println("c^=a = "+c);
		c|=a;
		System.out.println("c|=a = "+c);
		
		
		
		

	}

}
