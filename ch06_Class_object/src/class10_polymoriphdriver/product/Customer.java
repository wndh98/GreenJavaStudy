package class10_polymoriphdriver.product;

public class Customer {
	int money = 1000;
	int bonuspoint;

	Product[] product = new Product[10];
	int cnt = 0;

	void buy(Product p) {
		if (this.money < p.price) {
			System.out.println("돈부족");
			return;
		}

		this.money -= p.price;
		this.bonuspoint += p.price;
		product[cnt++] = p;
		System.out.println(p + "를 구매했습니다.");

	}
	void purchaseList() {
		for(Product p : product) {
			if(p==null)continue;
			System.out.println(p);
		}
	}
	void returnProduct(Product p) {
		for(int i=0;i<product.length;i++) {
			if(product[i]==p) {
				money+=product[i].price;
				bonuspoint=product[i].bonuspoint;
				product[i]=null;
				return;
			}
		}
	}
	
	
}
// 