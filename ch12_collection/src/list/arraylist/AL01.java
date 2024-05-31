package list.arraylist;

import java.util.ArrayList;
import java.util.List;

//*특징
//
//객체를 일렬로 늘어놓는 구조
//인덱스로 관리
//자동 인덱스 부여: 인덱스로 객체를 검색, 삭제 ..
//null도 저장 가능
//
//배열과의 차이점: 크기가 자동으로 관리
//
//
//ArrayList: 하나의 객체가 추가, 삭제될 때 나머지 요소들 전체의 인덱스에 영향
//         검색 속도는 빠르나 중간에 삽입, 삭제될 때는 속도가 느림
//LinkedList: 각 객체는 앞뒤 요소의 인덱스를 갖는다. 삽입, 삭제될 때 앞뒤 요소에만 영향
//         삽입, 삭제가 빈번한 데이터에 활용
//Vector: ArrayList와 같으나 
//      Thread Safe, 자동 싱크로: 한 스레드가 접근하는 동안 다른 스레드의 접근 차단 

public class AL01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// 요소 추가
		list.add("java");
		list.add("JDBC");
		list.add("Java");
		System.out.println(list);
		
		list.add(1,"spirng");
		list.add(2,"db");
		System.out.println(list);
		
		System.out.println("-------------------");
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------");
		System.out.println(list.remove(2));
		if(list.remove("Java")) {
			System.out.println("성공");
			System.out.println(list);
		}
		System.out.println("-------------------");
		System.out.println(list.contains("Java"));
		System.out.println(list.contains("java"));
		System.out.println("-------------------");
		System.out.println(list);
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
	}
}
