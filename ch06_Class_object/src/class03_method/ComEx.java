package class03_method;

public class ComEx {

	public static void main(String[] args) {
		Computer com1= new Computer();
		com1.owner="고범석";
		com1.useCase("tom");
		com1.power();
		com1.useCase("tom");
		com1.useCase("고범석");
	}

}
