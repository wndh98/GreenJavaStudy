package interface01;

public class AnimalEx {

	public static void main(String[] args) {
		// 인터페이스는 생성 불가
		//		Animal ani = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal[] animals= {dog,cat};
		for(Animal ani : animals) {
			ani.sound();
		}
		System.out.println("-----------------");
		Animal a1 = new Man();
		Person p1 = new Man();
		a1.sound();
//		a1.smile(); << 불가능
		System.out.println("-------------------");
		p1.sound();
		p1.smile();
	}

}
