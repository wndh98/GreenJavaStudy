package dataType;

import java.util.Scanner;

//import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// Scanner瑜� �궗�슜�븯�젮硫� 癒쇱� 媛앹껜瑜� �깮�꽦�빐�빞 �븿
		// - data �냼�뒪瑜� system�쓽 inputstream�쑝濡� �젙�븿
		Scanner scan = new Scanner(System.in);
		System.out.println("泥� 踰덉㎏ �젙�닔瑜� �엯�젰�븯�떆�삤.");
		String str = scan.nextLine();
		System.out.println(str);
		int num1 = Integer.parseInt(str);
		System.out.println("�몢 踰덉㎏ �젙�닔瑜� �엯�젰�븯�떆�삤.");
		int num2 = scan.nextInt();
		System.out.println(num2);

//		System.out.println("泥� 踰덉㎏ �엯�젰媛� " + str + " �� �몢踰덉㎏ �엯�젰媛� " + num2 + " �쓽 �빀怨꾨뒗 " + (str + num2) + " �엯�땲�떎.\n");
		System.out.println("泥� 踰덉㎏ �엯�젰媛� " + num1 + " �� �몢踰덉㎏ �엯�젰媛� " + num2 + " �쓽 �빀怨꾨뒗 " + (num1 + num2) + " �엯�땲�떎.\n");
//		System.out.printf("泥� 踰덉㎏ �엯�젰媛� %d �� �몢踰덉㎏ �엯�젰媛� %d �쓽 �빀怨꾨뒗 %d �엯�땲�떎.\n", str, num2, str + num2);
		scan.close();
	}

}
