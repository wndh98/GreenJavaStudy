package class01_basic;

public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.eat();
		p1.name="nametest";
		p1.age=38;
		p1.nationality="namtiontest";
		System.out.println(p1.name);
		p1.sayMyName();
		
		Person p2 = new Person();
		p2.eat();
		p2.name="nametest2";
		p2.age=28;
		p2.nationality="namtiontest2";
		System.out.println(p2.name);
		p2.sayMyName();
		Person[] persons= {p1,p2};
		System.out.println("----------------------");
		for(Person p : persons) {
			System.out.println(p.name);
			System.out.println(p.age);
			System.out.println(p.nationality);
			System.out.println("----------------------");
		}
		Car car1 = new Car();
		car1.brand="Çö´ë";
		car1.color="red";
		car1.maxSpeed=100;
		p1.car=car1;
		System.out.println(p1.car.brand);
	}

}
// 