package array;

public class MyClass {

	public static void main(String[] args) {
		String[][] myClass = { { "�׽�Ʈ1" }, { "�׽�Ʈ2", "�׽�Ʈ3", "�׽�Ʈ4", "�׽�Ʈ5" }, { "�׽�Ʈ6", "�׽�Ʈ7", "�׽�Ʈ8" } };
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