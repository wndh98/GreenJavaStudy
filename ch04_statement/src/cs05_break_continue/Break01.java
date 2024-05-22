package cs05_break_continue;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop: for(char upper='A' ;upper<='Z';upper++) {
			System.out.println("------------------------------");
			for(char lower = 'a';lower<='z';lower++) {
				if(lower == 'g') {
//					break Loop;
					continue Loop;
				}
				System.out.println(upper + " : " + lower);
			}
		}
	}

}



