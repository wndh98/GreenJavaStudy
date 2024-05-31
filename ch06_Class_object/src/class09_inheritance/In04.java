package class09_inheritance;

class Airlane {

	void takeOff() {
		System.out.println("take off");
	}

	void fly() {
		System.out.println("fly");
	}

	void land() {
		System.out.println("landing");
	}
}

class Supersonic extends Airlane {
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	 int flymode =NORMAL;
	 
	 @Override
	void fly() {
		 if(flymode==SUPERSONIC) {
			 System.out.println("고속이동");
		 }else {
			 super.fly();			 
		 }

	}
	 void flymodeChange() {
		 if(flymode==1) {flymode=2;}
		 else {flymode=1;}
	 }
}

public class In04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airlane a1 = new Airlane();
		a1.takeOff();
		a1.fly();
		a1.land();
		System.out.println("-----------------------------------------");
		Supersonic ss = new Supersonic();
		ss.fly();
		ss.flymode=Supersonic.SUPERSONIC;
		ss.fly();
		ss.flymodeChange();
		ss.fly();
		ss.flymodeChange();
		ss.fly();
	}

}






