package api08_wrapper;
import java.util.ArrayList;
import java.util.List;

public class IntegerEx {

	public static void main(String[] args) {
		// 기본 데이터 타입
		int num1 = 300;
		int num2 = 300;
		System.out.println(num1 == num2);

		// Wrapper Class: Integer
		Integer it1 = 100; // int it1 = 100;
		Integer it2 = 100;
		Integer num3 = 300;
		Integer num4 = 300;
		Integer it3 = new Integer(100);
		Integer it4 = new Integer(100);

		// 번지 비교
		// -128~127 범위 안에서는 자동 언박싱되어 기본 데이터타입처럼 비교됨
		System.out.println(it1 == it2);
		// -128~127 범위를 벗어나면 번지수 비교시 자동 언박싱 안 됨
		System.out.println(num3 == num4);
		// object로 박싱되어 있음을 알 수 있다.(false)
		System.out.println(it1 == it3);
		System.out.println(it3 == it4);

		// 연산시 자동 언박싱되어 리터럴 변수처럼 바로 값을 취한다.
		System.out.println(it3 + it4);

		// intValue(): unboxing 메소드
		System.out.println(it1.intValue());
		System.out.println(it3.intValue());
		// 언박싱 후에 비교: 값을 이용한 번지수 비교
		System.out.println(it3.intValue() == it4.intValue());

		// 자동 박싱: 들어가면서 자동으로 Integer 객체로 저장
		List<Integer> list = new ArrayList<>();
		list.add(it1);
		list.add(it3);
		list.add(200);

		// 자동 언박싱
		int a = it3;

		String s = "1000";
		int b = Integer.parseInt(s);

	}

}
