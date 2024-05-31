package exception_basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except01 {

	public static void main(String[] args) throws InterruptedException{
		
		// 익셉션 처리의 가지 방법 : throws / try~catch~finally
		

		Scanner sc = new Scanner(System.in);
		while (true) {
			int[] numArr = new int[2];
			System.out.println("정수를 하나 입력해주세요.");

			try {
				int input = sc.nextInt(); // input MismatchException
//				String tmp = sc.nextLine();
				// numArr[0] = Integer.parseInt(tmp); // NumberFormatException
//				numArr[2] = Integer.parseInt(tmp); // ArrayIndexOutOfBoundsException
			} catch (RuntimeException e) {
				System.out.println(e);
				sc.next();
			}
//			catch (InputMismatchException e) {
//				System.out.println(e);
//				sc.next();
//			} catch (NumberFormatException e) {
//				System.out.println(e);
//			} catch (ArrayIndexOutOfBoundsException e) {
//				e.printStackTrace();
////				System.out.println(e.getMessage());
//			} 
			finally {
				System.out.println("무조건 실행");
			}
		}
//		sc.close();
	}

}
