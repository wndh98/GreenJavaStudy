package class09_inheritance;

class Circle {

	// 자식이 접근제한자를 강화시킬 수 없다.
//	 public double areaCircle(double r) {
//	      System.out.println("parent method");
//	      return 3.141592 * r * r;
//	 }

	double areaCircle(double r) throws Exception {

		System.out.println("parent method");
		return 3.141592 * r * r;
	}
}

class JavaCircle extends Circle {

	@Override // annotation: 재정의 문법 체크
	 double areaCircle(double r) throws Exception {
		if (r < 0) {
			// 부모에게 없는 익셉션을 발생시킬 수 없다.
			throw new Exception("니네 별로 떠나거라~");
		}
		System.out.println("child method");
		return Math.PI * r * r;
	}
}

public class In06 {

	public static void main(String[] args) {

	}

}


