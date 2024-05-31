package lambda;

public class TestAdd {
	public static void main(String[] args) {
		AddCls addCls = new AddCls();
		System.out.println(addCls.add(5, 4));

		Add add = new Add() {
			@Override
			public int add(int x, int y) {
			
				return x + y;
			}
		};
		System.out.println(add.add(1, 2));

		Add lambda_add = (x, y) -> x + y;

		System.out.println(lambda_add.add(1, 2));
	}
}
