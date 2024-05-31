package innterInterface;

public class ButtonEx {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnClickListner(new CallListner());
		btn.touch();
		btn.setOnClickListner(new Button.OnClickListner() {
			@Override
			public void onClick() {
				System.out.println("메세지 보내기");

			}
		});
		btn.touch();
	}

}





