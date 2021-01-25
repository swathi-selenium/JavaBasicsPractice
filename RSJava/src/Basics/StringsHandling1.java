package Basics;

public class StringsHandling1 {

	public static void main(String[] args) {
		//we can manupulate the string in this String class
		String str = "Payment $100 paid";
		str.charAt(8);
		System.out.println(str.charAt(8));
		String str1 = "Payments $100 paid";
		System.out.println(str1.indexOf('s'));
		System.out.println(str.substring(8));
		// or we can use this:
		//String str1=new String("Payment $100 paid");

	}

}
