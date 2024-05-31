package interface05;

class Marine extends GroundUnit implements Attackable {

	public Marine() {
		super(30);
		hitPoint = MAX_HP;

	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		u.hitPoint-=5;
	}

	@Override
	public String toString() {
		return "Marine";
	}
}

class Tank extends GroundUnit implements Repairable, Attackable {
	public Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		u.hitPoint-=5;
	}
	@Override
	public String toString() {
		return "Tank";
	}

}

class DropShip extends AirUnit implements Repairable {
	public DropShip() {
		super(100);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "DropShip";
	}
}

class SCV extends GroundUnit implements Repairable {
	public SCV() {
		super(70);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "SCV";
	}

	void repair(Repairable r) {
		Unit u = (Unit) r;
		System.out.println("현재 생명력 : " + u.hitPoint);
		while (u.hitPoint != u.MAX_HP) {
			u.hitPoint++;
			System.out.println(u.hitPoint);
		}
		System.out.println("수리종료");
	}

}
