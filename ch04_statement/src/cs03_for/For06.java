package cs03_for;



public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

}
// 처음 시작값이 0인거지 그 반복문은 "j가 5-i보다 작을때까지"(j<5-i) 반복하는거임
// 언더스탠드?
// 
/*
*****
****
***
**
*
*/