package api03_string;

import java.util.StringTokenizer;

public class StringTokenizer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "사과=500|초콜릿=200|샴페인=300";
		StringTokenizer st = new StringTokenizer(str,"=|",true);
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			if(token.equals("=")) {
				System.out.print("\t");
			}else if(token.equals("|")) {
				System.out.print("\n");
			}else {
				System.out.print(token);
			}
		}
	}

}
