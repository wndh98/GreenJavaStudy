package class08_dto;

public class CarEx {
	public static void main(String[] args) {

		Car c1 = new Car("HD", "sonata", Color.SILVER, 3000);
		Car c2 = new Car("Porsche", "911", Color.RED, 12000);
		Car c3 = new Car("Bentley", "gugu", Color.WHITE, 50000);
		Car c4 = new Car("HD", "grandeur", Color.YELLOW, 700);

		Car[] garage = { c1, c2, c3, c4 };

		for (Car c : garage) {
			System.out.println(c);
		}
		System.out.println("------------------------------");

		for (Car c : garage) {
//         if(c.getBrand().equals("HD")) {
			if (c.getPrice() < 15000) {
				System.out.println(c);
			}
		}
	}
}
// 
