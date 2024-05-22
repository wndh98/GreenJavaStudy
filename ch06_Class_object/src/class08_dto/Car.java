package class08_dto;

public class Car {
	private String brand;
	private String type;
	private Color color;
	private int price;

	public Car(String brand, String type, Color color, int price) {
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;

	}
	String getBrand() {
		return this.brand;
	}
	int getPrice() {
		return this.price;
	}
}
