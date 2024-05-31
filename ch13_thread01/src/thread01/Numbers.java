package thread01;

public class Numbers{
	
	

	void list(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.printf("(%d)", i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
