package class02_constructor;

public class KoreanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean();
		System.out.println(k1.name);
		Korean k2 = new Korean("test", 10, "m");
		System.out.println(k2.name);
	}

}
