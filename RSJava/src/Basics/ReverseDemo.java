package Basics;

public class ReverseDemo {

	public static void main(String[] args) {
		//String s="MADAM";
		//printing the string in reverse order
		String k="KIRAN";
		String t="";
		for (int i=k.length()-1;i>=0;i--) {
			t = t + k.charAt(i);
			System.out.println(t);
		}

	}

}
