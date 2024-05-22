package exercise;

public class Ex02 {

	public static void main(String[] args) {
		//4*x + 5*y = 60 식을 만족하는 x와 y의 쌍을 구하시오
		//x, y 값의 범위는 1~10
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

















