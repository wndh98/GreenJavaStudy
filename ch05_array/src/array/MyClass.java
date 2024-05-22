package array;

public class MyClass {

	public static void main(String[] args) {
		String[][] myClass = { { "테스트1" }, { "테스트2", "테스트3", "테스트4", "테스트5" }, { "테스트6", "테스트7", "테스트8" } };
		System.out.println(myClass);
		System.out.println(myClass[0]);
		System.out.println(myClass[1]);
		System.out.println(myClass[2]);
		for (String[] line : myClass) {
			for (String person : line) {
				if (person.charAt(3) != '7') {
					System.out.println(person);
				}
			}
		}
	}

}

// 