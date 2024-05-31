package api04_regex;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {

		String regex = "(02|010)-\\d{3,4}-\\d{4}";
		String phone = "010-1324-3422";
		
		boolean result = Pattern.matches(regex, phone);
		System.out.println(result);
		
		regex = "\\w+@\\w+\\.\\w+";
		
		
	}

}

// 


