package api03_string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizer01 {

	public static void main(String[] args) {
		String txt = "에디슨/안창호/유관순";
		// split
		String[] bp = txt.split("/");
		System.out.println(Arrays.toString(bp));
		System.out.println(bp[2]);

		// 토크나지 객체를 생성하면서 구분자로 /를 사용
		StringTokenizer st = new StringTokenizer(txt, "/");
		System.out.println(st);
		int tokens = st.countTokens();
		System.out.println(tokens);
		for(int i=0;i<tokens;i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("----------");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
	}

}
// 장소 어디로함?