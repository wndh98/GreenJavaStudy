package list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL02 {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(5));
		intList.add(new Integer(4));
		intList.add(new Integer(2));
		intList.add(new Integer(3));
		intList.add(new Integer(0));
		intList.add(new Integer(1));

		// subList(): 리스트의 특정 인데스 범위를 리스트로 반환
		List<Integer> intList2 = new ArrayList<>(intList.subList(1, 4));
		print("subList()", intList, intList2);
		// sort(): 리스트 오름차순 정렬
		Collections.sort(intList);
		Collections.sort(intList2);
		print("sort()", intList, intList2);
		// reverse(): 리스트 내림차순 정렬
		Collections.reverse(intList);
		Collections.reverse(intList2);
		print("reverse()", intList, intList2);
	}

	private static void print(String str, ArrayList<Integer> intList, List<Integer> intList2) {
		System.out.printf("----  %s ----\n", str);
		System.out.println(intList);
		System.out.println(intList2);
		System.out.println("--------------------");

	}

}
