package innterInterface;

public class Button {
	
	OnClickListner listner;
	void setOnClickListner(OnClickListner listner) {
		this.listner = listner;
		
	}
	void touch() {
		listner.onClick();
	}
	
	//중첩(nested) 인터페이스 - inner interface
	interface OnClickListner{
		void onClick();
	}
}
