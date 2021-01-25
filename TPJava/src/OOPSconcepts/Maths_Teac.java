package OOPSconcepts;

/*Syntax:IS-A relationship
 * public class Person{
 * }
 * public class Employee extends Person{
 * }
 * 
 * public class Teacher extends Person{
 * }
 * public class Maths_Teacher extends Teacher{
 * }
 */
//extends is used in class inheritance
//implements is used in interface inheritance
class Person2 {}// empty class-A
	class Employee2 extends Person2 {}// empty class-B extends A
		class Teacher extends Person2 {}// empty class-C extends A
			class Maths_Teacher extends Teacher {// D extends C

				public static void main(String[] args) {

					Person2 p = new Person2();
					Employee2 e = new Employee2();
					Teacher t = new Teacher();
					Maths_Teacher m = new Maths_Teacher();//Maths_Teacher extends Person
					System.out.println(e instanceof Person2);
					System.out.println(t instanceof Person2);
					System.out.println(m instanceof Teacher);
					System.out.println(m instanceof Person2);

				}

			}

	
	/*		package OOPSconcepts;
			//instanceof keyword
			interface Person2 {}
			class Employee2 implements Person2{}
			public class Science_Teacher extends Employee2{
				public static void main(String args[]) {
					Employee e= new Employee();
					Science_Teacher s=new Science_Teacher();
					System.out.println( e instanceof Person2);
					System.out.println( s instanceof Employee2);
					System.out.println( s instanceof Person2);
					
					
				}


			}*/

	

