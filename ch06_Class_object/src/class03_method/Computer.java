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
			System.out.println("��ǻ�Ͱ� �����ֽ��ϴ�.");
		}else {
			if(name.equals(owner)) {
				if(name.equals("�����")) {
					System.out.println("�ν�Ʈ��ũ");
				}else {
					System.out.println("��ǻ�� ����");
				}
			}else {
				System.out.println("����ڰ� �ٸ��ϴ�.");
			}
		}
	}
	
	
}
// 