package Introduction;
/*Strings are of object type
 * Syntax:
 * String greeting ="Hello World;
 */
public class StringClass {

	public static void main(String[] args) {
		
String s ="My name is Swathi";
System.out.println(s);
System.out.println(s.charAt(1));
System.out.println();
String str1="Learning";
String str2=new String("learning");
String str3=new String("java tutorial");
System.out.println(str1.compareToIgnoreCase(str2));
System.out.println(str1.compareTo(str2));
System.out.println(str2.compareTo(str3));
System.out.println("");
String str4=new String("Its OK");
String str5=new String("Its OK");
System.out.println(str1.contentEquals(str2));
System.out.println(str5.contentEquals(str4));
System.out.println("");
String s1="Hi";
System.out.println(s1.concat("Swathi"));
System.out.println("");
char[] list1= {'h','e','l','l','o'};
String list2="";
System.out.println(list2.copyValueOf(list1));
System.out.println(list2.copyValueOf(list1,1,4));
System.out.println(str1.endsWith("ng"));
System.out.println(s.length());
System.out.println(str1.replace('L','H'));
System.out.println("");
String Str=new String ("Welcome to Tutorials Point");
String Substr1 =new String("Tutorials");
System.out.println("Found Index :"+Str.indexOf(Substr1));


	}

}
