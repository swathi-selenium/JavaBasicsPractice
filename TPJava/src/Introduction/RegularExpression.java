package Introduction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*It is a special sequence of characters that 
 * helps you match or find other strings 
 * or sets of strings using  a specialized syntax
 * held in a pattern.They can be used to search,
 * edit or manipulate text and data.
 */
public class RegularExpression {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".m");
		Matcher m = p.matcher(".am");
		Boolean b = m.matches();
		System.out.println(b);

		boolean b1 = Pattern.matches(".m", "am");
		System.out.println(b1);
		System.out.println(Pattern.matches("[amn]", "acd"));
		System.out.println(Pattern.matches("[^amn]", "c"));
		System.out.println(Pattern.matches("[a-zA-S]", "T"));
		System.out.println(Pattern.matches("[MS][a-z](5)", "Swathi"));
		System.out.println(Pattern.matches("[xyz]?", "x"));
		System.out.println(Pattern.matches("[xyz]+", "x"));
		System.out.println(Pattern.matches("[xyz]+", "xyyza"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\D", "1"));

	}

}
