package api03_string;

public class String07 {

	public static void main(String[] args) {
		String str = "a";
		str += "b";
		System.out.println(str);
		System.out.println("------------------------");
		StringBuilder sb = new StringBuilder();
		System.out.println("() 버퍼크기: " + sb.capacity());
		StringBuilder sb1 = new StringBuilder("JAVA");
		System.out.println("() 버퍼크기: " + sb1.capacity());
		sb.append("Java");
		System.out.println(sb);
		sb.setCharAt(2, 'k');
		System.out.println(sb);
		StringBuilder sb2 = sb.reverse(); // 얕은 복사
//		StringBuilder sb2 = new StringBuilder(sb.reverse()); // 새 객체 생성
		
		System.out.println(sb);
		System.out.println(sb2);
		sb2.append("1");
		System.out.println(sb);
		System.out.println(sb2);
		
	}

}



