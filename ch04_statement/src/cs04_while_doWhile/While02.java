package cs04_while_doWhile;

public class While02 {

	public static void main(String[] args) throws InterruptedException {
		int i=11;
		System.out.println("카운트 다운 시작");
		while(i-->0) {
			
			
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("발사");

	}

}
