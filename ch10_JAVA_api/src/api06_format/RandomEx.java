package api06_format;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		Random rd = new Random();

		System.out.println("int형 난수 발생 : " + rd.nextInt());
		System.out.println("float형 난수 발생 : " + rd.nextFloat());
		System.out.println("double형 난수 발생 : " + rd.nextDouble());
		System.out.println("long형 난수 발생 : " + rd.nextLong());
		System.out.println("bolean형 난수 발생 : " + rd.nextBoolean());

		// 0~9사이의 random값 추출
		int rnum = rd.nextInt(9);
		System.out.println(rnum);
		
		
		
		
	}

}
