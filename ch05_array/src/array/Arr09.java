package array;

public class Arr09 {

	public static void main(String[] args) {
	
		int[] lotto = new int[45];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		for(int i=0;i<100;i++) {
			int idx=(int)(Math.random()*45);
			int tmp=lotto[i%45];
			lotto[i%45]=lotto[idx];
			lotto[idx]=tmp;
		}
		System.out.println("------------������ �ζ� ��õ ��ȣ -------------------");
		for(int i=0;i<6;i++) {
			System.out.println(lotto[i]);
		}

	}

}

