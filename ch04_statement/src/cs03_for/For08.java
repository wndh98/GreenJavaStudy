package cs03_for;

public class For08 {

	public static void main(String[] args) {
//      2*1=2 3*1=3 
//      2*2=4 3*2=6
//		System.out.println("구구단");
//		for (int i = 2; i < 10; i++) {
//			System.out.printf(i + "단\t\t");
//		}
//		System.out.println("");
//		for (int i = 1; i < 10; i++) {
//			for (int j = 2; j < 10; j++) {
//				System.out.printf("%d * %d = %2d\t",j,i,i*j);
//			}
//			System.out.println("");
//		}
//		
		for(int i=2;i<10;i++) {
			System.out.printf("%d 단 : ",i);
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d ",i,j,i*j);
			}
			System.out.println("");
		}
	}

}
// 잘못쌓음