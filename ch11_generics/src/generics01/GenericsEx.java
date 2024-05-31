package generics01;

import java.util.ArrayList;
import java.util.List;

class Car {

}

public class GenericsEx {

	public static void main(String[] args) {
		// Generics 없이 list 사용: object 로 처리하므로 모든 타입 사용 가능
		List list = new ArrayList();
		list.add("Hi");
		list.add(7);
		list.add(true);
		list.add(new Car());
		int tmp = 0;
		for (Object obj : list) {
			System.out.println(obj);
//			tmp += (int)obj;
		}
//		System.out.println(tmp);
		
		String str =  (String)list.get(0);
		int sum = tmp + (int)list.get(1);
		
		
		// String만 사용하도록 generics 
		List<String> li = new ArrayList<>();
		
		li.add("hi");
//		li.add(7);
	}

}
