package Basics;

public class ChildDemo extends ParentDemo {
	String name = "QAClickAcademy";

	public void getStringdata() 
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public ChildDemo()
	{
		super();//this should always be in the first line
		System.out.println("Child Class Constructor");
	}
	public void getData()
	{
		super.getData();
		System.out.println("I am in Child Class");
	}

	public static void main(String[] args) 
	{

		ChildDemo cd = new ChildDemo();
		cd.getStringdata();
		cd.getData(); 
	}
}