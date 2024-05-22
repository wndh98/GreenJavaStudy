package class03_method;

public class Computer {
	//field
	boolean power;
	String owner;
	int memory;
	
	public Computer() {
	}
	public Computer(String owner) {
		this.owner = owner;
	}
	//method
	void powerOn() {
		this.power = true;
	}
	void powerOff() {
		this.power = false;
	}
	void power() {
//		this.power=this.power==true? false : true;
		this.power=!power;
	}
	void useCase(String name) {
		if(this.power==false) {
			System.out.println("컴퓨터가 꺼져있습니다.");
		}else {
			if(name.equals(owner)) {
				if(name.equals("고범석")) {
					System.out.println("로스트아크");
				}else {
					System.out.println("컴퓨터 실행");
				}
			}else {
				System.out.println("사용자가 다릅니다.");
			}
		}
	}
	
	
}
// 