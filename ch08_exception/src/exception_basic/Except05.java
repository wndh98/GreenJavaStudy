package exception_basic;

public class Except05 {

	public static void main(String[] args) {
//		FileInputStreamTest fis = null;
//		try {
//			fis = new FileInputStreamTest("file.doc");
		// try ~ with ~ resources 구문 : 입출력 를 사용하고 자동으로 닫아줌
		try(FileInputStreamTest fis = new FileInputStreamTest("file.doc")){
			
			fis.read();
			
			throw new Exception();
			
		} catch (Exception e) {
			System.out.println("에러처리");
			e.printStackTrace();
			
		} 
//		finally {
//			try {
//				fis.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		
	}

}
// 


