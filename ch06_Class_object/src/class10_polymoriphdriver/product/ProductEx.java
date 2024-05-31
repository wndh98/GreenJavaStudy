package class10_polymoriphdriver.product;

public class ProductEx {
	public static void main(String[] args) {
		Customer cs= new Customer();
		TV tv=new TV();
		Computer cp = new Computer();
		
		cs.buy(tv);
		System.out.println(cs.money);
		System.out.println(cs.bonuspoint);
		cs.buy(cp);
		System.out.println(cs.money);
		System.out.println(cs.bonuspoint);
		cs.purchaseList();
		cs.returnProduct(tv);
		cs.purchaseList();
		System.out.println(cs.money);
		System.out.println(cs.bonuspoint);
	}
}
// 