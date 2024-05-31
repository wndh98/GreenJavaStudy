package api01_object;

class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public boolean equals(Animal obj) {
		if(obj.name==this.name) {
			return true;
		}else {
			return false;
		}
		//return super.equals(obj);
	}
}

public class EqualsEx {

	public static void main(String[] args) {
		int a = 7, b = 7;
		System.out.println(a == b);
		Integer c = new Integer(7);
		System.out.println(a == c);
		Integer d = new Integer(7);
		System.out.println(c == d);// 객체 c의 주소와 객체 d의 주소를 비교함

		String str1 = "봄";
		String str2 = "봄";

		System.out.println(str1 == str2);

		String str3 = new String("봄");

		System.out.println(str1 == str3);
		String str4 = new String("봄");
		System.out.println(str3 == str4);
		System.out.println(((Object) str3).equals(((Object) str4)));

		Animal a1 = new Animal("야옹이");
		Animal a2 = new Animal("야옹이");
		System.out.println(a1 == a2);
		System.out.println(a1.name == a2.name);
		System.out.println(a1.equals(a2));
		

	}

}
