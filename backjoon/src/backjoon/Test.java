package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int V=sc.nextInt();
		int cnt=0;
		for(V-=A;V>=0;cnt++) {
			V+=B;
			V-=A;
			
		}
		System.out.println(cnt);
		
		
		sc.close();
	}

}



