package lambda02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda_Consumer {
	public static void main(String[] args) {
		// 람다식으로 인터페이스의 메소드 오버라이딩

		// 매개값 있고, 리턴 없고
		Consumer<Integer> c = i -> System.out.print(i + ", ");
		// 매개값 없고, 리턴 있고
		Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
		// 매개값 있고, 불리언 리턴
		Predicate<Integer> p = i -> i % 2 == 0;
		// 매개값 있고, 리턴 있고: 매개값을 리턴값으로 매핑(타입 변환)
		Function<Integer, Integer> f = i -> i / 10 * 10;// 1의 자리 없애기
		// 매개값 있고, 매개값 연산해서 동일 타입 결과 리턴
		IntBinaryOperator operator = (a, b) -> {
			if (a > b)
				return a;
			else
				return b;
		};
		IntBinaryOperator operator1 = (a, b) -> {
			if (a < b)
				return a;
			else
				return b;
		};

		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list);
		System.out.println(list);
		printEvenNum(p, c, list);

		List<Integer> newList = doSomeThing(f, list);
		System.out.println(newList);
		System.out.println("최대값: " + max(operator, list));
		System.out.println("최소값: " + min(operator1, list));
	}
	
	
	
	private static int min(IntBinaryOperator operator1, List<Integer> list) {
		int result = list.get(0);
		for (int i : list) {
			result = operator1.applyAsInt(result, i);
		}
		return result;
	}

	private static int max(IntBinaryOperator operator, List<Integer> list) {
		int result = list.get(0);
		for (int i : list) {
			result = operator.applyAsInt(result, i);
		}
		return result;
	}

	private static <T> List<T> doSomeThing(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<>(list.size());

		for (T i : list) {
			newList.add(f.apply(i));
		}

		return newList;
	}

	private static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.println("== 짝수만 출력하기 ==");
		for (T i : list) {
			if (p.test(i))
				c.accept(i);
		}
		System.out.println("\n=================");
	}

	private static void makeRandomList(Supplier<Integer> s, List<Integer> list) {
		for (int i = 0; i < 10; i++) {
			list.add(s.get());

		}
	}

}
// 