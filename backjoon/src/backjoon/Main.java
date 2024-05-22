package backjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int V=sc.nextInt();
		int C=A-B;
		int cnt=0;
		for(V-=A;V>=0;cnt++) {
			V-=C;
			
		}
		System.out.println(cnt);
		sc.close();
	}

}
