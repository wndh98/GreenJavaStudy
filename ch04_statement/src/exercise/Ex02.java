package exercise;

public class Ex02 {

	public static void main(String[] args) {
		//4*x + 5*y = 60 ���� �����ϴ� x�� y�� ���� ���Ͻÿ�
		//x, y ���� ������ 1~10
		for(int x=-10;x<=100;x++) {
			for(int y=-10;y<=100;y++) {
				if(x*4+5*y==60) {
					System.out.println("x : " + x + " | y : " + y);
					break;
				}
			}
		}
	}

}

















