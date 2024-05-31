package api04_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MacherEx {

	public static void main(String[] args) {
		String txt = "http:// This is the text be searched "
	            + "for occurrence of the http:// pattern http:// ";
		String ptn = "http:// ";
		Pattern pattern = Pattern.compile(ptn);
		Matcher matcher = pattern.matcher(txt);
		System.out.println(matcher.matches());
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.find());

	}

}
// 
//

