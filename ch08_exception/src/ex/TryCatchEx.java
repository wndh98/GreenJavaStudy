package ex;

public class TryCatchEx {

	public static void main(String[] args) {
		String[] strArr = {"10","2a"};
		int value =0;
		for(int i=0;i<=2;i++) {
			try {
				value  = Integer.parseInt(strArr[i]);		
				System.out.println(value);
			}catch(NumberFormatException e) {
				e.printStackTrace();
				System.out.println("123");
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("456");
			}
		}

	}

}
