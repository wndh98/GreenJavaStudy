package interface05;

public class StarEx {

	public static void main(String[] args) {
		Tank t = new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		SCV s = new SCV();
		t.hitPoint-=10;
		s.repair(d);
//		s.repair(m);
		s.repair(t);
		t.attack(s);
		s.repair(s);
	}

}
//