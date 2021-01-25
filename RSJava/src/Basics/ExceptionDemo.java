package Basics;

public class ExceptionDemo {
	

//try-catch method is used when we are not sure about error occurrence
//1 try can follow multiple catch blocks
// catch block should definitely follow try block
	public static void main(String[] args) {
		//int b = 7;
		//int d = 0;
		try {
			//int k = b / d;
			int arr[]=new int[5];
			System.out.println(arr[7]);

		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic exception");
		}
		catch(IndexOutOfBoundsException ibe)
		{
			System.out.println("Index Out Of Bounds Exception ");
		}
		
		catch (Exception e)
		{
			System.out.println("Script came to catch block");

		}
//finally block is executed irrespective of the code pass/fail
//should be used only when try-catch block is used
//finally is not executed only when JVM is shutdown forcedly		
		finally
		{
			System.out.println("We are in finally block");
		}

	}
}
