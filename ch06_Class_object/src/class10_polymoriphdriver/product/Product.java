package class10_polymoriphdriver.product;

public class Product {
	int price;
	int bonuspoint;
	
	public Product(int price) {
		this.price = price;
		this.bonuspoint = price/10;
	}
}


class TV extends Product{
	public TV() {
		super(100);
		
	}

	@Override
	public String toString() {
		return "TV";
	}
	
	
}
class Computer extends Product{
	public Computer() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
	
	
}
// 