package exception_basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Except03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		
		try {
			fr = new FileReader("test.txt");
			String str = "abc";
			System.out.println(str.length());
			
			int[] arr = new int[3];
			arr[4] = 30;
			int a=3/0;
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//		}

		finally {
			
			try {
				
				fr.close();
			}catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("live");
	}

}

//
