package lambda02;

import java.util.function.Function;

class Address {
	private String contry;
	private String city;

	public Address(String contry, String city) {
		super();
		this.contry = contry;
		this.city = city;
	}

	public String getContry() {
		return contry;
	}

	public String getCity() {
		return city;
	}
}

class Member {
	private String name;
	private String id;
	private Address address;

	public Member(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}
}

public class Lambda_Function {
	public static void main(String[] args) {
		
		Address addr = new Address("USA", "Texas");
		Member mem = new Member("Tom", "t", addr);
		
		// 각 클래스를 변수로 사용하는 Function 객체 2개와
		// 그 두 객체를 이용해서 값을 얻으려는 Function 객체 1개 선언
		Function<Member, Address> funcA;
		Function<Address, String> funcB;
		Function<Member, String> funcAB;
		// 목표값
		String city;
		funcA = (m) -> m.getAddress();
		funcB = (a) -> a.getCity();
		
		Address a = funcA.apply(mem);
		
		System.out.println(funcB.apply(funcA.apply(mem)));
		
		funcAB = funcA.andThen(funcB);
		System.out.println(funcAB.apply(mem));
		
		funcAB = funcB.compose(funcA);
		System.out.println(funcAB.apply(mem));
	}

}

//
