package cs03_for;

public class For01 {
	/*
	for(초기식; 반복 조건; 증감식) {
	   for(시작값; 끝값; step) {
	      수행할 명령;
	   }
	}
	*/

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.printf("%d/",i);
		}
		System.out.println("\n------------------------------");
		for(int i=5;i>0;i--) {
			System.out.printf("%d/",i);
		}
		System.out.println("\n------------------------------");
		for(int i=2;i<11;i+=2) {
			System.out.printf("%d/",i);
		}
		System.out.println("\n------------------------------");
		for(int i=1;i<10;i*=3) {
			System.out.printf("%d/",i);
		}

	}

}
//