package abstract01;

public class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog("dog");
		Cat cat = new Cat("cat");
		Frog frog= new Frog("frog");
		Animal[] animals = {dog,cat,frog};

		for(Animal ani : animals) {
			ani.breathe();
			ani.sound();
		}
		
		
	}

}
